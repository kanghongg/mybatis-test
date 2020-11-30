package com.kang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author khl
 * @version 2020年11月30日
 * @since
 **/
@AllArgsConstructor
@Data
public class Student {
    private Integer id;
    private String name;
    private Double sal;
}
