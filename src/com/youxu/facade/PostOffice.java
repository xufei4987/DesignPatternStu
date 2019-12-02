package com.youxu.facade;

public class PostOffice {
    public PostOffice(LetterProcess letterProcess){
        this.letterProcess = letterProcess;
    }
    private LetterProcess letterProcess;
    public void sendLetter(){
        letterProcess.writeContext();
        letterProcess.fillEnvelope();
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
