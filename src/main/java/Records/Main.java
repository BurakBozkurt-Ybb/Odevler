package Records;

public class Main {

    public static void main(String[] args) {

        // Student record'undan nesneler oluşturma
        Student student1 = new Student("Ali", "Yılmaz", 101);
        Student student2 = new Student("Ayşe", "Kaya", 102);
        Student student3 = new Student("Ali", "Yılmaz", 101); // student1 ile aynı verilere sahip

        // Bilgileri ekrana yazdırma (toString() metodu otomatik çalışır)
        System.out.println("Öğrenci 1: " + student1);
        System.out.println("Öğrenci 2: " + student2);

        System.out.println("\n---------------------\n");

        // Getter metotlarını kullanma
        System.out.println("Öğrenci 1'in adı: " + student1.firstName());
        System.out.println("Öğrenci 2'nin tam adı: " + student2.getFullName());

        System.out.println("\n---------------------\n");

        // equals() ve hashCode() metotlarının test edilmesi
        System.out.println("student1 ve student2 eşit mi? " + student1.equals(student2)); // false
        System.out.println("student1 ve student3 eşit mi? " + student1.equals(student3)); // true

        System.out.println("student1'in hashCode'u: " + student1.hashCode());
        System.out.println("student3'ün hashCode'u: " + student3.hashCode());
    }
}