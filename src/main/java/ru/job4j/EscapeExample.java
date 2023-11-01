package ru.job4j;

/*
Комбинация в виде обратного слэша и экранируемого им символа называется
управляющей последовательностью (escape-последовательность).
В таком же виде выводятся и спецсимволы, например, \n - переход на новую строку.
 */
public class EscapeExample {
    public static void main(String[] args) {
        String str = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(str);

        char escape = '\"';
        System.out.println(escape);

        System.out.println('\'');

        str = "C:\\projects\\job4j\\File.java";
        System.out.println(str);

        /*
        Возвращает курсор в начало строки, "обнуляя" её. Если в строке были данные, они пропадут.
        В блоке кода ниже первая строка выводится на печать без перевода на новую строку.
        После возврата курсора данные из второй строки выводятся на печать с начала строки,
        при этом данных из первой строки в ней уже нет.
         */
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");

        System.out.print("Первая строка\nВторая строка");
        System.out.print("\n");

        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");

        System.out.println("Job4jjj\b\b");
    }
}