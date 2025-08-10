package CinZodyagiHesaplama;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Doğum yılını alınması
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        // Çin Zodyağı hesaplama: doğum yılı % 12
        int kalan = dogumYili % 12;

        String[] zodyak = {
                "Maymun",  // 0
                "Horoz",   // 1
                "Köpek",   // 2
                "Domuz",   // 3
                "Fare",    // 4
                "Öküz",    // 5
                "Kaplan",  // 6
                "Tavşan",  // 7
                "Ejderha", // 8
                "Yılan",   // 9
                "At",      // 10
                "Koyun"    // 11
        };

        // Sonucu yazdır
        System.out.println("Çin Zodyağı Burcunuz: " + zodyak[kalan]);

        input.close();
    }
}
