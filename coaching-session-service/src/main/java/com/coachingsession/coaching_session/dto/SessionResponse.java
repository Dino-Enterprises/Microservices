package com.coachingsession.coaching_session.dto;

import com.coachingsession.coaching_session.models.Coach;
import com.coachingsession.coaching_session.models.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class SessionResponse {
    private Long id;
    private String name;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date startDate;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date endDate;
    private Boolean available;
    private Coach coach;
    private User user;
}
