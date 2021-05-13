package com.epam.test.automation.java.practice8;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.math.BigDecimal;

public class ClientTest {
    BigDecimal amount = new BigDecimal("1000");
    BigDecimal amount2 = new BigDecimal("1200");

    Deposit bd1 = new BaseDeposit(amount, 1);
    Deposit bd2 = new BaseDeposit(amount, 2);
    Deposit bd3 = new BaseDeposit(amount, 3);
    Deposit sd4 = new SpecialDeposit(amount2, 1);
    Deposit sd5 = new SpecialDeposit(amount2, 2);
    Deposit ld6 = new LongDeposit(amount, 2);
    Deposit ld7 = new LongDeposit(amount, 10);
    Deposit ld8 = new LongDeposit(amount, 7);
    Deposit sd9 = new SpecialDeposit(amount2, 3);
    Deposit ld10 = new LongDeposit(amount, 12);

    Client deposits = new Client();

    @Test
    public void testAddDeposit1() {
        boolean actual = deposits.addDeposit(bd1);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void testAddDeposit10() {
        deposits.addDeposit(bd2);
        deposits.addDeposit(bd3);
        deposits.addDeposit(sd4);
        deposits.addDeposit(sd5);
        deposits.addDeposit(ld6);
        deposits.addDeposit(ld7);
        deposits.addDeposit(ld8);
        deposits.addDeposit(sd9);
        boolean actual = deposits.addDeposit(ld10);
        boolean expected = true;
        assertEquals(actual, expected);
    }
    @Test
    public void testAddDeposit11() {
        boolean addDep11 = deposits.addDeposit(bd1);
        boolean expected = false;
        assertEquals(addDep11, expected);
    }

    @Test
    public void testTotalIncome() {
        BigDecimal actual = deposits.totalIncome();
        BigDecimal expected = new BigDecimal("2643.76");
        assertEquals(actual, expected);
    }

    @Test
    public void testMaxIncome() {
        BigDecimal actual = deposits.maxIncome();
        BigDecimal expected = new BigDecimal("1313.06");
        assertEquals(actual, expected);
    }

    @Test
    public void testGetIncomeByNumber1() {
        BigDecimal actual = deposits.getIncomeByNumber(1);
        BigDecimal expected = new BigDecimal("102.50");
        assertEquals(actual, expected);
    }

    @Test
    public void testGetIncomeByNumber2() {
        BigDecimal actual = deposits.getIncomeByNumber(2);
        BigDecimal expected = new BigDecimal("157.62");
        assertEquals(actual, expected);
    }

    @Test
    public void testGetIncomeByNumberOutOfReach() {
        BigDecimal actual = deposits.getIncomeByNumber(13);
        BigDecimal expected = new BigDecimal("0");
        assertEquals(actual, expected);
    }

}