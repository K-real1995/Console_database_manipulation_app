package DbManipulation;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    //При вызове метода создается
    public static Connection connect;
    public static Statement statement;

    static {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:db_lu");
            statement = connect.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ;

    //Метод вызывающий стартовое меню
    public static void menu() throws SQLException {


        Scanner in = new Scanner(System.in);
        String menu = """
                ____МЕНЮ____
                1.Добавить данные в базу
                2.Найти данные в базе
                3.Удалить данные из базы
                4.Выход
                """;
        int choice;

        while (true) {
            System.out.println(menu);
            try {
                choice = in.nextInt();
                switch (choice) {
                    case 1 -> {
                        Scanner inAdd = new Scanner(System.in);
                        String menuAdd = """
                                ____Добавление данных____
                                1.Добавить автомобиль
                                2.Добавить магазин
                                3.Добавить пользователя
                                4.Назад
                                """;
                        System.out.println(menuAdd);
                        int choiceAdd = inAdd.nextInt();
                        if (choiceAdd == 1) {
                            try {
                                statement.executeUpdate(InsertDb.insertCar());
                                System.out.println("Автомобиль успешно добавлен");
                            } catch (Exception e) {
                                System.out.println("Введено не верное значение, порпробуйте еще раз");
                            }
                        } else if (choiceAdd == 2) {
                            try {
                                statement.executeUpdate(InsertDb.insertShop());
                                System.out.println("Магазин успешно добавлен");
                            } catch (Exception e) {
                                System.out.println("Введено не верное значение, попробуйте еще раз");
                            }

                        } else if (choiceAdd == 3) {
                            try {
                                statement.executeUpdate(InsertDb.insertUser());
                                System.out.println("Пользователь успешно добавлен");
                            } catch (Exception e) {
                                System.out.println("Введено не верное значение, порпробуйте еще раз");
                            }
                        } else if (choiceAdd == 4) ;
                        else {
                            System.out.println("Ошибка. Нет такого пункта меню попробуйте еще раз");
                        }
                    }

                    case 2 -> {
                        Scanner inSelect = new Scanner(System.in);
                        String menuSelect = """
                                ____Поиск данных____
                                1.Найти автомобиль
                                2.Найти магазин
                                3.Найти пользователя
                                4.Назад
                                """;
                        System.out.println(menuSelect);
                        int choiceSelect = inSelect.nextInt();
                        try {
                            if (choiceSelect == 1) {
                                ResultSet res = statement.executeQuery(SelectDb.SelectCar());
                                if (!res.next()) {
                                    System.out.println("По заданным параметрам автомобилей не найдено");
                                } else {
                                    String name1 = res.getString("name");
                                    String color1 = res.getString("color");
                                    String model1 = res.getString("model");
                                    String speed1 = res.getString("speed");
                                    System.out.println(name1 + "| " + color1 + "| " + model1 + "| " + speed1);
                                    while (res.next()) {
                                        name1 = res.getString("name");
                                        color1 = res.getString("color");
                                        model1 = res.getString("model");
                                        speed1 = res.getString("speed");
                                        System.out.println(name1 + "| " + color1 + "| " + model1 + "| " + speed1);
                                    }
                                }
                            } else if (choiceSelect == 2) {
                                ResultSet res = statement.executeQuery(SelectDb.SelectShop());
                                if (!res.next()) {
                                    System.out.println("Нет магазинов в базе данных, по заданному параметру");
                                } else {
                                    String name = res.getString("name");
                                    String address = res.getString("address");
                                    System.out.println(name + "| " + address);
                                    while (res.next()) {
                                        name = res.getString("name");
                                        address = res.getString("address");
                                        System.out.println(name + "| " + address);
                                    }
                                }
                            } else if (choiceSelect == 3) {
                                ResultSet res = statement.executeQuery(SelectDb.SelectUser());
                                if (!res.next()) {
                                    System.out.println("Нет пользователей в базе данных, по заданному параметру");
                                } else {
                                    String name = res.getString("name");
                                    String surname = res.getString("surname");
                                    String money = res.getString("money");
                                    String birthday = res.getString("birthday");
                                    System.out.println(name + "| " + surname + "| " + money + "| " + birthday);
                                    while (res.next()) {
                                        name = res.getString("name");
                                        surname = res.getString("surname");
                                        money = res.getString("money");
                                        birthday = res.getString("birthday");
                                        System.out.println(name + "| " + surname + "| " + money + "| " + birthday);
                                    }
                                }
                            } else if (choiceSelect == 4) ;
                            else {
                                System.out.println("Ошибка. Нет такого пункта меню попробуйте еще раз");
                            }
                        } catch (NullPointerException e) {
                        }
                    }


                    case 3 -> {
                        Scanner inDelete = new Scanner(System.in);
                        String menuDelete = """
                                ____Удаление данных____
                                1.Удалить автомобиль
                                2.Удалить магазин
                                3.Удалить пользователя
                                4.Назад
                                """;
                        System.out.println(menuDelete);
                        int choiceDelete = inDelete.nextInt();

                        if (choiceDelete == 1) {
                            try {
                                statement.executeUpdate(DeleteDb.deleteCar());
                            } catch (SQLException e) {
                                System.out.println("Введено не верное значение, порпробуйте еще раз");
                            }
                        } else if (choiceDelete == 2) {
                            try {
                                statement.executeUpdate(DeleteDb.deleteShop());
                                System.out.println("Запрос на удаление принят");
                            } catch (SQLException e) {
                            }

                        } else if (choiceDelete == 3) {
                            try {
                                statement.executeUpdate(DeleteDb.deleteUser());
                                System.out.println("Запрос на удаление принят");
                            } catch (NullPointerException e) {
                            }
                        } else if (choiceDelete == 4) ;
                        else {
                            System.out.println("Ошибка. Нет такого пункта меню попробуйте еще раз");
                        }
                    }
                    case 4 -> {
                        System.out.println("Выходим из программы...");
                        System.exit(0);
                        Menu.close(connect);
                    }
                    default -> System.out.println("Нет такого пункта меню попробуйте еще раз");
                }
            } catch (InputMismatchException e) {
                System.out.println("Нет такого пункта меню попробуйте еще раз");
            }
            in.nextLine();
        }
    }

    //Метод закрывающий соединение с базой данных
    public static void close(Connection connection){
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
