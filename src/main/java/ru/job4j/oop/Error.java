package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public static void main(String[] args) {
        Error error = new Error(true, 500, "Внутренняя ошибка сервера");
        error.printInfo();
        Error exception = new Error(true, 402, "Страница не найдена");
        exception.printInfo();
        Error fault = new Error();
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Код ошибка: " + status);
        System.out.println("Описание: " + message);
    }
}
