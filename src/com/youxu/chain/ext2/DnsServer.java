package com.youxu.chain.ext2;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * DNS服务器
 */
public abstract class DnsServer extends Observable implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder)arg;
        if (isLocal(recorder)) {
            recorder.setIp(getIpAddr());
        }else{
            responseFromUpperServer(recorder);
        }
        sign(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);

    private String getIpAddr() {
        Random random = new Random();
        return random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
    }

    public void setUpperServer(DnsServer upperServer) {
        super.deleteObserver(upperServer);
        super.addObserver(upperServer);
    }

    private void responseFromUpperServer(Recorder recorder){
        super.setChanged();
        super.notifyObservers(recorder);
    }
}
