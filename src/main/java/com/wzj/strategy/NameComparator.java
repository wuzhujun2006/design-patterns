package com.wzj.strategy;

import java.util.Comparator;

/**
 * @Author: wzj
 * @Date: 2020/5/6 21:19
 * @Desc: 姓名比较器
 */
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().charAt(0) - o2.getName().charAt(0);
    }
}
