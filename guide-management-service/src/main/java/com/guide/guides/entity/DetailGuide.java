package com.guide.guides.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_detail_guides")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    @Column(name = "video_url")
    private String videoUrl;

    private Long position;

    @Column(name = "guide_id")
    private Long guideId;
}
