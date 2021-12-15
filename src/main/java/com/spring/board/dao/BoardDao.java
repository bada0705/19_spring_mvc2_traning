package com.spring.board.dao;

import java.util.List;

import com.spring.board.dto.BoardDto;

public interface BoardDao {

	public void insert(BoardDto bdto) throws Exception;
	public List<BoardDto> selectAll() throws Exception;
	public BoardDto selectOne(int num) throws Exception;
	public BoardDto validateUserCheck(BoardDto bdto) throws Exception;
	public void update(BoardDto bdto) throws Exception;
	
	public void increaseReadCount(int num) throws Exception;
	public void delete(int num) throws Exception;
	
}
