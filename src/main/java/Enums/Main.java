package Enums;

import java.util.Scanner;

public class Main {

    // Day enum sınıfı
    public enum Day {
        SUNDAY("Kapalı"),
        MONDAY("9:00 - 17:00"),
        TUESDAY("9:00 - 17:00"),
        WEDNESDAY("9:00 - 17:00"),
        THURSDAY("9:00 - 17:00"),
        FRIDAY("9:00 - 17:00"),
        SATURDAY("10:00 - 14:00");

        private final String workingHours;

        // Enum sabitlerinin değerlerini atayan kurucu (constructor) metot
        Day(String workingHours) {
            this.workingHours = workingHours;
        }

        // Çalışma saatini döndüren metot
        public String getWorkingHours() {
            return workingHours;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gün girişi al
        System.out.println("Haftanın bir gününü girin (Örn: MONDAY, FRIDAY):");
        String dayInput = scanner.nextLine().toUpperCase(); // Kullanıcı girişini büyük harfe çevir

        try {
            // Kullanıcının girdiği metne karşılık gelen enum sabitini al
            Day selectedDay = Day.valueOf(dayInput);

            // Seçilen günün çalışma saatlerini göster
            System.out.println(selectedDay + " gününün çalışma saatleri: " + selectedDay.getWorkingHours());

        } catch (IllegalArgumentException e) {
            // Geçersiz bir gün girildiğinde hata mesajı ver
            System.out.println("Hatalı gün girişi! Lütfen geçerli bir gün girin.");
        } finally {
            scanner.close();
        }
    }
}