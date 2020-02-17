package com.naver.service;

import java.util.List;

import com.naver.dto.MemberDTO;

public interface MemberService {
	public abstract void getTime();
	public abstract List<MemberDTO> getList();
	public abstract void insert(MemberDTO dto);
	public abstract MemberDTO read(String id);
	public abstract MemberDTO updateui(String id);
	public abstract void update(MemberDTO dto);
	public abstract void delete(String id);
}
