package com.example.demo.service;

import com.example.demo.entity.ScoreAver;
import com.example.demo.repository.ScoreAverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAverServiceImpl implements ScoreAverService {

    @Autowired
    ScoreAverRepository repository;

    @Override
    public void register(ScoreAver scoreaver) {
        repository.create(scoreaver);
    }

    @Override
    public List<ScoreAver> list() {
        return repository.list();
    }

    @Override
    public ScoreAver read(Integer scoreNo) {
        return repository.read(scoreNo);
    }

    @Override
    public void modify(ScoreAver scoreaver) {
        repository.update(scoreaver);
    }

    @Override
    public void remove(Integer scoreNo) {
        repository.delete(scoreNo);
    }

    /*@Override
    public void register(Board board) {
        repository.create(board);
    }

    @Override
    public List<Board> list() {
        return repository.list();
    }

    @Override
    public Board read(Integer boardNo) {
        return repository.read(boardNo);
    }

    @Override
    public void modify(Board board) {
        repository.update(board);
    }

    @Override
    public void remove(Integer boardNo) {
        repository.delete(boardNo);
    }*/
}
