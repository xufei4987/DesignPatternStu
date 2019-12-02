package com.youxu.facade;
//门面模式 用一个门面封装复杂的子系统
public class FacadeMain {
    public static void main(String[] args) {
        LetterProcess letterProcess  =  new LetterProcessImpl();
        PostOffice postOffice = new PostOffice(letterProcess);
        postOffice.sendLetter();
    }
}
