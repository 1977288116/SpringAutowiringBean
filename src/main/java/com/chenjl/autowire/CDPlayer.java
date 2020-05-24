package com.chenjl.autowire;

import com.chenjl.autowire.interfaces.CompactDisc;
import com.chenjl.autowire.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    // 通过构造器注入就可以播放任何的CD唱片
    @Autowired
    public CDPlayer (CompactDisc cd) {
        this.cd = cd;
    }

    // 也可以通过set方法注入依赖
    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    // 也可以用在一个普通的方法之上
    @Autowired(required = false)
    public void insertDisc (CompactDisc cd) {
        this.cd = cd;
    }

    public void play () {
        cd.play();
    }

}
