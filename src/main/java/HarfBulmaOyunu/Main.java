package HarfBulmaOyunu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Dört elemanlı bir ArrayList oluştur ve rastgele harflerle doldur
        ArrayList<String> harfler = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            char rastgeleHarf = (char) (rand.nextInt(26) + 'a'); // 'a' ile 'z' arasında rastgele bir harf
            harfler.add(String.valueOf(rastgeleHarf));
        }

        System.out.println("Oluşturulan liste: " + harfler);

        Scanner scanner = new Scanner(System.in);

        // 2. İşlemi 4 kez tekrarla
        for (int i = 0; i < 4; i++) {
            System.out.println("---");
            System.out.print((i + 1) + ". deneme - Bir harf girin: ");
            String kullaniciHarfi = scanner.nextLine().toLowerCase(); // Kullanıcının girdiği harfi küçük harfe çevir

            // 3. Harfin listede olup olmadığını kontrol et
            if (harfler.contains(kullaniciHarfi)) {
                int index = harfler.indexOf(kullaniciHarfi);
                harfler.set(index, "found"); // Harf listede varsa "found" ile değiştir
                System.out.println("Harf listede bulundu. Liste güncellendi: " + harfler);
            } else {
                harfler.add(kullaniciHarfi); // Harf listede yoksa listeye ekle
                System.out.println("Harf listede bulunamadı. Listeye eklendi: " + harfler);
            }
        }

        System.out.println("---");
        System.out.println("Program sonlandı. Son liste durumu: " + harfler);
        scanner.close();
    }
}