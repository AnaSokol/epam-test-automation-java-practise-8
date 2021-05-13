package com.epam.test.automation.java.practice8;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.*;

public class DepositTest {
    BigDecimal depositAmount = new BigDecimal(String.valueOf(1000));
    int depositPeriod = 2;
    BaseDeposit dep1 = new BaseDeposit(depositAmount, depositPeriod);

    @Test
    public void testGetAmount() {
         BigDecimal result = dep1.getAmount();
         BigDecimal expected = depositAmount;
         assertEquals(result, expected);
    }

    @Test
    public void testGetPeriod() {
        int result = dep1.getPeriod();
        int expected = depositPeriod;
        assertEquals(result, expected);
    }

    @Test
    public void testIncome() {
    }
}