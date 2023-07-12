Backend API untuk aplikasi e-commerce sederhana
Kelas Main digunakan untuk menjalankan server HTTP menggunakan HttpServer dari package com.sun.net.httpserver. Dalam metode main, Saya membuat instance HttpServer dengan mendefinisikan host dan port yang digunakan (localhost:8074). Kemudian, Saya membuat ecommerceHandler sebagai HttpHandler untuk menangani permintaan HTTP.

Dalam kelas ecommerceHandler, terdapat metode handle yang akan dipanggil ketika permintaan HTTP diterima. Saat metode handle dipanggil, Saya melakukan pemeriksaan terhadap metode permintaan. Jika permintaan adalah GET, Saya mengirimkan respons dengan menulis "Elma" ke OutputStream. kode juga mencakup kelas Table yang digunakan untuk membuat tabel-tabel dalam database SQLite. Tabel-tabel yang dibuat adalah "addresses", "users", "reviews", "products", "orders", dan "OrderDetails". Kode ini menjamin bahwa tabel-tabel ini ada dalam database dan telah diinisialisasi dengan kolom-kolom yang sesuai.

Secara keseluruhan, kode ini menyediakan dasar untuk membuat server HTTP sederhana dan mengelola tabel-tabel dalam database SQLit

Kelas Table digunakan untuk membuat tabel-tabel dalam database SQLite menggunakan JDBC. Metode createNewTable digunakan untuk menjalankan perintah SQL untuk membuat tabel-tabel yang diperlukan. Saya menggunakan Connection untuk terhubung ke database, kemudian membuat statement dan menjalankan perintah SQL menggunakan Statement.

Dalam metode main di kelas Table, Saya memanggil createNewTable untuk membuat tabel-tabel dalam database.

Dalam alur coding tersebut, proyek ini berfungsi sebagai server HTTP sederhana yang menerima permintaan GET dan mengembalikan respons dengan teks "Elma". Selain itu, terdapat juga fitur untuk membuat tabel-tabel dalam database SQLite menggunakan JDBC.

Untuk mengatur dan menghubungkan database dengan IntelliJ IDEA, dapat menggunakan plugin yang sesuai seperti "SQLite Database Browser" atau "DataGrip" yang dapat diinstal melalui repositori plugin IntelliJ IDEA. Dengan menggunakan plugin tersebut, Anda dapat terhubung dan mengelola database SQLite secara visual.

Pada kelas database, Kelas Database bertanggung jawab untuk mengelola koneksi ke database SQLite. Kelas ini menyediakan metode-metode untuk menjalin dan mengelola koneksi ke database. Konstruktor ini digunakan untuk membuat objek Database dan menginisialisasi koneksi ke database SQLite dengan nama file ecommerce.db.

Pada kelas tesconnect, Kelas tesconnect merupakan kelas yang digunakan untuk melakukan pengujian koneksi ke database menggunakan kelas Database. 
Kelas tesconnect berada dalam package org.example. Metode main adalah metode utama yang akan dieksekusi saat menjalankan program. Pada metode ini, kita memanggil metode Connection() dari kelas Database untuk menguji koneksi ke database.
