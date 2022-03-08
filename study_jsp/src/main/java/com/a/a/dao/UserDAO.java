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
		// ���Ե� sqlSession ������ selectList() �޼ҵ带 ȣ��
		// Sql���� id�� �����Ѵ�

		membersList = sqlSession.selectOne("mapper.user.selectAllMemberList");
		
		return membersList;
	}
}
