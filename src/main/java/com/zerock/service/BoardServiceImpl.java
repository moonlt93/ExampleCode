package com.zerock.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.domain.BoardVO;
import com.zerock.domain.Criteria;
import com.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

//@Component
@Service
@AllArgsConstructor
@Log4j
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;
	
	/*
	//@Autowired
	public BoardServiceImpl(BoardMapper mapper) {
		this.mapper = mapper;
	}
	*/
	
	// mapper.read(33);
	
	@Override
	public void register(BoardVO board) {
		mapper.insertSelectKey(board);
	}
	
	/*
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}
	*/
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		return mapper.getListWithPaging(cri);
	}
	
	@Override
	public BoardVO get(Long bno) {
		return mapper.read(bno);
	}
	
	@Override
	public boolean remove(Long bno) {
		return mapper.delete(bno) == 1;
	}
	
	@Override
	public boolean modify(BoardVO board) {
		return mapper.update(board) == 1;
	}
	
	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotalCount(cri);
	}
	
	
}






