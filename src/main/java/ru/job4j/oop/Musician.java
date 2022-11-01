package ru.job4j.oop;

public class Musician {
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public static void main(String[] args) {
        Musician petya = new Musician();
        String song = "I believe I can fly";
        petya.music(song);
    }
}
