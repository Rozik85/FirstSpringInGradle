package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Shops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsRepository extends JpaRepository<Shops, Long> {
}
