package ru.job4j.varargs;

public class VarArgs {
    /*
    Аргументы переменной длины объявляются в коде в виде троеточия "..." между типом данных и именем.
    Данная запись подразумевает 0 и более аргументов.
    Аргумент strings неявно будет преобразован в массив строк.
    Указать varargs можно только как параметр какого-либо метода.
     */
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
       /* return builder.toString();*/
        return builder + " Количество соединенных элементов: " + strings.length;
    }

    /*
    Методы с аргументами произвольной длины можно перегружать. Например:
     */
    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text("aaa", "bbb", "ccc", "ddd", "eee"));

        System.out.println(text(30, "aaa", "bbb"));
    }

}