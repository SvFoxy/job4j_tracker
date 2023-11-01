package ru.job4j.concat;

public class ConcatTest {
  /*  public static void main(String[] args) {

        long startTime = System.currentTimeMillis(); // фиксируем время старта программы в миллисекундах
        String str = "Job4j";
        for (int index = 0; index < 9999; index++) {
            //"String concatenation '+' in loop", "String concatenation '+' in loop",
           // Такое слияние имеет очень низкую производительность./
            str = str + index;
        }
       // время работы программы рассчитываем в виде вычитания времени старта программы
       //  из времени её фактического окончания в строке *
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }*/

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}