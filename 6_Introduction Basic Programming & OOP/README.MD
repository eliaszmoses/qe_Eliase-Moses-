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

## Materi 2 : Object Oriented Program
### Poin 1 : Apa itu OOP (Object Oriented Program) ? 
Suatu metode pemrograman yang fokus atau berorientasi pada objek. Tujuan nya adalah membantu para developer dalam mengembangkan model yang sudah ada di kehidupan sehari-hari.
Prinsip-prinsip OOP terdiri dari :
1. Encapsulation
   > Konsep tentang pengikatan data/metode berbeda yang di satukan atau "dikapsulkan" menjadi satu unit data. 
     Encapsulation dapat memudahkan dalam pembacaan kode karena informasi yang disajikan tidak perlu di baca secara rinci dan sudah merupakan satu kesatuan.
     Dalam Encapsulation terdapat fitur _information-hiding mechanism_. 

2. Inheritance
   > Konsep ini menggunakan sistem hierarki atau bertingkat. Prinsip ini membentuk class baru yang "mewarisi" atau memiliki bagian-bagian dari class yang sudah ada sebelumnya.

3. Abstract Class
   > Konsep ini adalah class-class yang memiliki informasi abstrak dan metode-metode dari sekumpulan data. Konsep ini tidak bisa di ubah dan berlaku juga sebagai kerangka dalam penciptaan berbagai subclass (berperan seperti Superclass yang di bahas di konsep Inheritance).
   
4. Polymorphism
   > Konsep ini memiliki objek yang berbeda-beda dapat di akses melalui satu interface. Sebuah objek polymorphic dapat beradaptasi dengan metode apapun yang di implementasikan pada objek tersebut, dan setiap class memiliki interpretasinya tersendiri terhadap interfacenya. 
     Dalam Java, terdapat 2 jenis polymorphism yaitu Static Polymorphism dan Dynamic Polymorphism. 
   > - Static Polymorphism yang umum di gunakan adalah Method Overloading. Method Overloading mengizinkan kalian untuk menerapkan beberapa implementasi metode berbeda dalam kelas yang sama namun dengan parameter berbeda-beda. 
   > - Dynamic Polymorphism sebuah subclass dapat menimpa metode dari superclassnya. Jika kalian menerapkan subclass tersebut, Java Virtual Machine akan selalu menggunakan metode yang sudah di timpa.

### Poin 2 : Apa itu class, object, method, inheritance ?
Class adalah blueprint, prototype atau cetakan untuk membuat Object. Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object
Setiap Object dibuat dari Class dan sebuah Class bisa membuat Object sebanyak-banyaknya.

Contoh : Pada powerpoint terdapat motor terdiri dari :
         berbagai motor terdiri dari jenis motor matic, manual, dll
         terdiri dari : Mesin, Roda, Lampu dan Jorok.

Object adalah data yang berisi field / properties / attributes dan method / function / behavior. Terdiri dari :
1. Declaration : mendeklarasikan nama sebuah objek
2. Instantiation : memerlukan sebuah perintah new untuk menciptakan objek
3. Initialization : inisialisasi dari sebuah objek setelah perintah new

Contoh : Motor =====>  Objek motor = new Motor () ;

Fungsi dan Prosedur di dalam pemrograman java disebut sebagai method.
Method/Metode di dalam kelas adalah block statement yang memiliki nama dan bisa dieksekusi dengan memanggilnya

Access Modifier adalah sebuah “hak akses” yang diberikan kepada sebuah variabel/method/class dengan tujuan untuk menjaga integritas dari data tersebut ketika ingin diakses object lain.

Hak akses sendiri diberikan oleh pembuat program sebagai salah satu bentuk implementasi dari OOP itu sendiri.

Di bahasa JAVA sendiri ada 4 jenis access modifier yang dapat digunakan :
1. Public
>  Access modifier public mempunyai hak akses paling luas dibanding yang lainnya. Karena aksesnya sangat luas, maka access modifier ini biasanya digunakan untuk method setter getter sesuai konsep OOP.

2. Default
>  Sesuai namanya, hak akses yang satu ini tidak perlu dituliskan di method/variabelnya. Dengan hak akses ini, variabel/method dapat diakses dari class lain asalkan masih dalam satu package yang sama.

3. Private
>  Sesuai namanya, hak akses yang satu ini tidak perlu dituliskan di method/variabelnya.
   Dengan hak akses ini, variabel/method dapat diakses dari class lain asalkan masih dalam satu package yang sama.

4. Protected
>  Access modifier protected biasanya digunakan untuk mewariskan variabel yang ada di super class terhadap child class.

`Access modifier private akan membatasi akses hanya di dalam class`

`Default modifier berarti penulisan kodenya tanpa atribut modifier. Modifier default bisa diakses selama masih dalam satu package`

`Protected modifier bisa diakses selama masih dalam satu package, perbedaan dengan default Access modifier protected bisa diakses selama masih dalam satu package dengan syarat kelas yang hendak mengakses, merupakan kelas turunannya`

`Public modifier bisa kita sebut sebagai modifier global.`

> Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.

Dalam artian, kita bisa membuat class Parent dan class Child.

Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki oleh class Child
Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya.

