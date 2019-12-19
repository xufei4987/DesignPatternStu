package com.youxu.chain.ext2;

public class ShDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("上海DNS服务器");
    }
}
