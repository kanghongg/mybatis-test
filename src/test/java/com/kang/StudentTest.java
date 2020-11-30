package com.kang;

import com.kang.entity.Student;
import com.kang.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @author khl
 * @version 2020年11月30日
 * @since
 **/
public class StudentTest {
    private static SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAdd() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student(1, "test", 100D);
        int add = studentMapper.add(student);
        System.out.println(add);
    }

    @Test
    public void testSelectById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selecById(10);
        System.out.println(student);
    }
}
