package com.youxu.chain.ext1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DnsDemo {
    public static void main(String[] args) throws IOException {
        ShDnsServer shDnsServer = new ShDnsServer();
        CnTopDnsServer cnTopDnsServer = new CnTopDnsServer();
        GlobalTopDnsServer globalTopDnsServer = new GlobalTopDnsServer();
        shDnsServer.setUpperServer(cnTopDnsServer);
        cnTopDnsServer.setUpperServer(globalTopDnsServer);
        Recorder resolve = null;
        while (true){
            System.out.println("请输入域名(输入N退出)：");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String domain = bufferedReader.readLine();
            if ("n".equalsIgnoreCase(domain)) {
                return;
            }
            resolve = shDnsServer.resolve(domain);
            System.out.println(resolve);
        }
    }
}
