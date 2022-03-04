package com.example.demo.service;

import com.example.demo.entity.Score;
import com.example.demo.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    private ScoreRepository scoreRepository;

    @Override
    public void register(Score score) {
        scoreRepository.register(score);
    }

    @Override
    public List<Score> list() {
        return scoreRepository.list();
    }

    @Override
    public Score read(Integer studentNo) {
        return scoreRepository.read(studentNo);
    }

    @Override
    public void delete(Integer studentNo) {
        scoreRepository.delete(studentNo);
    }

    @Override
    public void update(Score score) {
        scoreRepository.update(score);
    }

    @Override
    public List<Score> listAvg() {
        return scoreRepository.listAvg();
    }
}
