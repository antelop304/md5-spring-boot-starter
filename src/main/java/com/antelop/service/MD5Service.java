package com.antelop.service;

import com.antelop.util.MD5Util;

/**
 * Created by zhanls on 2019/3/18.
 */
public class MD5Service {

    public String getMD5(String input) {
        return MD5Util.getMD5(input.getBytes());
    }
}
