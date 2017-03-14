package pacman;

import java.util.Scanner;

public class Pacman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arah;
        int langkah = 10;
        gerak pacman1 = new gerak();
        for (int i = 1; i <= 10; i++) {
            pacman1.tampil();
            System.out.println("poin    : "+pacman1.getPoin());
            System.out.println("Sisa langkah   : " + langkah--);
            System.out.print("Masukkan arah langkah (w,a,s,d)  : ");
            arah = sc.nextLine();
            switch (arah) {
                case "w":
                    pacman1.atas();
                    break;
                case "a":
                    pacman1.kiri();
                    break;
                case "s":
                    pacman1.bawah();
                    break;
                case "d":
                    pacman1.kanan();
                    break;
                default:
                    System.out.println("perintah yang anda masukkan salah. nyawa berkurang");
            }
            if (langkah == 0) {
                System.out.println("You Lost (T_T)");
            }
        }
    }
}