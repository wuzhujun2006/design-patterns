package com.wzj.strategy;

import java.util.Arrays;

/**
 * @Author: wzj
 * @Date: 2020/5/6 21:24
 * @Desc:
 */
public class TestComparator {
    public static void main(String[] args) {
        Student s1 = new Student(18, "zhangsan");
        Student s2 = new Student(15, "lisi");
        Student s3 = new Student(10,"wangwu");
        Student[] students = {s1, s2, s3};
        System.out.print("数组排序前：");
        printArray(students);
        System.out.println();
        Arrays.sort(students);
        System.out.print("数组通过Comparable接口排序后：");
        printArray(students);
        System.out.println();
        Arrays.sort(students, new AgeComparator());
        System.out.print("数组通过年龄比较器AgeComparator排序后：");
        printArray(students);
        System.out.println();
        Arrays.sort(students, new NameComparator());
        System.out.print("数组通过姓名比较器NameComparator排序后：");
        printArray(students);

    }

    public static void printArray (Student[] students) {
        for (Student student : students) {
            System.out.print(student.toString() + ",");
        }
    }
}
