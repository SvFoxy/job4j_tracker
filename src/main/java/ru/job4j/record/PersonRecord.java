package ru.job4j.record;

public record PersonRecord(String name, int age) {
    /*
    Данный конструктор называется компактным, так как в нем поля не инициализируются явным образом.
    Инициализация проходит неявно перед выполнением команд, находящихся внутри конструктора.
    Данная инициализация автоматически будет проходить в любом переопределенном конструкторе.
    Это гарантирует, что все поля будут инициализированы.
     */
    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть менее 101");
        }
    }

    public static int maxAge = 100;

    public static int getMaxAge() {
        return maxAge;
    }

    public void info() {
        System.out.println("Напечатать информацию");
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}