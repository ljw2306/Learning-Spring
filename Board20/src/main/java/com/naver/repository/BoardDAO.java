package com.naver.repository;

import java.util.List;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;

public interface BoardDAO {
	public abstract List<BoardVO> list();
	public abstract void insert(BoardVO vo);
	public abstract BoardVO read(int bno);
	public abstract void updateReadCnt(int bno);
	public abstract BoardVO updateui(int bno);
	public abstract void update(BoardVO vo);
	public abstract int getAmount();
	public abstract List<BoardVO> getListpage(PageTO to);
	public abstract void delete(int bno);
	public abstract void addAttach(String filename, int bno);
	public abstract List<String> getAttach(int bno);
}
