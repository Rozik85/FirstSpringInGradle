package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Shops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsRepository extends JpaRepository<Shops, Long> {
    public Shops findById(int id);
    public Shops findByName(String name);
    public Shops findByCity(String city);
}
