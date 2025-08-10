package FilmKoleksiyonFiltreleme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Film class'ı
class Film {
    private String filmAdi;
    private int yayinYili;
    private String filmTuru;
    private double imdbPuani;

    public Film(String filmAdi, int yayinYili, String filmTuru, double imdbPuani) {
        this.filmAdi = filmAdi;
        this.yayinYili = yayinYili;
        this.filmTuru = filmTuru;
        this.imdbPuani = imdbPuani;
    }

    // Getter metotları
    public String getFilmAdi() {
        return filmAdi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getFilmTuru() {
        return filmTuru;
    }

    public double getImdbPuani() {
        return imdbPuani;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmAdi='" + filmAdi + '\'' +
                ", yayinYili=" + yayinYili +
                ", filmTuru='" + filmTuru + '\'' +
                ", imdbPuani=" + imdbPuani +
                '}';
    }
}

public class Main {

    // Belirli bir türe göre filmleri filtreleyen metod
    public static List<Film> filmTuruFiltrele(List<Film> filmler, String tur) {
        return filmler.stream()
                .filter(film -> film.getFilmTuru().equalsIgnoreCase(tur))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // 5 film nesnesi oluşturma
        List<Film> filmKoleksiyonu = new ArrayList<>();
        filmKoleksiyonu.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
        filmKoleksiyonu.add(new Film("The Godfather", 1972, "Dram", 9.2));
        filmKoleksiyonu.add(new Film("Interstellar", 2014, "Bilim Kurgu", 8.6));
        filmKoleksiyonu.add(new Film("Pulp Fiction", 1994, "Suç", 8.9));
        filmKoleksiyonu.add(new Film("Forrest Gump", 1994, "Dram", 8.8));

        System.out.println("--- Orjinal Film Listesi ---");
        filmKoleksiyonu.forEach(System.out::println);

        System.out.println("\n-------------------------------------------------");

        // IMDb puanına göre büyükten küçüğe sıralama
        Collections.sort(filmKoleksiyonu, Comparator.comparingDouble(Film::getImdbPuani).reversed());
        System.out.println("\n--- IMDb Puanına Göre (Büyükten Küçüğe) Sıralanmış Liste ---");
        filmKoleksiyonu.forEach(System.out::println);

        System.out.println("\n-------------------------------------------------");

        // Yayın yılına göre küçükten büyüğe sıralama
        Collections.sort(filmKoleksiyonu, Comparator.comparingInt(Film::getYayinYili));
        System.out.println("\n--- Yayın Yılına Göre (Küçükten Büyüğe) Sıralanmış Liste ---");
        filmKoleksiyonu.forEach(System.out::println);

        System.out.println("\n-------------------------------------------------");

        // Film türüne göre filtreleme
        String arananTur = "Dram";
        List<Film> dramFilmleri = filmTuruFiltrele(filmKoleksiyonu, arananTur);

        System.out.println("\n--- '" + arananTur + "' Türündeki Filmler ---");
        if (dramFilmleri.isEmpty()) {
            System.out.println("Belirtilen türe ait film bulunamadı.");
        } else {
            dramFilmleri.forEach(System.out::println);
        }
    }
}