/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulation_pbo;

/**
 *
 * @author bayu
 */
import java.util.Scanner;

public class Encapsulation_pbo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor rekening: ");
        String accountNumber = input.nextLine();

        System.out.print("Masukkan nama pemilik: ");
        String name = input.nextLine();

        System.out.print("Masukkan saldo awal: ");
        int balance = input.nextInt();

        System.out.print("Masukkan tipe akun (Regular/Premium): ");
        input.nextLine(); // untuk clear enter
        String type = input.nextLine();

        BankAccount acc1 = new BankAccount(accountNumber, name, balance, type);
        BankService service = new BankService();

        System.out.println("\n=== Data Rekening ===");
        service.checkBalance(acc1);

        System.out.print("\nMasukkan jumlah deposit: ");
        int deposit = input.nextInt();
        service.deposit(acc1, deposit);

        System.out.print("\nMasukkan jumlah withdraw: ");
        int withdraw = input.nextInt();
        service.withdraw(acc1, withdraw);

        System.out.println("\n=== Saldo Akhir ===");
        service.checkBalance(acc1);

    }
}

