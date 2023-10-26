package ru.job4j.format;

import java.util.Calendar;

public class Format {

    public static void getGreeting(String name) {
        /* %s выводит строковое представление аргумента */
        System.out.println(String.format("Привет! Я %s", name));

         int age = 33;
        System.out.println(String.format("Привет! Я %s, мой возраст: %s", name, age));
        /* d% мы передаём на форматирование целое число */
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
    }

    public static void getGreetingAndTime(String name) {
        /* получаем дату и время в виде объекта Calendar */
        Calendar instance = Calendar.getInstance();
        /* вид даты и времени здесь спецификаторы %t с флагами F и T.
        Флаг F выводит дату в формате ISO 8601 - ГГГГ-ММ-ДД, а
        флаг T выводит время в формате ЧЧ:ММ:СС */
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
    }

    public static void main(String[] args) {
        getGreeting("Елена");

        /* %f. Задаёт число с плавающей точкой
         По умолчанию при задании числа с плавающей точкой выводится 6 символов после точки. */
        System.out.println(String.format("Задаем число 0.99 - %f", 0.99));

        /* указания точки и целого числа (.*) перед символом f.
         Нам нужно 2 символа после точки: */
        System.out.println(String.format("Задаем число 0.99 - %.2f", 0.99));
    }

}