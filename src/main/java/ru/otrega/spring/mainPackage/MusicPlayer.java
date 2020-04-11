package ru.otrega.spring.mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music popMusic;
    private Music rockMusic;
    private Music classicalMusic;
    private String name = "test";
    private int volume = 30;

    @Autowired
    public MusicPlayer(@Qualifier("popMusic") Music popMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicGenre genre){
        Random random = new Random();
        switch (genre){
            case POP:
                System.out.println("Playing: " +
                        popMusic.getSongList().get(random.nextInt(3)));
                break;
            case ROCK:
                System.out.println("Playing: " +
                        rockMusic.getSongList().get(random.nextInt(3)));
                break;
            case CLASSICAL:
                System.out.println("Playing: " +
                        classicalMusic.getSongList().get(random.nextInt(3)));
        }
    }
}
