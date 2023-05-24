package com.game_coin.payment.service;


import com.game_coin.payment.dto.OrdeDetailGameCoinPayment;
import com.game_coin.payment.dto.OrderDetailGameCoinRequest;
import com.game_coin.payment.dto.OrderDetailGameCoinResponse;
import com.game_coin.payment.dto.OrderDetailSimpleResponse;

import java.util.List;

public interface OrderDetailGameCoinService {

    List<OrderDetailSimpleResponse> getAll();

    OrdeDetailGameCoinPayment create(OrderDetailGameCoinRequest request);

    OrderDetailGameCoinResponse getAllByOrderId(Long id);

    void deleteByOrderId(Long id);

}
