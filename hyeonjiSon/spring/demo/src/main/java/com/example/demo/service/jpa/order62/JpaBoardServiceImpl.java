package com.example.demo.service.jpa.order62;

import com.example.demo.entity.jpa.JpaBoard;
import com.example.demo.repository.jpa.order62.JpaBoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class JpaBoardServiceImpl implements JpaBoardService {

    @Autowired
    JpaBoardRepository repository;

    @Override
    public void register(JpaBoard board) {
        repository.save(board);
    }

    @Override
    public List<JpaBoard> list() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
    }

    @Override
    public JpaBoard read(Integer boardNo) {
        Optional<JpaBoard> maybeReadBoard = repository.findById(Long.valueOf(boardNo));
//Optional: null일 수도 있는 객체를 감싸는 일종의 Wrapper 클래스
        /*
        optional 변수 내부에는 null이 아닌 T 객체가 있을 수도 있고 null이 있을 수도 있습니다.
        따라서, Optional 클래스는 여러 가지 API를 제공하여 null일 수도 있는 객체를 다룰 수 있도록 돕습니다
         */
        if (maybeReadBoard.equals(Optional.empty())) {
            log.info("Can't read board!");
            return null;
        }

        return maybeReadBoard.get();
    }

    @Override
    public void modify(JpaBoard board) {
        repository.save(board);
    }

    @Override
    public void remove(Integer boardNo) {
        repository.deleteById(Long.valueOf(boardNo));
    }
}