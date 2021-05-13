package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit> {
    public final BigDecimal amount;
    public final int period;

    public Deposit (BigDecimal depositAmount, int depositPeriod){
        amount = depositAmount;
        period = depositPeriod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public abstract BigDecimal income ();

    public BigDecimal totalSumAmount(){
        return income().add(amount);
    }

    @Override
    public int compareTo(Deposit o) {
        if (o != null){
            return this.totalSumAmount().compareTo(o.totalSumAmount());
        }
        return 1;
    }
}
