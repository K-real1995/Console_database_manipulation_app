package DbManipulation;

import java.sql.Connection;
import java.util.Scanner;

public class InsertDb {
    //Метод добавляющий автомобиль в таблицу cars
    public static String insertCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку автомобиля: ");
        String name = scanner.nextLine();
        System.out.println("Введите цвет автомобиля: ");
        String color = scanner.nextLine();
        System.out.println("Введите модель автомобиля: ");
        String model = scanner.nextLine();
        System.out.println("Введите максимальную скорость автомобиля: ");
        String speed = scanner.nextLine();

        return "INSERT INTO cars(name, color, model, speed) " +
                "VALUES ('" + name + "', '" + color + "', '" + model + "', '" + speed + "');";

    }
    //Метод добалющий магазин в таблицу shops
    public static String insertShop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название магазина: ");
        String name = scanner.nextLine();
        System.out.println("Введите адрес магазина: ");
        String address = scanner.nextLine();

        return "INSERT INTO shops(name, address) " +
                "VALUES ('" + name + "', '" + address + "');";
    }
    //Медот добаляющий пользователя в таблицу users
    public static String insertUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите количество денежных средств");
        String money = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        String yearOfBirth = scanner.nextLine();
        System.out.println("Введите месяц рождения: ");
        String monthOfBirth = scanner.nextLine();
        System.out.println("Введите день рождения: ");
        String dayOfBirth = scanner.nextLine();
        String date = yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth;

        return "INSERT INTO users(name, surname, money, birthday) " +
                "VALUES ('" + name + "', '" + surname + "', '" + money + "', '" + date + "');";
    }
}