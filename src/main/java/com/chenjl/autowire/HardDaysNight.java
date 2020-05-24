package com.chenjl.autowire;

import com.chenjl.autowire.interfaces.CompactDisc;

public class HardDaysNight implements CompactDisc {
    @Override
    public void play() {
        System.out.println("playing HardDaysNight。。。。。。。。。。。");
    }
}
