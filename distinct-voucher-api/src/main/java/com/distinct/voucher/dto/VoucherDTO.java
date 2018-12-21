package com.distinct.voucher.dto;

import java.math.BigDecimal;

/**
 * @author markhuang
 * @since 2018/12/20 11:22
 */
public class VoucherDTO {

    private Integer id;

    private String code;

    private BigDecimal price;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VoucherDTO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
