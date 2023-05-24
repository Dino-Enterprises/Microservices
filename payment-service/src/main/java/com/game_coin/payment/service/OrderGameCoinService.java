package com.game_coin.payment.service;


import com.game_coin.payment.dto.OrderGameCoinRequest;
import com.game_coin.payment.dto.OrderGameCoinResponse;

import java.util.List;

public interface OrderGameCoinService {
    List<OrderGameCoinResponse> getAll();

    OrderGameCoinResponse getById(Long id);

    OrderGameCoinResponse create(OrderGameCoinRequest request);

    OrderGameCoinResponse update(OrderGameCoinRequest request, Long id);

    void delete(Long id);
}
