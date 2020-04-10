package ru.otrega.spring.mainPackage;

public class MusicPlayer {
    Music music;
    
    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic(){
        return "Playing: " + music.getSong();
    }
}
