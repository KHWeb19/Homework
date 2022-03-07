package com.example.demo.service;

import com.example.demo.entity.ScoreAver;

import java.util.List;

public interface ScoreAverService {
    public void register (ScoreAver scoreaver);
    public List<ScoreAver> list ();
    public ScoreAver read (Integer scoreNo);
    public void modify (ScoreAver scoreaver);
    public void remove (Integer scoreNo);
}
