package com.distinct.voucher.service;

import com.distinct.voucher.dto.VoucherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author markhuang
 * @since 2018/12/20 11:22
 */

public interface VoucherClient {

    @GetMapping("{id}")
    VoucherDTO getById(@PathVariable("id") Integer id);
}
