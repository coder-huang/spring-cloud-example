package com.distinct.consul.consumer;

import com.distinct.voucher.service.VoucherClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author markhuang
 * @since 2018/12/20 11:33
 */
@FeignClient(name = "service-producer", path = "/vouchers", fallbackFactory = HystrixClientFallbackFactory.class)
public interface ConsumerVoucherClient extends VoucherClient {
}
