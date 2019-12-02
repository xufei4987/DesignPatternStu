package com.youxu.adapter;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        return "lisi";
    }

    @Override
    public String getUserAddr() {
        return "changsha";
    }

    @Override
    public String getMobilePhone() {
        return "13500212222";
    }

    @Override
    public String getOfficeTelNum() {
        return "0755-33012252";
    }

    @Override
    public String getJobPosition() {
        return "CEO";
    }

    @Override
    public String getHomeTelNum() {
        return "485845461";
    }
}
