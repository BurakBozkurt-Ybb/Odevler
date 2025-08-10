package AsalSayi;

import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            if (asalMi(sayi, 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }

        scanner.close();
    }

    // Recursive metod: sayının asal olup olmadığını kontrol eder
    public static boolean asalMi(int sayi, int bolen) {
        // Sayı kendisinden küçük hiçbir sayıya tam bölünmediyse asaldır
        if (bolen > Math.sqrt(sayi)) {
            return true;
        }
        // Eğer sayi, bolen'e tam bölünüyorsa asal değildir
        if (sayi % bolen == 0) {
            return false;
        }
        // Bir sonraki böleni dene
        return asalMi(sayi, bolen + 1);
    }
}
