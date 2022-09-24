package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    String film1 = "Бладшот - Начало";
    String film2 = "Вперёд";
    String film3 = "Отель Белград";
    String film4 = "Джентльмены";
    String film5 = "Человек-невидимка";
    String film6 = "Тролли.Мировой тур";
    String film7 = "Номер один";
    String film8 = "Властелин колец";
    String film9 = "Марвел";
    String film10 = "Человек паук";
    String film11 = "Терминатор";


    @Test
    public void test1() {

        Manager manager = new Manager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Manager manager = new Manager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Manager manager = new Manager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        Manager manager = new Manager();
        manager.add(film1);

        String[] actual = manager.findLast();
        String[] expected = {film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        Manager manager = new Manager();

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        Manager manager = new Manager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }

}

