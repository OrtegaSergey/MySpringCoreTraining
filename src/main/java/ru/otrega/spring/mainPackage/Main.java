package ru.otrega.spring.mainPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(applicationContext.getBean("musicPlayer", MusicPlayer.class).playMusic());
        
    }
}
