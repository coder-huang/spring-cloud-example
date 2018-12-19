package com.distinct.consul.consumer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author markhuang
 * @since 2018/12/19 17:44
 */
@RestController
public class ServiceController {

    @Resource
    private LoadBalancerClient loadBalancerClient;
    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/services")
    public Object services() {

        return discoveryClient.getInstances("service-producer");
    }

    @RequestMapping("/discover")
    public Object discover() {

        return loadBalancerClient.choose("service-producer").getUri().toString();
    }

    @RequestMapping("/call")
    public String call() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-producer");
        System.out.println("service address: " + serviceInstance.getUri());
        System.out.println("service name: " + serviceInstance.getServiceId());

        return new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello", String.class);
    }
}
