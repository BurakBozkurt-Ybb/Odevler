package ArtıkYılHesaplama;

import java.util.Scanner;

class ArtıkYılHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // hesaplanacak yılı al
        System.out.print("Yılı giriniz: ");
        int yil = input.nextInt();

        // Artık yıl kontrolü
        boolean artikYilMi;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                // 100'e bölünüyor, o zaman 400'e de bölünmeli
                artikYilMi = (yil % 400 == 0);
            } else {
                // 100'e bölünmüyor, ama 4'e bölünüyor
                artikYilMi = true;
            }
        } else {
            // 4'e bile bölünmüyor
            artikYilMi = false;
        }

        // Sonuç yazdır
        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        input.close();
    }
}
