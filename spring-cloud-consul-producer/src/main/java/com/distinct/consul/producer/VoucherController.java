package com.distinct.consul.producer;

import com.distinct.voucher.dto.VoucherDTO;
import com.distinct.voucher.service.VoucherClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author markhuang
 * @since 2018/12/20 11:26
 */
@RestController()
@RequestMapping("vouchers")
public class VoucherController implements VoucherClient {

    @Override
    public VoucherDTO getById(@PathVariable Integer id) {

        VoucherDTO voucher = new VoucherDTO();
        voucher.setId(id);
        return voucher;
    }
}
