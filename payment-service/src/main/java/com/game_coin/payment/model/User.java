package com.game_coin.payment.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;

    private Long points;

    private String name;

    private String lastName;

    @JsonFormat(pattern = "yyyy/MM/dd", shape = Shape.STRING)
    private Date createdDate;
}
