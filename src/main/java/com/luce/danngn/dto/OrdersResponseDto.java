package com.luce.danngn.dto;

import com.luce.danngn.domain.orders.Orders;

public class OrdersResponseDto {

    private Long seq;
    private String date;
    private String saleUsrID;
    private String ctgCD;
    private String title;
    private String contents;
    private Integer amount;
    private String regUsrID;
    private String chgUsrID;

    public OrdersResponseDto(Orders entity) {
        this.seq = entity.getSeq();
        this.date = entity.getDate();
        this.saleUsrID = entity.getSaleUsrID();
        this.ctgCD = entity.getCtgCD();
        this.contents = entity.getContents();
        this.amount = entity.getAmount();
        this.regUsrID = entity.getRegUsrID();
        this.chgUsrID = entity.getChgUsrID();
    }

}
