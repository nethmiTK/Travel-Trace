package com.project.TravelTrace.repository;
import com.project.TravelTrace.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContentRepository  extends JpaRepository<Content, Long> {
}
