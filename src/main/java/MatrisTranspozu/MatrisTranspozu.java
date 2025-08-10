package MatrisTranspozu;

import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Matrisin boyutlarını al
        System.out.print("Satır sayısını girin: ");
        int satir = input.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int sutun = input.nextInt();

        int[][] matris = new int[satir][sutun];

        // Matrisi değerlerini iste
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = input.nextInt();
            }
        }

        // Transpoz için yeni dizi tanımla
        int[][] transpoz = new int[sutun][satir];

        // Transpoz işlemi
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matris
        System.out.println("\nOrijinal Matris:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matris
        System.out.println("\nTranspoz (Devriği) Matris:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
