package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //데이터와 기능이 분리
        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeup(data);

        //볼륨 증가
        volumeup(data);

        //볼륨 감소
        volumedown(data);

        //음악 플레이어 상태
        status(data);

        //음악 플레이어 끄기
        off(data);
    }
    static void on(MusicPlayerData data) {
        data.ison = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data) {
        data.ison = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    static void volumeup(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumedown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void status(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태");
        if(data.ison) {
            System.out.println("음악 플레이어 on" + data.volume);
        }else {
            System.out.println("음악 플레이어 off");
        }
    }
}
