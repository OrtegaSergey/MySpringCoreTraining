package ru.otrega.spring.mainPackage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PopMusic implements Music {
    List<String> musicList = new ArrayList<>(Arrays.asList("firstPopSong", "secondPopSong", "thirdPopSong"));

    @Override
    public List<String> getSongList() {
        return musicList;
    }
}
