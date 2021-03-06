package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Opinions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionsRepository extends JpaRepository<Opinions, Long> {
    public Opinions findById(int id);
    public Opinions findByNick(String nick);
}
