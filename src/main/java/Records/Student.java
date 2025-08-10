package Records;

// Student adında bir Record sınıfı oluşturma
public record Student(String firstName, String lastName, int studentId) {

    // Record sınıfının gövdesi boş bırakılabilir,
    // ancak gerekirse ekstra metotlar, static alanlar veya yapıcı metotlar eklenebilir.
    // Örneğin, varsayılan (canonical) yapıcı metoda ek doğrulama eklemek için:
    public Student {
        if (studentId <= 0) {
            throw new IllegalArgumentException("Öğrenci numarası pozitif bir sayı olmalıdır.");
        }
    }

    // Ek olarak, öğrencinin tam adını döndüren bir metot eklenebilir
    public String getFullName() {
        return firstName + " " + lastName;
    }

}