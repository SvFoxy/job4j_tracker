package ru.job4j.oop;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Car.Transmission transmission = car.new Transmission();
        Car.Brakes brakes = car.new Brakes();
        car.startEngine();
        transmission.accelerate();
        brakes.brake();
        Car.TripComputer tripComputer = car.new TripComputer();
        tripComputer.getInfo();
    }
/*
переменной brakes - её тип записан как Car.Brakes.
Так как класс Brakes вложен в класс Car, он не может быть создан
и использован отдельно от класса Car.
Хоть класс Brakes и имеет модификатор public и может быть создан где угодно,
для его создания нужно указывать его внешний класс.
Car.Brakes говорит о том, что переменная brakes имеет тип класса Brakes,
вложенного в Car и являющегося его частью.
По точке всегда можно понять вложенность классов.
Если бы класс Brakes имел модификатор private, то он мог бы быть создан только в классе Car.

 */
}