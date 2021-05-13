package com.epam.test.automation.java.practice8;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.*;

public class SpecialDepositTest {
    BigDecimal baseAmount1 = new BigDecimal("1000.00");
    BigDecimal baseAmount2 = new BigDecimal("3000.00");

    @Test
    public void testIncome1() {
        BigDecimal expected = new BigDecimal("10.00");
        SpecialDeposit spDep = new SpecialDeposit (baseAmount1, 1);
        BigDecimal income = spDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome2() {
        BigDecimal expected = new BigDecimal("30.20");
        SpecialDeposit spDep = new SpecialDeposit (baseAmount1, 2);
        BigDecimal income = spDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testIncome3() {
        BigDecimal expected = new BigDecimal("183.32");
        SpecialDeposit spDep = new SpecialDeposit (baseAmount2, 3);
        BigDecimal income = spDep.income();
        assertEquals(income, expected);
    }

    @Test
    public void testCanToProlongPositive() {
        int period = 3;
        SpecialDeposit spDep = new SpecialDeposit (baseAmount2, period);
        assertTrue(spDep.canToProlong());
    }

    @Test
    public void testCanToProlongNegative() {
        int period = 3;
        SpecialDeposit spDep = new SpecialDeposit (baseAmount1, period);
        assertFalse(spDep.canToProlong());
    }
}