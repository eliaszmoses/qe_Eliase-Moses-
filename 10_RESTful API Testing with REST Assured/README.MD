# (10) RESTful API Testing with REST Assured
## Materi 1 : API Automation Testing with Rest Assured
### Poin 1 : Rest API (API Concept and Fundamental)
> User (Mobile App) memesan yang diinginkan kepada Waiter (API) kemudian mengantarkan pesanan yang diinginkan kepada Kitchen (Application).

> Kitchen (Appilcation) merespon keinginan dari pelanggan dan memproses nya kemudian setelah selesai dikembalikan ke pelanggan melalui Waiter (API) makanan/yang diinginkan disajikan dihadapan User (Mobile App)

Dasar dari Integrasi API yakni :

> Mobile App > API Server > Ext Process > API Testing

Dasar dari API :
Test Process terdiri dari :
Mencatat, dan mendefenisikan informasi API > Mengurai, menyaring atau merekam data API dan mengekstrak > Perancangan untuk memanggil API, dan mengirim API tersebut untuk menjalankan client > melakukan validasi pada tes

Piramida tes praktis terdiri dari : UI, Integration, Komponen dan UNIT.
1. Pada UI merupakan bagian (End to End) untuk menguji interaksi yang terjadi keseluruhan melalui tampilan pengguna
2. Integration merupakan bagian pengujian terhadap interaksi yang terjadi antara dua materi or sub-system melalui API contract
3. Component merupakan bagian pengujian untuk merinci modules or sub-system melalui API
4. UNIT merupakan pengujian yang dilakukan dengan menguji bagian yang bisa diuji dari aplikasi melalui metode.

### Poin 2 : BDD With Cucumber terdiri dari beberapa tahap :
1. Write Story menggunakan bahasa Gherkin Syntax (Given, When, Than).
2. Map Steps to Java langkah mengkonfigurasi script dan melakukan validasi.
3. Configure Stories langkah dengan mengkombinasikan stories dan keseluruhan langkah.
4. Run Stories dengan menggunakan Intelij IDEA maven.
5. View Reports membuat laporannya menggunakan Serenity.

## Materi 2 : Rest Assured (Features and Writing Test)
### Poin 1 : REST ASSURED and The Features
Tahap-tahap yang dilakukan yaitu : 
1. Mendukung for HTTP methods.
2. Mendukung for BDD/Gherkin (Given, When, Then)
3. Menggunakan Hamcrest dicocokan untuk checks (equalTo)
4. Pengguna dari Gpath memilih element dari respon JSPON

Persiapan yaitu dengan mendownload dan meng-install : JAVA 1.8, Maven 3.5.2 dan Intellij IDEA 2018
Apa keuntungan dari menggunakan REST Assured yakni :
1. Memberikan berbagai metode untuk : memformat permintaan HTTP, Mengirimkan HTTP ke jaringan, melakukan validasi terhadap permintaan HTTP dan melakukan validasi respon data.
2. Menangani berbagai mekanisme auntetikasi untuk permintaan REST : Autentikasi dasar (dengan password dan username), OAuth, OAuth 2.0, Certificates, Digest and autentikasi berdasarkan pada formulir yang ada.