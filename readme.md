# Encapsulation Bank Account System (Java)

## Deskripsi Program

Program ini merupakan mini sistem sederhana berbasis Java yang menerapkan konsep **Encapsulation** pada Object Oriented Programming (OOP). Sistem ini mensimulasikan fungsi dasar dari sebuah rekening bank seperti membuat akun, melakukan deposit, withdraw, dan mengecek saldo.

Pada sistem ini atribut pada class dibuat **private** sehingga tidak dapat diakses langsung dari luar class. Akses terhadap data dilakukan melalui **getter dan setter** atau method tertentu agar data tetap terkontrol.

---

## Konsep OOP yang Digunakan

### 1. Encapsulation

Encapsulation digunakan dengan cara menyembunyikan atribut dalam class menggunakan access modifier **private**. Data hanya dapat diakses melalui method tertentu seperti getter dan setter.

### 2. Access Modifier

Program ini menggunakan:

* **private** untuk atribut
* **public** untuk method yang dapat diakses dari class lain

### 3. Getter dan Setter

Getter digunakan untuk mengambil nilai dari atribut, sedangkan setter digunakan untuk mengubah nilai atribut dengan aturan tertentu.

---

## Struktur Class

Program ini terdiri dari **3 class utama**:

### 1. BankAccount

Class ini menyimpan data rekening bank.

Atribut:

* name
* balance
* accountNumber
* status
* typeAccount

Method utama:

* getter untuk mengambil data
* setter untuk mengubah data
* setBalance() untuk menambah saldo
* reduceBalance() untuk mengurangi saldo

Class ini memiliki **2 constructor**:

1. Constructor tanpa saldo awal
2. Constructor dengan saldo awal dan tipe akun

---

### 2. BankService

Class ini berfungsi untuk menjalankan operasi pada rekening bank.

Method yang tersedia:

* `deposit()` → menambah saldo
* `withdraw()` → menarik saldo
* `checkBalance()` → menampilkan informasi rekening

Class ini juga memiliki **validation logic**, seperti:

* deposit harus lebih dari 0
* withdraw tidak boleh melebihi saldo

---

### 3. Encapsulation (Main Class)

Class ini berisi method `main()` yang digunakan untuk menjalankan program.

Pada class ini user dapat:

* memasukkan data rekening
* melakukan deposit
* melakukan withdraw
* melihat saldo akhir

---

## Contoh Output Program

```
Masukkan nomor rekening: 12345
Masukkan nama pemilik: Bayu
Masukkan saldo awal: 1000
Masukkan tipe akun: Regular

=== Data Rekening ===
Nama: Bayu
No Rekening: 12345
Saldo: 1000

Masukkan jumlah deposit: 500
Deposit berhasil: 500

Masukkan jumlah withdraw: 300
Withdraw berhasil: 300

=== Saldo Akhir ===
Nama: Bayu
No Rekening: 12345
Saldo: 1200
```

---
