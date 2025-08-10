package TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        // Ters üçgen çizimi
        for (int i = 0; i < n; i++) {
            // bu kısım yanda boşluk bırakma kısmı sildiğimizde dik üçgen olarak çıkar
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Yıldızlar
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Satır atla
        }

        input.close();
    }
}
