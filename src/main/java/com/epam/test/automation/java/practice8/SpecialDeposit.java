package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit implements Prolongable {

    public SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal monthlyIncome;
        BigDecimal depositedSum = getAmount();
        int period = getPeriod();
        BigDecimal baseAmount = depositedSum;
        BigDecimal endSum = depositedSum;
        BigDecimal bd100 = new BigDecimal(String.valueOf(100));
        for (int i = 0; i < period; i++){
            BigDecimal interest = new BigDecimal(String.valueOf(i+1)).divide(bd100);
            monthlyIncome = (baseAmount.multiply(interest));
            endSum = baseAmount.add(monthlyIncome);
            baseAmount = endSum;
        }
        BigDecimal totalIncome = endSum.subtract(depositedSum);
        return totalIncome.setScale(2, RoundingMode.HALF_EVEN);
    }

    public boolean canToProlong() {
        BigDecimal minToProlong = new BigDecimal("1000");
         return amount.compareTo(minToProlong) > 0;
    }
}