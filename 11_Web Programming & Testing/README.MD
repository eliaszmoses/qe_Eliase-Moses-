# (11) Web Programming & Testing
## Materi 1 : Web Programming
### Poin 1 : Front-end
> Terdiri dari Frontend & Backend, Frontend adalah sebuah bagian dari website yang membuat tampilan yang menarik kepada user dengan menggunakan HTML, JS dan CSS.

HTML (Hypertext Markup Language) adalah sebuah standar yang digunakan secara luas untuk menampilkan halaman web.
Adapun kegunaan dari HTML yaitu :
- Membuat struktur dari halaman website.
- Mengatur tampilan dan isi dari halaman web.
- Membuat tabel dengan tag HTML table.
- Membuat form HTML.
- Membuat gambar dengan canvas.
- Mempublikasikan halaman website secara online.
Untuk HTML Editors yakni terdiri dari : Notepad, Visual Studio Code, Notpead++, dll
Adapun dokumentasi HTML nya menggunakan :

`<! DOCTYPE html> : mendefenisikan dokumen ini sebagai HTML5`

`<html> : elemen root dari halaman HTML`

`<head> : berisi informasi meta tentang dokumen`

`<title> : menentukan judul untuk dokumen`

`<body> : berisi konten halaman yang terlihat`

Styling pada Paragraph HTML :

`<strong>membuat text lebih tebal</strong>`

`<em>penekanan pada text menjadi _italic_</em>`

`<s>membuat text dengan garis tercoret</s>`

`<br/> (line break, untuk membuat garis baru)`

List HTML
Ada dua jenis List dalam HTML :
1. `Ordered List adalah list yang berurut. (<ol>)`
2. `Unordered List adalah list yang tak terurut. (<ul>)`

`Setiap list item pada Ordered List dan Unordered List dideklarasikan menggunakan tag <li>.`

Tag Table HTML terdiri dari :

`Membuat table pada HTML menggunakan tag <table></table>`

`Setiap baris table di deklarasikan menggunakan <tr></tr>`

`Setiap kolom table di deklarasikan menggunakan <td></td>`

`Untuk kolom pada tabel header menggunakan <th></th>`

### Poin 2. CSS (Cascading Style Sheets)

Adapun kegunaan dari CSS dapat menghias halaman web. (color, size, font, background, width, height, dll), Dapat mengatur posisi pada halaman web. (float, align, display, position,dll)
Terdapat 3 cara menambahkan file CSS ke dalam HTML :
1. External CSS 

   ` <link rel ="stylesheet" href="main.css"> syntax ini disisipkan ke dalam tag <head> pada HTML. Ekstensi file CSS adalah .css`

2. Internal CSS

    `Pada bagian ini terdapat syntax yang dapat digunakan di dalam satu file HTML. Dedefinisikan di dalam elemen <style>, di dalam bagian <head> atau di dalam bagian <body>.`

3. Inline CSS

    `Pada bagian ini terdapat syntax yang dapat digunakan untuk elemen tunggal pada HTML. Diprioritaskan untuk menerapkan style yang unik.`

