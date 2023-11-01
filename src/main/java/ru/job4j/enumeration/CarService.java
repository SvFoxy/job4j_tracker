package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);

        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar()
                + ", статус ремонта: " + order.getStatus().getInfo() + ", подробности: " + order.getStatus().getMessage());

        /*
методы класса Enum.
- name() - возвращает имя константы (значения) в том же виде, в каком оно объявлено.
- ordinal() - возвращает порядковый номер константы (значения), по которому её экземпляр находится в перечислении (нумерация с нуля).
- values() - возвращает массив всех элементов перечисления.
         */
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
/*
- valueOf() - получает объект типа класса перечисления по его строковому представлению.
 */
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
    }

}