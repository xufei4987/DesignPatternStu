package com.youxu.adapter;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map<String,String> baseInfo = super.getUserBaseInfo();
    private Map<String,String> homeInfo = super.getUserHomeInfo();
    private Map<String,String> officeInfo = super.getUserOfficeInfo();
    @Override
    public String getUserName() {
        return baseInfo.get("userName");
    }

    @Override
    public String getUserAddr() {
        return homeInfo.get("userAddr");
    }

    @Override
    public String getMobilePhone() {
        return baseInfo.get("mobilePhone");
    }

    @Override
    public String getOfficeTelNum() {
        return officeInfo.get("officeTelNum");
    }

    @Override
    public String getJobPosition() {
        return officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNum() {
        return homeInfo.get("homeTelNum");
    }
}
