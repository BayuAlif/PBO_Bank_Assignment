/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation_pbo;

/**
 *
 * @author bayu
 */
public class BankAccount {
    private String name;
    private int balance;
    private String accountNumber;
    private boolean status;
    private String typeAccount;

    //pakai contstructor untuk saat membuat rekening kita belum menentukan saldo awal dan jenis akunnya 
    public BankAccount(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0;
        this.typeAccount = "Regular";
        this.status = true;
    }

    //pakai constructor ini untuk kalau ingin langsung menentukan saldo awal adn tipe akun
    public BankAccount(String accountNumber, String name, int balance, String typeAccount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.status = true;
    }
}
