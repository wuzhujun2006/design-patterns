package com.wzj.proxy.v10;

/**
 * @Author: wzj
 * @Date: 2020/8/7 21:57
 * @Desc:
 */
public class TargetImpl implements Target {

    @Override
    public int test(int i) {
        return i + 1;
    }
}
