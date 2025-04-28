package com.colvir.homework1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Launcher {
    public static void main(String[] args) {
        /*
            Разработать программу на Java с использованием Stream API, которая принимает на вход некоторый текст
            (например, из консоли или внешнего файла), вычисляет частоту появления слов в этом тексте и после чего
            выводит эти слова, отсортированными в убывающем порядке их частотности появления в тексте. Под словом
            подразумевается любая непрерывная последовательность символов (до пробела, точки, запятой,
            двоеточия и других разделителей), состоящая только из букв и цифр, не учитывая регистр букв.
            Например, в строке "Семь раз отмерь, 1 раз отрежь!" ровно 5 слов:
            "семь", "раз", "отмерь", "1", "отрежь".
            Результат должен быть такой: раз семь отмерь 1 отрежь
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = input.nextLine();
        System.out.println("Результат:");
        Arrays.stream(text.trim().replaceAll("[^а-яА-Я0-9\\s]", "").split(" "))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
