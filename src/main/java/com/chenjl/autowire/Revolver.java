package com.chenjl.autowire;

import com.chenjl.autowire.interfaces.CompactDisc;

public class Revolver implements CompactDisc {
    @Override
    public void play() {
        System.out.println("Playing Revolver。。。。。。。。。");
    }
}
