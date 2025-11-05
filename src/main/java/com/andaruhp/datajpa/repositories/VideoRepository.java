package com.andaruhp.datajpa.repositories;

import com.andaruhp.datajpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
