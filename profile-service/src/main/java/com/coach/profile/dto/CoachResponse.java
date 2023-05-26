package com.coach.profile.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * This is a Java class representing a coach response object with various properties such as ID,
 * points, username, name, description, password, email, number, created date, birthday, and game ID.
 */
@Data
public class CoachResponse {
    private Long id;

    private Long points;

    private String username;

    private String nameCoach;

    private String description;

  

    private String number;

    private String lastName;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date createdDate;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    private Long gameId;
}
