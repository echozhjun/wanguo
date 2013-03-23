package com.github.wangguo.web.module.screen;

import com.alibaba.citrus.turbine.Context;

/**
 * Created with IntelliJ IDEA.
 * User: echo
 * Date: 13-3-23
 * Time: ионГ10:04
 * To change this template use File | Settings | File Templates.
 */
public class Index {

    public void execute(Context context) {
        context.put("content", "Hello world!");
    }

}
