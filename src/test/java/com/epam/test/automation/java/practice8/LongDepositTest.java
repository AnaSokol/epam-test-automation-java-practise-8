package com.epam.test.automation.java.practice8;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.*;

public class LongDepositTest {
    BigDecimal baseAmount = new BigDecimal("1000.00");

    @Test
    public void testIncome1() {
        int period = 2;
        BigDecimal expected = new BigDecimal("0");
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        BigDecimal income = longDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome6() {
        int period = 6;
        BigDecimal expected = new BigDecimal("0");
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        BigDecimal income = longDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome7() {
        int period = 7;
        BigDecimal expected = new BigDecimal("150.00");
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        BigDecimal income = longDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome8() {
        int period = 8;
        BigDecimal expected = new BigDecimal("322.50");
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        BigDecimal income = longDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome9() {
        int period = 9;
        BigDecimal expected = new BigDecimal("520.88");
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        BigDecimal income = longDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome10() {
        int period = 10;
        BigDecimal expected = new BigDecimal("749.01");
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        BigDecimal income = longDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testCanToProlongPositive() {
        int period = 9;
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        assertTrue(longDep.canToProlong());
    }

    @Test
    public void testCanToProlongNegative() {
        int period = 39;
        LongDeposit longDep = new LongDeposit (baseAmount, period);
        assertFalse(longDep.canToProlong());
    }
}