CSS Selector yakni pola yang digunakan untuk memilih element, yang ingin di styling. Dimana terdapat HTML ke dalam CSS. Dapat menggunakan selector ID dan Class.
1. ID --> (#)
    - Setia
    - p elemen hanya dapat memiliki satu tag id
    - Dalam satu halaman tidak boleh ada dua penamaan id yang berbeda
2. Class --> (.)
    - Tag class dengan nama yang sama dapat dipakai berulang-ulang pada satu halaman.
    - Satu elemen boleh memiliki lebih dari satu Class yang berbeda-beda.

CSS Grouping yakni terdiri dari beberapa selector dapat dikelompokkan dalam satu deklarasi style.

CSS Font yakni merupakan kumpulan beberapa style font di css.

`Font        : Menetapkan semua properti font dalan satu deklarasi`

`Font-family : Menentukan kelompok font teks`

`Font-size   : Menentukan ukuran font teks`

`Font-weight : Menentukan ketebalan untuk font teks`

`Font-style  : Menentukan font teks menjadi miring`

CSS Margin & Padding untuk membuat ruang disekitar element.

CSS Background Beberapa style background di css.

`Background-color   : Menetapkan warna background pada suatu elemen`

`Backfround-image : Menentukan gambar background pada suatu elemen`

`Background-repeat  : Menentukan gambar background untuk di ulang`

`Background-size : Menentukan ukuran gambar untuk background`

`Background-position  : Mengatur posisi awal gambar background`

CSS Link event beberapa link event pada CSS

`: hover : Kondisi style ketika mouse berada diatas elemen.`

`: active : Style ketika link "a" ditekan.`

`: visited : Style dimana elemen link "a" telah di kunjungi / di klik.`

CSS Transisi Transisi CSS dapat mengubah value properti menjadi lebih halus dalam durasi yang ditentukan.

CSS Display untuk menentukan tampilan pada elemen.

`Block : Elemen block selalu dimulai pada baris baru. (dimulai dari kiri ke kanan)`

`Inline-block : Elemen inline-block membutuhkan lebar sesuai yang diperlukan.`

`None : Menyembunyikan elemen untuk tidak ditampilkan.`

CSS Table untuk membuat style pada elemen table HTML

`Border : Menambahkan border pada table, th dan td`

`Border-collapse : Membuat border menjadi single border`

`: nth-child (even) : Membuat background stripe`

### Poin 3 : Front End Framework
Front End Framework adalah sekumpulan aturan kode yang bisa kita gunakan untuk mempermudah dalam suatu tampilan website.
Kenapa dalam membuat Front End kita membutuhkan bootstrap karena gratis, mudah dipelajari, cepat dan mendukung responsif.

Class pada Bootstrap :

`Container   : container, container-fluid`

`Row         : row`

`Column      : col-md-12, col-lg-12,col-sm-6`

`Button      :btn-primary, btn-success, btn-danger`

## Materi 2 : Web Testing using Serenity BDD With Cucumber
### Poin 1 : Pengenalan Serenity BDD

> Serenity adalah kerangka kerja BDD sumber terbuka yang membantu membuat tes penerimaan otomatis yang terstruktur dengan baik dan dapat dipelihara.

Arsitektur Serenity terdiri dari Requirements, Tests, Steps, Pages, and Reports.

1. Define Requirements
- Ketika menggunakan serenity, kita memulainya dengan memenuhi kebutuhan yang dibutuhkan agar bisa dijalankan.
- Hal ini sering digunakan oleh "Stories" pengguna dengan kriteria penerimaan yang membantu meluruskan kebutuhan yang dibutuhkan.
- Bahwa "Stories" yang diotomatisasi oleh Serenity

Adapun kriteria yang diautomtisasi yakni :
- Menjelaskan kriteria yang diterima pada syarat bisnis tingkat tinggi.
- Merekam kriteria yang diterima dengan menggunakan BDD tool seperti cucumber dengan bentuk "feature" sehingga Serenity dapat menjalankannya.

Jalankan tesnya :
- Dalam mengimplementasikan kriteria yang diterima dalam kode, sehingga kode-kode tersebut dapat berjalan berlawanan dengan yang sebenarnya.
- Dibawah lapisan kode yang ada, pengujian diuraikan menjadi langkah-langkah bertingkat untuk membaca dengan lebih baik dan mempermudah pemeliharaan.

Melaporkan hasil pengujian :
Serenity memberikan laporan rinci dari hasil pengujian dan eksekusi nya mencakup :
- Sebuah teks berbentuk narasi untuk setiap testnya
- Sebuah teks berbentuk deskriptif untuk menjelaskan hasil testnya
- Tangkapan layar untuk setiap langkah pengujian
- Hasil pengujian mencakup waktu dilaksanakannua dan pesan error jika pengujian dilakukan gagal.

### Poin 2 : BDD Framework with Cucumber
Terdapat beberapa tahap dalam BDD menggunakan cucumber yakni :
1. Write story --> Gherkin Syntax (Given, When, Then)
2. Configure Stories --> Menyiapkan stories dan langkah-langkahnya
3. Browser Interaction --> Peta langkah-langkah untuk melakukan manipulasi web
4. Run Stories --> Menggunakan intelij IDEA yakni maven (pom.xml)
5. View Reports --> Membuat laporan menggunakan serenity

Penulisan untuk test :
1. Serenity cucumber
2. Membuat file untuk Stories
3. Membuat file untuk Test Class
4. Membuat file untuk Test Steps
5. Membuat file untuk Page Objects

### Poin 3 : Digging Deeper (Serenity with Cucumber)
Serenity Properties :
- Serenity mendukung berbagai properties untuk menjalankan pengujian 
- Webdriver.driver mengartikan browser mana yang akan digunakan untuk pengujian
- Ignore.failures.in.stories menetapkan nilai variabel serenity nya untuk melanjutkan pengujian skenario berikutnya walaupun scenario yang ada gagal.






