package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // --- Lambda İfadeleri Kullanarak Sayıları İki Katına Çıkarma ---
        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        // --- Lambda İfadeleri Kullanarak Sonuçları Yazdırma ---
        System.out.println("Lambda ile ikiye katlanmış sayılar:");
        doubledNumbers.forEach(System.out::println);
    }
}