package com.youxu.chain.ext2;

public class GlobalTopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级DNS服务器");
    }
}
