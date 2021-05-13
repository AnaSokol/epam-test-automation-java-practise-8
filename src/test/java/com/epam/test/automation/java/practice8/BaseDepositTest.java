package com.epam.test.automation.java.practice8;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.*;

public class BaseDepositTest {

    @Test
    public void testIncome1() {
        BigDecimal baseAmount = new BigDecimal("3000");
        int period = 1;
        BaseDeposit baseDep = new BaseDeposit(baseAmount, period);
        BigDecimal income = baseDep.income();
        BigDecimal expected = new BigDecimal("150.00");
        assertEquals(income, expected);
    }

    @Test
    public void testIncome2() {
        BigDecimal baseAmount = new BigDecimal("3000");
        BaseDeposit baseDep = new BaseDeposit(baseAmount, 6);
        BigDecimal income = baseDep.income();
        BigDecimal expected = new BigDecimal("1020.29");
        assertEquals(income, expected);
    }

    @Test
    public void testIncome3() {
        BigDecimal baseAmount = new BigDecimal("1000");
        BaseDeposit baseDep = new BaseDeposit(baseAmount, 3);
        BigDecimal income = baseDep.income();
        BigDecimal expected = new BigDecimal("157.62");
        assertEquals(income, expected);
    }
}