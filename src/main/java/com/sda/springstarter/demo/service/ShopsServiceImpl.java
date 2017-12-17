package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.ShopsService;
import com.sda.springstarter.demo.model.Shops;
import com.sda.springstarter.demo.repository.ShopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopsServiceImpl implements ShopsService {

    @Autowired
    private ShopsRepository shopsRepository;

    @Override
    public List<Shops> getAllShops() {
        return shopsRepository.findAll();
    }

    @Override
    public void saveShops(Shops shops) {
        shopsRepository.save(shops);
    }
}
