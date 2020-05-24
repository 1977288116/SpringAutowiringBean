package com.chenjl.test;

import com.chenjl.config.CDPlayerConfig;
import com.chenjl.autowire.interfaces.CompactDisc;
import com.chenjl.autowire.interfaces.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull () {
        assertNotNull(compactDisc);
    }

    @Test
    public void play () {
        mediaPlayer.play();
        assertEquals("最炫名族风 played by 凤凰传奇", log.getLog());
    }

}
