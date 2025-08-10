package GenericMetot;

public class GenericMetot {

    /**
     * Generic bir metot olan printArray, her türlü diziyi (array) ekrana yazdırır.
     * T, generic tip parametresini temsil eder ve bu metot, hangi tipte bir dizi
     * alırsa alsın aynı şekilde işlem yapabilir.
     *
     * @param <T> Dizi elemanlarının veri türü
     * @param array Ekrana yazdırılacak dizi
     */
    public static <T> void printArray(T[] array) {
        // Dizinin her bir elemanı üzerinde dön
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Yeni satıra geç
    }

    public static void main(String[] args) {
        // Integer tipinde bir dizi oluşturma
        Integer[] intArray = {1, 2, 3, 4, 5};

        // String tipinde bir dizi oluşturma
        String[] stringArray = {"Java", "Generics", "Ödev"};

        // Double tipinde bir dizi oluşturma
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

        System.out.println("Integer dizisi:");
        printArray(intArray); // Generic metodu Integer dizisi ile çağırma

        System.out.println("\nString dizisi:");
        printArray(stringArray); // Generic metodu String dizisi ile çağırma

        System.out.println("\nDouble dizisi:");
        printArray(doubleArray); // Generic metodu Double dizisi ile çağırma
    }
}