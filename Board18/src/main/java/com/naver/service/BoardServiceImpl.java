package com.naver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.repository.BoardDAO;
import com.naver.repository.ReplyDAO;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO bdao;
	
	@Autowired
	private ReplyDAO rdao;
	
	@Override
	public List<BoardVO> list() {
		return bdao.list();
	}
	
	@Override
	public void insert(BoardVO vo) {
		bdao.insert(vo);
	}
	
	@Override
	public BoardVO read(int bno) {
		bdao.updateReadCnt(bno);
		return bdao.read(bno);
	}
	
	@Override
	public BoardVO updateui(int bno) {
		return bdao.updateui(bno);
	}
	
	@Override
	public void update(BoardVO vo) {
		bdao.update(vo);
	}
	
	@Override
	public PageTO listpage(PageTO to) {
		int amount = bdao.getAmount();
		to.setAmount(amount);
		List<BoardVO> list = bdao.getListpage(to);
		to.setList(list);
		return to;
	}
	
	@Override
	public void delete(int bno) {
		rdao.deleteByBno(bno);
		bdao.delete(bno);
	}
}
