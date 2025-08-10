package BirbirineEnYakınIkiSayiyiBulma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // 1. Benzersiz ve pozitif 10 adet eleman içeren ArrayList oluşturma
        ArrayList<Integer> sayilar = new ArrayList<>();
        HashSet<Integer> benzersizSayilar = new HashSet<>();
        Random rand = new Random();

        while (benzersizSayilar.size() < 10) {
            int rastgeleSayi = rand.nextInt(100) + 1; // 1 ile 100 arasında rastgele sayı
            benzersizSayilar.add(rastgeleSayi);
        }
        sayilar.addAll(benzersizSayilar);

        System.out.println("Oluşturulan liste: " + sayilar);

        // 2. En yakın iki elemanı bulma
        if (sayilar.size() < 2) {
            System.out.println("En yakın elemanları bulmak için en az iki eleman gereklidir.");
            return;
        }

        Collections.sort(sayilar); // Listenin sıralanması

        int enKucukFark = Integer.MAX_VALUE;
        int sayi1 = 0;
        int sayi2 = 0;

        for (int i = 0; i < sayilar.size() - 1; i++) {
            int fark = sayilar.get(i + 1) - sayilar.get(i);

            if (fark < enKucukFark) {
                enKucukFark = fark;
                sayi1 = sayilar.get(i);
                sayi2 = sayilar.get(i + 1);
            }
        }

        System.out.println("---");
        System.out.println("Listenin sıralanmış hali: " + sayilar);
        System.out.println("En yakın iki eleman: " + sayi1 + " ve " + sayi2 + " (Fark: " + enKucukFark + ")");
    }
}