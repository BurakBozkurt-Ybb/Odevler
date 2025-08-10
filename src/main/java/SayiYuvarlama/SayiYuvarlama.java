package SayiYuvarlama;

import java.util.Scanner;

public class SayiYuvarlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalıklı bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        // Aşağı yuvarlama (floor)
        int asagiYuvarlama = (int) Math.floor(sayi);

        // Yukarı yuvarlama (ceil)
        int yukariYuvarlama = (int) Math.ceil(sayi);

        // En yakın tam sayıya yuvarlama (round)
        int enYakin = (int) Math.round(sayi);

        System.out.println("Aşağı Yuvarlama: " + asagiYuvarlama);
        System.out.println("Yukarı Yuvarlama: " + yukariYuvarlama);
        System.out.println("En Yakın Tam Sayı: " + enYakin);

        scanner.close();
    }
}
