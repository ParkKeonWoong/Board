package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.BoardVO;

/**
 * BoardDao
 */
public interface BoardDao {

    public void write(BoardVO boardVO) throws Exception;

    public List<BoardVO> list() throws Exception;

    public BoardVO read(int bno) throws Exception;
}