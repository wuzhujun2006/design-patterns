package com.wzj.asm;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;

import static aj.org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;


/**
 * @Author: wzj
 * @Date: 2020/9/1 21:10
 * @Desc: 类方法增强
 */
public class ClassTransformedTest {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(
                ClassPrinter.class.getClassLoader().getResourceAsStream("com/wzj/asm/Apple.class"));

        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4, cw) {
            //增强secKill方法, 在方法里加入时间代理
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                return new MethodVisitor(ASM4, mv) {
                    @Override
                    public void visitCode() {
                        if(name.equals("secKill")) {
                            visitMethodInsn(INVOKESTATIC, "com/wzj/asm/TimeProxy","before", "()V", false);
                            super.visitCode();
                        }
                    }
                };
            }
        };


        cr.accept(cv, 0);
        byte[] b2 = cw.toByteArray();

        MyClassLoader cl = new MyClassLoader();
        Class c2 = cl.defineClass("com.wzj.asm.Apple", b2);
        c2.getConstructor().newInstance();


        String path = (String)System.getProperties().get("user.dir");
        File f = new File(path + "/com/wzj/asm/");

        if(!f.exists()) {
            f.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(new File(path + "/com/wzj/asm/Apple.class"));
        fos.write(b2);
        fos.flush();
        fos.close();

    }
}
