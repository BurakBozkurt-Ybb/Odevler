package VucutKitleIndeksiHesaplama;

import java.util.Scanner;

class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            System.out.print("Boyunuzu metre cinsinden giriniz (örnek: 1,80): ");
            double boy = input.nextDouble();

            if (boy <= 0) {
                System.out.println("Hatalı boy girdiniz!");
                return;
            }

            System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
            double kilo = input.nextDouble();

            if (kilo <= 0) {
                System.out.println("Hatalı kilo girdiniz!");
                return;
            }

            double vki = kilo / (boy * boy);
            System.out.println("Vücut Kitle İndeksiniz: " + String.format(String.valueOf(vki)));

            input.close();
        }
    }


