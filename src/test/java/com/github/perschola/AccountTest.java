package com.github.perschola;

/**
 * Imagine a couple, Ranjeet and Reema, who both have access to the account and want to make withdrawals.
 * But they don't want the account to ever be overdrawn.
 *  Create a class AccountTest that will start two threads and both thread trying to withdraw money
 *  from same account object in the loop.
 *  Withdrawal is two steps process:
 *  Check the balance.
 *  If there's enough in the account (withdraw 10), make the withdrawal. Wait 100 before withdraw
 */
public class AccountTest {
    public static void main(String[] args) throws InterruptedException {
        Account reemaAccount = new Account();
        Account rajeshAccount = new Account();

        Thread reemaThread = new Thread(reemaAccount, "Reema");
        Thread rajeshThread = new Thread(rajeshAccount, "Rajesh");

        reemaThread.start();
        reemaThread.sleep(100);
        rajeshThread.start();


    }
}
