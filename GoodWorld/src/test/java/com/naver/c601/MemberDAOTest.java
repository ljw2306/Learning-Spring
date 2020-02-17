package com.naver.c601;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.naver.repository.MemberDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Autowired
	private MemberDAO mdao;
	
	@Test
	public void testGetTime() {
		System.out.println(mdao.getTime());
	}
	
	@Test
	public void testGetList() {
		System.out.println(":::::::::::::");
		System.out.println(mdao.getList());
		System.out.println(":::::::::::::");
	}
	

}
