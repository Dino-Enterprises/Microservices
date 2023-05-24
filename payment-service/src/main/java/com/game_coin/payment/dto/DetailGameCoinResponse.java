package com.game_coin.payment.dto;

import com.game_coin.payment.model.GameCoin;
import lombok.Data;

@Data
public class DetailGameCoinResponse {
    private Long quantify;
    private Long gameCoinId;
    private Double subtotal;
    private GameCoin gameCoin;
}
