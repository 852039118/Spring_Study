package com.warren.dao;

import com.warren.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//继承了SqlSessionDaoSupport就可以直接获取sqlSession
public class UserMapperImpl2 extends SqlSessionDaoSupport implements  UserMapper {
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        return userList;
    }
}
