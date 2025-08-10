package MapIcindekiEntryleriSatirSatirYazdirma;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        // HashMap oluşturulması ve 5 adet key-value çiftinin eklenmesi
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Map içeriğini yazdırmak için metod çağrısı
        printMap(scores);
    }

    public static void printMap(Map<String, Integer> mapToPrint) {
        // Map'in boş olup olmadığını kontrol et
        if (mapToPrint.isEmpty()) {
            System.out.println("Harita (Map) boş.");
            return;
        }

        // forEach döngüsü ile her bir key-value çiftini yazdırma
        System.out.println("İçerik:");
        mapToPrint.forEach((key, value) -> System.out.println(key + " = " + value));

        /* Alternatif olarak, for-each döngüsü de kullanılabilir:
        for (Map.Entry<String, Integer> entry : mapToPrint.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        */
    }
}