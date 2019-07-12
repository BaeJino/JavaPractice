package org.dimigo.oop;

public class GameTest {
    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        System.out.println(mp.getVolume());

        new Player().play(); //이름 없음 , 일회성
        System.out.println(mp.getVolume());

        new Enemy().play();
        System.out.println(mp.getVolume());
    }
}
