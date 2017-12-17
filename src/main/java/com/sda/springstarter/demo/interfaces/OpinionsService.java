package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Opinions;

import java.util.List;

public interface OpinionsService {
    List<Opinions> getAllOpinions();
    void saveOpinions (Opinions opinions);
}
