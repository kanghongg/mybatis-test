package com.kang.mapper;

import com.kang.entity.Student;

/**
 * @author khl
 * @version 2020年11月30日
 * @since
 **/
public interface StudentMapper {
    int add(Student student);
    Student selecById(Integer id);
}
