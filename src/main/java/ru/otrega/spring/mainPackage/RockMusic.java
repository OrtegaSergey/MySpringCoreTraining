package ru.otrega.spring.mainPackage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> musicList = new ArrayList<>(Arrays.asList("firstRockSong", "secondRockSong", "thirdRockSong"));

//    private void myInitMethod(){
//        System.out.println("init test");
//    }
//    private void myDestructionMethod(){
//        System.out.println("destruction test");
//    }

    private RockMusic(){}


//    public static RockMusic myFactoryMethod(){
//        System.out.println("factory method was inited");
//        return new RockMusic();
//    }

    @Override
    public List<String> getSongList() {
        return musicList;
    }

}
