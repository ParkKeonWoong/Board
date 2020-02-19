package com.example.demo.service;

import com.example.demo.dao.BoardDao;
import com.example.demo.vo.BoardVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BoardServiceImpl
 */
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao dao;

	@Override
	public void write(BoardVO boardVO) throws Exception {
        dao.write(boardVO);
	}
    
    
}