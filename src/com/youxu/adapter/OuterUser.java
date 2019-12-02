package com.youxu.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String,String> map = new HashMap();
        map.put("userName","zhansan");
        map.put("mobilePhone","13500313052");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String,String> map = new HashMap();
        map.put("jobPosition","CTO");
        map.put("officeTelNum","0755-33013301");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String,String> map = new HashMap();
        map.put("userAddr","shenzhen");
        map.put("homeTelNum","497949495");
        return map;
    }
}
