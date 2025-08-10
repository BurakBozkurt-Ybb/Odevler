package EnBuyukVeEnKucukSayi;

import java.util.Scanner;

        public class EnBuyukVeEnKucukSayi {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Kaç adet sayı gireceksiniz? ");
                int n = input.nextInt();

                // Eğer  1'den az sayı girilirse işlem yapmaya gerek yok
                if (n < 1) {
                    System.out.println("Geçerli bir sayı adedi giriniz.");
                    return;
                }

                System.out.print("1. sayıyı girin: ");
                int sayi = input.nextInt();
                int enBuyuk = sayi;
                int enKucuk = sayi;

                for (int i = 2; i <= n; i++) {
                    System.out.print(i + ". sayıyı girin: ");
                    sayi = input.nextInt();

                    if (sayi > enBuyuk) {
                        enBuyuk = sayi;
                    }

                    if (sayi < enKucuk) {
                        enKucuk = sayi;
                    }
                }

                System.out.println("En büyük sayı: " + enBuyuk);
                System.out.println("En küçük sayı: " + enKucuk);
            }
        }
