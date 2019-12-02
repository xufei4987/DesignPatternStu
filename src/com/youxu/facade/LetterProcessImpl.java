package com.youxu.facade;

public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext() {
        System.out.println("write letter");
    }

    @Override
    public void fillEnvelope() {
        System.out.println("fill envelope");
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("put letter into envelope");
    }

    @Override
    public void sendLetter() {
        System.out.println("send letter");
    }
}
