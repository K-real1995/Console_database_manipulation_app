package DbManipulation;

import java.util.Scanner;

public class SelectDb {
    //Метод вызывающий меню по поиску данных в таблице cars и возвращающий запрос к базе данных по заданным параметрам
    public static String SelectCar() {
        Scanner in = new Scanner(System.in);
        String menu = """
                ____Поиск автомобиля____
                1.Вывести все автомобили с параметрами
                2.Найти автомобили по марке
                3.Найти автомобили по цвету
                4.Найти автомобили по модели
                5.Найти автомобили по скорости
                6.Выход
                """;
        System.out.println(menu);
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                return "SELECT name, color, model, speed FROM cars;";
            }
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите марку автомобиля: ");
                String carBrand = scanner.nextLine();
                return "SELECT name, color, model, speed FROM cars WHERE name = '" + carBrand + "';";
            }
            case 3 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите цвет автомобиля: ");
                String carColor = scanner.nextLine();
                return "SELECT name, color, model, speed FROM cars WHERE color = '" + carColor + "';";
            }
            case 4 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите модель автомобиля: ");
                String carModel = scanner.nextLine();
                return "SELECT name, color, model, speed FROM cars WHERE model = '" + carModel + "';";
            }
            case 5 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите нижнюю границу максимальной скорости автомобиля: ");
                String carSpeedMin = scanner.nextLine();
                System.out.println("Введите верхнюю границу максимальной скорости автомобиля: ");
                String carSpeedMax = scanner.nextLine();
                return "SELECT name, color, model, speed FROM cars WHERE speed BETWEEN '" + carSpeedMin + "' AND '"
                        + carSpeedMax + "';";
            }
            case 6 -> {
                return null;
            }
            default -> {
                System.out.println("Введено не верное значение попробуйте еще раз");
                return null;
            }
        }
    }

    //Метод вызывающий меню по поиску данных в таблице shops и возвращающий запрос к базе данных по заданным параметрам
    public static String SelectShop() {
        Scanner in = new Scanner(System.in);
        String menu = """
                ____Поиск магазина____
                1.Вывести все магазины с параметрами
                2.Найти магазины по названию
                3.Выход
                """;
        System.out.println(menu);
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                return "SELECT name, address FROM shops";
            }
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите название магазина: ");
                String shopName = scanner.nextLine();
                return "SELECT name, address FROM shops WHERE name = '" + shopName + "';";
            }
            case 3 -> {
                return null;
            }
            default -> {
                System.out.println("Введено не верное значение попробуйте еще раз");
                return null;
            }
        }
    }

    //Метод вызывающий меню по поиску данных в таблице users и возвращающий запрос к базе данных по заданным параметрам
    public static String SelectUser(){
        Scanner in = new Scanner(System.in);
        String menu = """
                ____Поиск пользователя____
                1.Вывести всех пользователей с параметрами
                2.Найти пользователя по имени
                3.Найти пользователя по фамилии
                4.Найти пользователя по количеству денежных средств
                5.Найти пользователя по дате рождения
                6.Выход
                """;
        System.out.println(menu);
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                return "SELECT name, surname, money, birthday FROM users";
            }
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя пользователя: ");
                String userName = scanner.nextLine();
                return "SELECT name, surname, money, birthday FROM users WHERE name = '" + userName + "';";
            }
            case 3 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите фамилию пользователя: ");
                String userSurname = scanner.nextLine();
                return "SELECT name, surname, money, birthday FROM users WHERE surname = '" + userSurname + "';";
            }
            case 4 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите минимальное количество денежных средств: ");
                String userMinMoney = scanner.nextLine();
                System.out.println("Введите максимальное количество денежных средств: ");
                String userMaxMoney = scanner.nextLine();
                return "SELECT name, surname, money, birthday FROM users WHERE money BETWEEN '" + userMinMoney + "' AND '" + userMaxMoney + "';";
            }
            case 5 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите год рождения пользователя: ");
                String userYearOfBirth = scanner.nextLine();
                System.out.println("Введите месяц рождения пользователя: ");
                String userMonthOfBirth = scanner.nextLine();
                System.out.println("Введите день рождения пользователя: ");
                String userDayOfBirth = scanner.nextLine();
                return "SELECT name, surname, money, birthday FROM users WHERE birthday = '" + userYearOfBirth + "-" + userMonthOfBirth + "-" + userDayOfBirth + "';";
            }
            case 6 -> {
                return null;
            }
            default -> {
                System.out.println("Введено не верное значение попробуйте еще раз");
                return null;
            }
        }
    }
}
