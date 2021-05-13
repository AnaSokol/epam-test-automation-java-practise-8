package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit implements Prolongable {

    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal monthlyIncome;
        int period = getPeriod();
        BigDecimal depositedSum = getAmount();
        BigDecimal baseAmount = depositedSum;
        BigDecimal endSum = depositedSum;
        BigDecimal interest = new BigDecimal(String.valueOf(0.15));

        if (period <= 6){
            return BigDecimal.ZERO;
        }
        else {
            for (int i = 0; i < period; i++){
                if (i > 5){
                    monthlyIncome = (baseAmount.multiply(interest));
                    endSum = baseAmount.add(monthlyIncome);
                    baseAmount = endSum;
                }
            }
            BigDecimal totalIncome = endSum.subtract(depositedSum);
            return totalIncome.setScale(2, RoundingMode.HALF_EVEN);
        }
    }

    @Override
    public boolean canToProlong() {
       return period < 36;
    }
}