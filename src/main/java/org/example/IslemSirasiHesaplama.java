package org.example;

import java.util.Scanner;

public class IslemSirasiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a, b, c değerlerini alındığı kısım
        System.out.print("Birinci sayıyı (a) giriniz: ");
        int a = input.nextInt();

        System.out.print("İkinci sayıyı (b) giriniz: ");
        int b = input.nextInt();

        System.out.print("Üçüncü sayıyı (c) giriniz: ");
        int c = input.nextInt();

        // İşlem: a + b * c - b
        int sonuc = a + b * c - b;

        // Sonucu ekrana yazdır
        System.out.println("İşlem sonucu: " + sonuc);

        input.close();
    }
}
