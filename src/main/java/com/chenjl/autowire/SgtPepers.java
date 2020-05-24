package com.chenjl.autowire;

import com.chenjl.autowire.interfaces.CompactDisc;

import javax.inject.Named;

@Named("lonelyHeartsClub")
public class SgtPepers implements CompactDisc {

    private static String title = "最炫名族风";

    private static String artist = "凤凰传奇";

    @Override
    public void play() {
        System.out.println(title + " played by " + artist);
    }
}
