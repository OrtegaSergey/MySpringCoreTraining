package ru.otrega.spring.mainPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.otrega.spring.mainPackage.config.SpringConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicGenre.ROCK);

        applicationContext.close();
    }
}
