package com.youxu.chain.ext1;

public class ShDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海DNS服务器");
        return recorder;
    }
}
