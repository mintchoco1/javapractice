package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean ison = false;

        //음악 플레이어 켜기
         ison = true;
        System.out.println("음악 플레이어를 시작합니다");
        
        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태");
        if(ison) {
            System.out.println("음악 플레이어 on: " + volume);
        } else {
            System.out.printf("음악 플레이어 off: " + volume);
        }
        //음악 플레이어 끄기
        ison = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
