package TipDonusum;

import java.util.Scanner;

public class TipDonusum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tam sayı al
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        // ondalıklı sayı al
        System.out.print("Bir ondalıklı sayı (double) girin: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı double'a dönüştür
        double tamSayiToDouble = (double) tamSayi;

        // Ondalıklı sayıyı int'e dönüştür
        int ondalikliToInt = (int) ondalikliSayi;

        // Sonuçları ekrana yazdır
        System.out.println("\n--- Dönüştürme Sonuçları ---");
        System.out.println("Tam sayı (int): " + tamSayi);
        System.out.println("Tam sayının double hali: " + tamSayiToDouble);

        System.out.println("Ondalıklı sayı (double): " + ondalikliSayi);
        System.out.println("Ondalıklı sayının int hali: " + ondalikliToInt);
    }
}
