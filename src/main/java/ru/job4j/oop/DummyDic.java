package ru.job4j.oop;

import javax.swing.text.Position;

public class DummyDic {

    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String eng = word.engToRus("eng");
        System.out.println("Неизвестное слово. " + eng);
    }
}
