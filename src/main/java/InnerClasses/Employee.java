package InnerClasses;

import java.util.Random;

public class Employee {

    private String name;
    private String surname;
    private ContactInfo contactInfo;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        // Yapıcı metotta rastgele iletişim bilgilerini oluştur
        this.contactInfo = new ContactInfo();
    }

    public void displayEmployeeInfo() {
        System.out.println("Çalışan Bilgileri:");
        System.out.println("Ad: " + this.name);
        System.out.println("Soyad: " + this.surname);
        this.contactInfo.displayContactInfo();
    }

    // Inner Class (İç Sınıf)
    private class ContactInfo {
        private String phoneNumber;
        private String email;
        private Random random = new Random();

        // Yapıcı metotta rastgele telefon ve e-posta oluştur
        public ContactInfo() {
            this.phoneNumber = generateRandomPhoneNumber();
            this.email = generateRandomEmail();
        }

        private String generateRandomPhoneNumber() {
            StringBuilder sb = new StringBuilder();
            // Türkiye telefon numarası formatı gibi 10 basamaklı sayı üretelim
            sb.append("5");
            for (int i = 0; i < 9; i++) {
                sb.append(random.nextInt(10));
            }
            return sb.toString();
        }

        private String generateRandomEmail() {
            String[] domains = {"sirket.com", "yazilim.net", "kurumsal.org"};
            String emailPrefix = (name.toLowerCase() + "." + surname.toLowerCase()).replace(" ", "");
            return emailPrefix + "@" + domains[random.nextInt(domains.length)];
        }

        public void displayContactInfo() {
            System.out.println("İletişim Bilgileri:");
            System.out.println("Telefon: " + this.phoneNumber);
            System.out.println("E-posta: " + this.email);
        }
    }

    public static void main(String[] args) {
        // Yeni bir Employee nesnesi oluşturulduğunda rastgele iletişim bilgileri de oluşturulur.
        Employee calisan1 = new Employee("Can", "Akın");
        calisan1.displayEmployeeInfo();

        System.out.println("\n---------------------\n");

        Employee calisan2 = new Employee("Gizem", "Öztürk");
        calisan2.displayEmployeeInfo();
    }
}