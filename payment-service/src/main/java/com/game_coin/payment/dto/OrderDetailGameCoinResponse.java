package com.game_coin.payment.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDetailGameCoinResponse {
    List<DetailGameCoinResponse> lCoinResponses;
    private Long userId;
    private OrderGameCoinResponse orderGameCoinResponse;
    private Double total;
}
