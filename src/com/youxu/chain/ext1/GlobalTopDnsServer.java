package com.youxu.chain.ext1;

public class GlobalTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("全球顶级DNS服务器");
        return recorder;
    }
}
