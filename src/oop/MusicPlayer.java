package oop;

public class MusicPlayer {
    int volume = 0;
    boolean ison = false;

    void on() {
        ison = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off() {
        ison = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    void volumeup() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumedown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void status() {
        System.out.println("음악 플레이어 상태");
        if(ison) {
            System.out.println("음악 플레이어 on" + volume);
        }else {
            System.out.println("음악 플레이어 off");
        }
    }
}
