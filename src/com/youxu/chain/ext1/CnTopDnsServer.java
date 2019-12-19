package com.youxu.chain.ext1;

public class CnTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("中国顶级DNS服务器");
        return recorder;
    }
}
