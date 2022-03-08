package com.a.a.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.a.a.vo.UserVO;

import org.apache.ibatis.session.SqlSession;

public class UserDAO {
	
	private SqlSession sqlSession;
	// setter
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public UserVO selectAllMemberList() throws DataAccessException {
		UserVO membersList = null;
		// 주입된 sqlSession 빈으로 selectList() 메소드를 호출
		// Sql문에 id를 전달한다

		membersList = sqlSession.selectOne("mapper.user.selectAllMemberList");
		
		return membersList;
	}
}
