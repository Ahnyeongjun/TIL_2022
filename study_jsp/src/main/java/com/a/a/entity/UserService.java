package com.a.a.entity;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.apache.ibatis.session.SqlSession;

public class UserService {
	
	private SqlSession sqlSession;
	// setter
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public User selectAllMemberList() throws DataAccessException {
		User membersList = null;
		// 주입된 sqlSession 빈으로 selectList() 메소드를 호출
		// Sql문에 id를 전달한다

		membersList = sqlSession.selectOne("mapper.user.selectAllMemberList");
		
		return membersList;
	}
}
