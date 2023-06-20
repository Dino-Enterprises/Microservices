package com.guide.guides.repository;


import com.guide.guides.entity.DetailGuide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DetailGuideRepository extends JpaRepository<DetailGuide, Long> {
    Optional<DetailGuide> getDetailGuideById(Long id);

    List<DetailGuide> findAllByGuideId(Long id);
}
