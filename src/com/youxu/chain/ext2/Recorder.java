package com.youxu.chain.ext2;

/**
 * 域名解析记录
 */
public class Recorder {
    private String domain;
    private String ip;
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("域名：").append(this.domain).append("\nIP地址").append(this.ip).append("\n解析者：").append(this.owner);
        return sb.toString();
    }
}
