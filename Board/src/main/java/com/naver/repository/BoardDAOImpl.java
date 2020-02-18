package com.naver.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	private final String NS = "com.naver.board";
	
	@Override
	public List<BoardVO> list() {
		return session.selectList(NS+".list");
	}
	
	@Override
	public void insert(BoardVO vo) {
		session.insert(NS+".insert", vo);
	}
	
	@Override
	public void updateReadCnt(int bno) {
		session.update(NS+".updateReadCnt", bno);
	}
	
	@Override
	public BoardVO read(int bno) {
		return session.selectOne(NS+".read", bno);
	}
	
	@Override
	public BoardVO updateui(int bno) {
		return session.selectOne(NS+".updateui",bno);
	}
	
	@Override
	public void update(BoardVO vo) {
		session.update(NS+".update", vo);
	}

}
