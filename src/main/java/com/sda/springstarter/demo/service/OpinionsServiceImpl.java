package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.OpinionsService;
import com.sda.springstarter.demo.model.Opinions;
import com.sda.springstarter.demo.repository.OpinionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionsServiceImpl implements OpinionsService {

    @Autowired
    private OpinionsRepository opinionsRepository;

    @Override
    public List<Opinions> getAllOpinions() {
        return opinionsRepository.findAll();
    }

    @Override
    public void saveOpinions(Opinions opinions) {
        opinionsRepository.save(opinions);
    }
}
