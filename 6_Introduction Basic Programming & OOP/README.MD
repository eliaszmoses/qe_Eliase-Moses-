# (6) Introduction to Basic Programming & OOP (Object Oriented Programming)
## Materi 1 : Introduction Basic Programming
### Poin 1 : Java Programming (Definisi, dan Tools)
Bahasa pemrograman java merupakan bahasa pemrograman tingkat yang berorientasikan objek.
Bahasa pemrograman java tersusun dari bagian yang disebut _class_ 
_class_ terdiri dari beberapa metode yang melakukan pekerjaan dan melakukan tugasnya.
Java sendiri diciptakan oleh James Gosling tahun 1995 yang pada saat itu masih bekerja di Sun Microsystem. Java adalah bahasa yang general purposed, class-based, object-oriented, dan concurrent.
Tools yang bisa digunakan untuk menjalankan java seperti :
1. JDK (Java Development Kit) merupakan salah satu tools pendukung yang digunakan oleh _developer_ untuk proses _developing_,_debugging_, dan _monitoring_
   Di dalam JDK terdapat JRE (Java Runtime Environment) untuk mendukung aplikasi java agar bisa dijalankan. Saat ini Versi JDK terbaru yaitu JDK 11
2. IDE (Integrated Development Environment) merupakan aplikasi perangkat lunak yang membantu para pemrogram mengembangkan kode perangkat lunak secara efisien.
   Beberapa contih IDE yang bisa digunakan seperti : Bluej, NetBeans, Eclipse dan Intelij IDEA

### Poin 2 : Basic Programming
Dimulai dari Type data, Operator, Input/Output, Looping dan Branching
1. Type data & Array

   merupakan klasifikasi data yang mengenalkan kompilator atau penerjemah bagaimana programmer bermaksud untuk menggunakan data
   - Integer adalah tipe data 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar
   - String adalah kumpulan beberapa karakter (char)
   - Float merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal 7 digit
   - Double merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki kapasitas yang lebih besar 15 digit
   - Boolean merupakan sebuah tipe data yang memiliki 2 macam nilai, yaitu true dan false
   - Char merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter.
   
contoh : 
         
         String nohp = "081111000";

         int additionalNum;

         char A = 'a';

         float creditBalance;

         double totalBalance;
    
Array merupakan teknologi yang digunakan untuk menyimpan data bertipe serupa dalam sebuah larik. Contoh sebagaimana berikut ini :

    char [] alterra = new char [] ('a', 'l', 'e', 'r', 'r', 'a');serta penjelasannya adalah sebagai berikut :\
    char [] alterra = new char [7] ;
    alterra[0] = 'a';
    alterra[1] = 'l';
    alterra[2] = 't';
    alterra[3] = 'e';
    alterra[4] = 'r';
    alterra[5] = 'r';
    alterra[6] = 'a';

2. Operator

   merupakan instruksi yang diberikan untuk mendapatkan hasil dari proses tersebut.
   Operator dapat berupa :

   `Assignment                (=)
    Aritmetika                (+,-,*,/,%)
    Uner                      (+,-,++,--,!)
    Ekualitas dan Relational  (==,!=,>,>=,<,<=)
    Conditional               (&&,||)`


3. Input-Output

   Input merupakan instruksi untuk Nilai yang dimasukkan
   kemudian di proses serangkaian langkah yang dilakukan untuk mengelola input yang diberikan
   Output menampilkan hasil olah data 

4. Looping
   
   merupakan pernyataan atau instruksi yang diberikan kepada komputer agar mau melakukan sesuatu baik itu memproses data, menampilkan data, atau yang lainnya secara berulang.
   Pada bagian ini terdapat 3 perintah yang dapat kita lakukan yakni :
   - For (initialization; termination; increment) {statement(s)} )
   - While (Perulangan dengan menggunakan while digunakan jika proses saat kondisi terpenuhi)
   - Do while (Perulangan yang mempunyai fungsi yang sama dengan while, tetapi pengecekan kondisinya dilakukan di akhir)

5. Branching
   
   merupakan perintah untuk memanipulasi flow atau alur di dalam suatu perulangan.
   if-then adalah control flow statement yang paling dasar di dalam pemrograman java
   Else berarti ketika semua kondisi di dalam if bernilai false maka kode di dalam else akan dijalankan
   
