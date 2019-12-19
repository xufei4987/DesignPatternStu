package com.youxu.chain.ext2;

public class CnTopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级DNS服务器");
    }
}
