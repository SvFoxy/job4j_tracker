package ru.job4j.oop;

public class Car {
    /*
     В данном случае трансмиссия (класс Transmission)
     и тормоза (класс Brakes) - это внутренние системы автомобиля.
     В контексте самого автомобиля они не могут существовать отдельно от него,
     поэтому было логичнее сделать их его внутренними классами.
     Также внутренние классы - это усиление инкапсуляции.
     В них мы скрываем реализацию систем автомобиля, а также сама модель автомобиля
     становится более ясной за счет четкого разграничения его внутренних компонентов.
     */
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public class Transmission {

        public void accelerate() {
            System.out.println("Ускорение");
        }

    }

    public class Brakes {

        public void brake() {
            System.out.println("Торможение");
        }

    }

    public class TripComputer {
        public String tripData = "Бортовой компьютер";
        private String model = "Модель TripComputer";

        public void getInfo() {
            System.out.println("Модель TripComputer: " + this.model);
            System.out.println("Модель Car: " + Car.this.model);
        }
    }
}