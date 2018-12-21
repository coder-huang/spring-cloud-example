package com.distinct.consul.consumer;

import com.distinct.voucher.dto.VoucherDTO;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author markhuang
 * @since 2018/12/20 15:51
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<ConsumerVoucherClient> {

    private static final Logger log = LoggerFactory.getLogger(HystrixClientFallbackFactory.class);

    @Override
    public ConsumerVoucherClient create(Throwable throwable) {

        log.error("异常信息: {}", throwable.getMessage());

        return id -> new VoucherDTO();
    }
}
