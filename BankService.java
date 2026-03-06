/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation_pbo;

/**
 *
 * @author bayu
 */
public class BankService {
     public void deposit(BankAccount account, int amount) {

        if(amount > 0) {
            account.setBalance((int) amount);
            System.out.println("Deposit berhasil: " + amount);
        } else {
            System.out.println("Jumlah deposit tidak valid");
        }

    }

    public void withdraw(BankAccount account, int amount) {

        if(amount <= account.getBalance()) { // validation 2
            account.reduceBalance((int) amount);
            System.out.println("Withdraw berhasil: " + amount);
        } else {
            System.out.println("Saldo tidak cukup");
        }

    }

    public void checkBalance(BankAccount account) {

        System.out.println("Nama: " + account.getName());
        System.out.println("No Rekening: " + account.getAccountNumber());
        System.out.println("Saldo: " + account.getBalance());

    }
}
