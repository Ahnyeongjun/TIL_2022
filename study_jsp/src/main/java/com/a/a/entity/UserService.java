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
		// ���Ե� sqlSession ������ selectList() �޼ҵ带 ȣ��
		// Sql���� id�� �����Ѵ�

		membersList = sqlSession.selectOne("mapper.user.selectAllMemberList");
		
		return membersList;
	}
}
