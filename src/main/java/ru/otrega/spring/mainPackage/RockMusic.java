package ru.otrega.spring.mainPackage;

public class RockMusic implements Music {
    private void myInitMethod(){
        System.out.println("init test");
    }
    private void myDestructionMethod(){
        System.out.println("destruction test");
    }

    private RockMusic(){}

    public static RockMusic myFactoryMethod(){
        System.out.println("factory method was inited");
        return new RockMusic();
    }

    public String getSong() {
        return "rock song";
    }
}
