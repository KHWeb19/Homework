package com.example.demo.service;

import com.example.demo.entity.Score;

import java.util.List;

public interface ScoreService {
    void register(Score score);
    List<Score> list ();
    Score read(Integer studentNo);
    void delete(Integer studentNo);
    void update(Score score);

    //-------
    List<Score> listAvg();
}
