package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.BoardVO;

/**
 * BoardService
 */
public interface BoardService {

    public void write(BoardVO boardVO) throws Exception;
    public List<BoardVO> list()throws Exception;
    public BoardVO read(int bno) throws Exception;
}