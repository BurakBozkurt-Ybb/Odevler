package UcakBiletiHesaplama;

import java.util.Scanner;

public class UcakBiletiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double birimFiyat = 0.10; // TL/km
        double toplamFiyat;

        // 1. Kullanıcıdan Girdi Alma
        System.out.print("Mesafeyi (KM) Giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        // 2. Girdi Kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            input.close();
            return;
        }

        // 3. Temel Bilet Fiyatı
        toplamFiyat = mesafe * birimFiyat;

        // 4. Yaş İndirimi
        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 indirim
            System.out.println("12 yaş altı indirimi uygulandı: %50");
        } else if (yas <= 24) {
            toplamFiyat *= 0.9; // %10 indirim
            System.out.println("12-24 yaş arası indirimi uygulandı: %10");
        } else if (yas >= 65) {
            toplamFiyat *= 0.7; // %30 indirim
            System.out.println("65 yaş üstü indirimi uygulandı: %30");
        }

        // 5. Gidiş-Dönüş İndirimi
        if (yolculukTipi == 2) {
            toplamFiyat *= 2;     // Gidiş-Dönüş = çift yön
            toplamFiyat *= 0.8;   // %20 indirim
            System.out.println("Gidiş-Dönüş indirimi uygulandı: %20");
        }

        // 6. Sonuç
        System.out.println("Toplam Bilet Fiyatı: " + String.format("%.2f", toplamFiyat) + " TL");

        input.close();
    }
}
