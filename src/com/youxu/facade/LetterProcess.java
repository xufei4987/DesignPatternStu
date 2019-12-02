package com.youxu.facade;

public interface LetterProcess {
    //编写信的内容
    void writeContext();
    //写信封
    void fillEnvelope();
    //将信放入信封
    void letterIntoEnvelope();
    //寄出信件
    void sendLetter();
}
