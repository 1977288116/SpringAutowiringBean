package com.chenjl.config;

import com.chenjl.autowire.*;
import com.chenjl.autowire.interfaces.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CompactDisc.class,CDDisc.class})
public class CDPlayerConfig {

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPepers();
    }
    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc randomBeatlesCD() {
        int choice = (int)Math.floor(Math.random()*4);
        if (choice == 0) {
            return new SgtPepers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }

    @Bean
    public CDPlayer cdPlayer () {
        return new CDPlayer(sgtPeppers());
    }

}
