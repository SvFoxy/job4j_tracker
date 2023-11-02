package ru.job4j.cast;

public class CastUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle airplane2 = new Airplane();
        Vehicle train = new Train();
        Vehicle train2 = new Train();
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airplane, airplane2, train, train2, bus, bus2};
        for (Vehicle v : vehicles) {
            System.out.println(v);
            v.move();
        }
    }
}
