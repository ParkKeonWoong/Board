package com.example.demo.service;

import com.example.demo.vo.BoardVO;

/**
 * BoardService
 */
public interface BoardService {

    public void write(BoardVO boardVO) throws Exception;
}