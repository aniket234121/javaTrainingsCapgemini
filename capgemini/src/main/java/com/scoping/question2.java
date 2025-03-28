package com.scoping;

public class question2 {
    public static boolean isInRange(int num1,int low,int high)
    {
        if(num1<=high&&num1>=low)
            return true;
        else
            return false;
    }
    public static int Transactions(int balance,int amount,int transactions,boolean minus)
    {
        if(minus&& transactions<4)
            return balance-amount+2;
        else if(minus)
            return balance-amount;

        if(transactions<4&&!minus)
        return balance+amount+2;
        else
            return balance+amount;

    }

    public static void trackBalance(int balance,int userCount)
    {
        byte transactions=0;
        if(userCount<=100)
        {
            balance+=100;
        }
        //transactions
        balance=Transactions(balance,25,transactions,true);
        transactions++;
        balance=Transactions(balance,20,transactions,true);
        transactions++;
        balance=Transactions(balance,50,transactions,false);
        transactions++;
        System.out.println(balance +" final Balance");

    }
    public static void main(String[] args) {
        trackBalance(0,52);
        if(isInRange(53,20,80))
        System.out.println("in Range");
        else
            System.out.println("not in Range");
    }
}
