package MaasHesaplama;


import java.util.Scanner;

public class Identify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgileri al
        System.out.print("Çalışan adını giriniz: ");
        String name = input.nextLine();

        System.out.print("Maaşını giriniz: ");
        double salary = input.nextDouble();

        System.out.print("Haftalık çalışma saatini giriniz: ");
        int workHours = input.nextInt();

        System.out.print("İşe başlama yılını giriniz: ");
        int hireYear = input.nextInt();

        // Employee nesnesini oluştur
        Employee calisan = new Employee(name, salary, workHours, hireYear);

        // Bilgileri yazdır
        System.out.println(calisan);

        input.close();
    }
}
