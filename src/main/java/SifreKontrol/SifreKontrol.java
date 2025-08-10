package SifreKontrol;


import java.util.Scanner;

public class SifreKontrol {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Şifreyi giriniz: ");
                String sifre = scanner.nextLine();

                if (gecerliMi(sifre)) {
                        System.out.println("Geçerli Şifre");
                } else {
                        System.out.println("Geçersiz Şifre");
                }

                scanner.close();
        }

        public static boolean gecerliMi(String sifre) {
                // 1. En az 8 karakter
                if (sifre.length() < 8) {
                        return false;
                }

                // 2. Space karakteri içermemeli
                if (sifre.contains(" ")) {
                        return false;
                }

                // 3. İlk harf büyük harf olmalı
                char ilkHarf = sifre.charAt(0);
                if (!Character.isUpperCase(ilkHarf)) {
                        return false;
                }

                // 4. Son karakter ? olmalı
                char sonKarakter = sifre.charAt(sifre.length() - 1);
                if (sonKarakter != '?') {
                        return false;
                }

                // Tüm kurallardan geçti
                return true;
        }
}
