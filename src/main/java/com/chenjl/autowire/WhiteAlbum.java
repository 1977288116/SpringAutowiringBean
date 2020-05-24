package com.chenjl.autowire;

import com.chenjl.autowire.interfaces.CompactDisc;

public class WhiteAlbum implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Playing WhiteAlbum。。。。。。。。。。。");
    }
}
