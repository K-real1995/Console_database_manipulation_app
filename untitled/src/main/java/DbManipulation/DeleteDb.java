package DbManipulation;

import java.util.Scanner;

public class DeleteDb {
    //Метод вызывающий меню по удалению данных в таблице cars и возвращающий запрос к базе данных по заданным параметрам
    public static String deleteCar() {

        Scanner in = new Scanner(System.in);
        String menu = """
                ____Поиск автомобиля____
                1.Удалить все автомобили
                2.Удалить автомобиль по марке
                3.Удалить автомобиль по цвету
                4.Удалить автомобиль по модели
                5.Удалить автомобили по скорости
                6.Выход
                """;
        System.out.println(menu);
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("Все автомобили удалены");
            return "DELETE FROM cars;";
        } else if (choice == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите марку автомобиля: ");
            String carBrand = scanner.nextLine();
            return "DELETE FROM cars WHERE name = '" + carBrand + "';";
        } else if (choice == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите цвет автомобиля: ");
            String carColor = scanner.nextLine();
            return "DELETE FROM cars WHERE color = '" + carColor + "';";
        } else if (choice == 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите модель автомобиля: ");
            String carModel = scanner.nextLine();
            return "DELETE FROM cars WHERE model = '" + carModel + "';";
        } else if (choice == 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите нижнюю границу максимальной скорости автомобиля: ");
            String carSpeedMin = scanner.nextLine();
            System.out.println("Введите верхнюю границу максимальной скорости автомобиля: ");
            String carSpeedMax = scanner.nextLine();
            return "DELETE FROM cars WHERE speed BETWEEN '" + carSpeedMin + "' AND '" + carSpeedMax + "';";
        } else if (choice == 6) {
            return null;
        } else {
            System.out.println("Ошибка введено не верное значение");
            return null;
        }
    }

    //Метод вызывающий меню по удалению данных в таблице shops и возвращающий запрос к базе данных по заданным параметрам
    public static String deleteShop() {
        Scanner in = new Scanner(System.in);
        String menu = """
                ____Удаление магазина____
                1.Удалить все магазины
                2.Удалить магазин по названию
                3.Выход
                """;
        System.out.println(menu);
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("Все магазины удалены");
            return "DELETE FROM shops;";
        } else if (choice == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название магазина: ");
            String shopName = scanner.nextLine();
            return "DELETE FROM shops WHERE name = '" + shopName + "';";
        } else if (choice == 3) {
            return null;
        } else {
            System.out.println("Ошибка введено не верное значение");
            return null;
        }
    }

    //Метод вызывающий меню по удалению данных в таблице users и возвращающий запрос к базе данных по заданным параметрам
    public static String deleteUser(){
        Scanner in = new Scanner(System.in);
        String menu = """
                ____Удаление пользователей____
                1.Удалить всех пользователей
                2.Удалить пользователя по имени
                3.Удалить пользователя по фамилии
                4.Удалить пользоввателя по количеству денежных средств
                5.Удалить пользователя по дате рождения
                6.Выход
                """;
        System.out.println(menu);
        int choice = in.nextInt();
        if (choice == 1) {
            return "DELETE FROM users;";
        } else if (choice == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя пользователя: ");
            String userName = scanner.nextLine();
            return "DELETE FROM users WHERE name = '" + userName + "';";
        } else if (choice == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фамилию пользователя: ");
            String userSurname = scanner.nextLine();
            return "DELETE FROM users WHERE surname = '" + userSurname + "';";
        } else if (choice == 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите минимальную сумму денежных средств: ");
            String userMinMoney = scanner.nextLine();
            System.out.println("Введите максимальную сумму денежных средств: ");
            String userMaxMoney = scanner.nextLine();
            return "DELETE FROM users WHERE money BETWEEN '" + userMinMoney + "' AND '" + userMaxMoney + "';";
        } else if (choice == 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год рождения пользователя: ");
            String userYearOfBirth = scanner.nextLine();
            System.out.println("Введите месяц рождения пользователя: ");
            String userMonthOfBirth = scanner.nextLine();
            System.out.println("Введите день рождения пользователя: ");
            String userDayOfBirth = scanner.nextLine();
            return "DELETE FROM user WHERE birthday = '" + userYearOfBirth + "-" + userMonthOfBirth + "-" + userDayOfBirth + "';";
        } else if (choice == 6) {
            return null;
        } else {
            System.out.println("Ошибка введено не верное значение");
            return null;
        }
    }
}
