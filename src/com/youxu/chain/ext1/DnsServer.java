package com.youxu.chain.ext1;

import java.util.Random;

/**
 * DNS服务器
 */
public abstract class DnsServer {
    private DnsServer upperServer;
    //域名解析
    public final Recorder resolve(String domain){
        Recorder recorder = null;
        if(isLocal(domain)){
            recorder = echo(domain);
        }else{
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setDomain(domain);
        recorder.setIp(getIpAddr());
        return  recorder;
    }

    private String getIpAddr() {
        Random random = new Random();
        return random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
    }

    protected abstract boolean isLocal(String domain);

    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }
}
