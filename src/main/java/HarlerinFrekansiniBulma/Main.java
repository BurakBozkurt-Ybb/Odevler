package HarlerinFrekansiniBulma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir kelime veya cümle girin: ");
        String girdi = scanner.nextLine();
        scanner.close();

        // Harf frekanslarını hesaplayan metod
        Map<Character, Integer> harfFrekanslari = hesaplaHarfFrekanslari(girdi);

        // Sonuçları ekrana yazdırma
        System.out.println("Harf frekansları:");
        if (harfFrekanslari.isEmpty()) {
            System.out.println("Geçerli harf bulunamadı.");
        } else {
            for (Map.Entry<Character, Integer> entry : harfFrekanslari.entrySet()) {
                System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " kez");
            }
        }
    }

    /**
     * Verilen metindeki her harfin frekansını hesaplar.
     * Büyük/küçük harf farkı gözetmez ve sadece harfleri dikkate alır.
     *
     * @param metin Frekansının hesaplanacağı metin.
     * @return Harf ve frekanslarını içeren bir Map.
     */
    public static Map<Character, Integer> hesaplaHarfFrekanslari(String metin) {
        Map<Character, Integer> frekansMap = new HashMap<>();

        // Metni küçük harfe çevirerek büyük/küçük harf duyarlılığını ortadan kaldır
        String kucukHarfMetin = metin.toLowerCase();

        // Metnin her bir karakteri üzerinde döngü
        for (char karakter : kucukHarfMetin.toCharArray()) {
            // Sadece harfleri işle
            if (Character.isLetter(karakter)) {
                // Harf zaten map'te var mı kontrol et
                if (frekansMap.containsKey(karakter)) {
                    // Varsa frekansını 1 artır
                    frekansMap.put(karakter, frekansMap.get(karakter) + 1);
                } else {
                    // Yoksa map'e ekle ve frekansını 1 olarak ayarla
                    frekansMap.put(karakter, 1);
                }
            }
        }
        return frekansMap;
    }
}