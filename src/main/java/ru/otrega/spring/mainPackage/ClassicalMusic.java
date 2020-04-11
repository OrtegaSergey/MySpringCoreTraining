package ru.otrega.spring.mainPackage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> musicList = new ArrayList<>(Arrays.asList("firstClassicalSong",
            "secondClassicalSong", "thirdClassicalSong"));

    public List<String> getSongList() {
        return musicList;
    }
}
