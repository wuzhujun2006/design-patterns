package com.wzj.strategy;

import java.util.Comparator;

/**
 * @Author: wzj
 * @Date: 2020/5/6 21:19
 * @Desc: 年龄比较器
 */
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
