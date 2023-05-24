package com.game_coin.payment.service;

import java.util.List;

import com.game_coin.payment.dto.GameCoinOfferRequest;
import com.game_coin.payment.dto.GameCoinOfferResponse;

public interface GameCoinOfferService {

    List<GameCoinOfferResponse> getAll();

    GameCoinOfferResponse getById(Long id);

    GameCoinOfferResponse create(GameCoinOfferRequest request);

    GameCoinOfferResponse update(GameCoinOfferRequest request, Long id);

    void delete(Long id);

}
