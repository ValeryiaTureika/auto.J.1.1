package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldSumZero() {
        CashbackHackService cashback = new CashbackHackService();

       int actual = cashback.remain(0);
       int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldSumFiveHundred() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldSumLimitValue1() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldSumLimitValue2() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldSumLimitValue3() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}