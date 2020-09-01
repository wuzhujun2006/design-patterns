package com.wzj.asm;

import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.Opcodes.*;

/**
 * @Author: wzj
 * @Date: 2020/8/5 21:26
 * @Desc: 生成一个类
 */
public class ClassWriterTest {
    public static void main(String[] args) throws Exception {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_8, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE,
                "pkg/Comparable", null, "java/lang/Object",
                null);
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "LESS", "I",
                null, -1).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "EQUAL", "I",
                null, 0).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "GREATER", "I",
                null, 1).visitEnd();
        cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "compareTo",
                "(Ljava/lang/Object;)I", null, null).visitEnd();
        cw.visitEnd();
        byte[] b = cw.toByteArray();

        MyClassLoader myClassLoader = new MyClassLoader();
        Class c = myClassLoader.defineClass("pkg.Comparable", b);
        System.out.println(c.getMethods()[0].getName());

        String path = (String)System.getProperties().get("user.dir");
        File f = new File(path + "/com/wzj/asm/");
        f.mkdirs();
        FileOutputStream fos = new FileOutputStream(new File(path + "/com/wzj/asm/Comparable.class"));
        fos.write(b);
    }
}
