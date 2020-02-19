package com.example.demo.dao;

import com.example.demo.vo.BoardVO;

/**
 * BoardDao
 */
public interface BoardDao {

    public void write(BoardVO boardVO) throws Exception;
}