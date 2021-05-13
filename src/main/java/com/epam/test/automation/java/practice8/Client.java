package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Client implements Iterable<Deposit>{
    private Deposit[] deposits;
    private int count;

    public Client (){
        this.deposits = new Deposit[10];
        count = 0;
    }
    public boolean addDeposit(Deposit deposit) {
        if (count < deposits.length && deposits[count] == null) {
            deposits[count] = deposit;
            count++;
            return true;
        }
        return false;
    }
    public BigDecimal totalIncome(){
        BigDecimal totalIncome = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length; i++){
            if (deposits[i] == null) break;
            totalIncome = totalIncome.add(deposits[i].income());
        }
        return totalIncome;
    }
    public BigDecimal maxIncome (){
        BigDecimal maxIncome = deposits[0].income();
        for (int i = 1; i < deposits.length; i++) {
            if (deposits[i] == null) break;
            if (maxIncome.compareTo(deposits[i].income()) < 0) {
                maxIncome = deposits[i].income();
            }
        }
        return maxIncome;
    }
    public BigDecimal getIncomeByNumber (int number){
        if (number >= deposits.length || deposits[number] == null){
            return BigDecimal.ZERO;
        }
        return deposits[number].income();
    }

    public Iterator<Deposit>iterator(){
        return Arrays.asList(deposits).iterator();
    }

    public void sortDeposits(){
        Arrays.sort(deposits, Comparator.nullsLast(Comparator.reverseOrder()));
    }

    public int countPossibleToProlongDeposit(){
        int count = 0;
        for (Deposit deposit: deposits){
            if (deposit instanceof SpecialDeposit || deposit instanceof LongDeposit){
                if (((Prolongable) deposit).canToProlong()){
                    count++;
                }
            }
        }
        return count;
    }
}