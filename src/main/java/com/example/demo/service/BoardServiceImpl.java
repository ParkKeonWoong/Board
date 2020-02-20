package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.BoardDao;
import com.example.demo.dao.BoardDaoImpl;
import com.example.demo.vo.BoardVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * BoardServiceImpl
 */
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

    @Override
    public void write(BoardVO boardVO) throws Exception {
        boardDao.write(boardVO);
    }

    @Override
    public List<BoardVO> list() throws Exception {
        return boardDao.list();
    }
    
    
}