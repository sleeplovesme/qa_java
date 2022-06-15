package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // добавили раннер Parameterized
public class GetKittensParameterizedTest {

    private final int numberOfKittens; // текст, который передаётся в метод
    private final int expected; // ожидаемый результат

    // конструктор с параметрами
    public GetKittensParameterizedTest(int numberOfKittens, int expected) {
        this.numberOfKittens = numberOfKittens;
        this.expected = expected;
    }

    // метод для получения данных
    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][] {
                {2, 2},
                {10, 10},
        };
    }
    // тест
    @Test
    public void getKittensWithParamsReturnsNumberOfKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(numberOfKittens);
        assertEquals(expected, actual);
    }
}
