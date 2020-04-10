package ru.otrega.spring.mainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(Music... music){
        for (Music o:
             music) {
            musicList.add(o);
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public void playMusic(){
        for (Music o:
             musicList) {
            System.out.println("Playing: " + o.getSong() + ", Volume: " + getVolume());
        }
    }
}
