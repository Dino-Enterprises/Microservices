package com.game_coin.payment.model;

import lombok.Data;

@Data
public class GameCoin {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Boolean avaible;
}
