# (13) Mobile Automation Testing with Apium
## Materi 1 : Appium Intro
### Poin 1 : Appium Intro, Installing Apium and Running Appium Desktop & Inspector
Appium adalah kerangka kerja otomatisasi untuk pengguna mobile dalam menjalankan pengujian otomatisasi untuk mobile.

Appium mendukung banyak bahasa pemrograman seperti java, python, javascript, ruby, dll
Appium library diciptakan dari selenium library. Ini dapat mendukung Android, iOS, dan aplikasi windows/

Komponen-komponen yang terdapat dalam appium terdiri atas 2 komponen utama yakni :
- Appium server : server appium digunakan sebagai penghubung yang mengatur pengujian dalam perangkat. Terdapat dua versi, kita bisa menggunakan antara appium desktop atau menginstall appium command using npm.
- Appium client : Perpustakaan ditulis dalam beberapa bahasa untuk menciptakan pengujian script sehingga kita dapat menggunakan command ke server appium.

Cara install Appium antara lain :
1. Membutuhkan Java JDK 8/11 
2. Menginstall platform SDK & command line tools
3. Appium Desktop
4. Node JS
5. Appium-doctor

Untuk menjalankan Appium di Desktop dan inspector yang perlu dilakukan yaitu :
- Menghubungkan perangkat
- Melakukan pemeriksaan terhadap perangkat yang terhubung
- Menjalankan Appium di Desktop
- Menggunakan Appium Inspector
- Kapabilitas yang diinginkan
- Mengisi kapabilitas yang diinginkan
- Menggunakan Appium Inspector
- Menggunakan Appium Locators

### Poin 2 : Project Initialization & Appium Basic Action 

Untuk memulai projek yang kita perlukan menggunakan Maven Archetype, digunakan untuk menjalankan projek dengan semua dependency dan struktur dasar.

Serenity memiliki archetype library dimana kita dapat menjalankan sampel proyek menggunakan command line atau menggunakan IDE

Dengan menambahkan Appium Java Client

1. Appium Basic Action menggunakan kerangka kerja Cucumber :
- Cucumber BDD merupakan kerangka kerja yang mendukung penciptaan BDD Automation Test
- Menggunakan sintaks Gherkin
- Mendukung berbagai bahasa pemrograman seperti Java, Ruby, Javascriptm Python, etc
- Memiliki fitur yang hebat dan didukung oleh intellij IDEA
- Di serenity kita sudah menambahkan cucumber dependency

2. Cara menambahkan fitur file dengan melakukan cara berikut :
- Ciptakan "features" kemudian, letakkan di bawah src/test/resource
- Ciptakan file baru dengan nama Login.feature
- Ketikkan fitur file yang diinginkan

3. Mempetakan setiap scenario langkah demi langkah :
- Kita membutuhkan peta dalam setiap langkah dalam single functions didalam Steps Definition Class.
- Kita dapat membuat satu stepsdefiniition class untuk satu halaman objek class

4. Menginstall Appium
- Kita membutuhkan class untuk memulai dan memberhentikan sesi appium dan menyimpan nya dalam driver
- Kita perlu mengintegrasikan appium dengan cucumber untuk memastikan sebelum setiap scenario dimulai, ini akan menciptakan sesi appium pertama dan merusak nya jika scenario nya telah selesai.
- class tersebut kita panggil dengan nama AndroidDriverInit.

5. Menambahkan kapabilitas yang diinginkan

6. Menginstall appium

7. Cucumber hooks

### Poin 3 : Appium Complex Actions & Maximizing the Project Structure
 Pada poin ini membahas tentang webdriverwait, The BasePageObject class, The TouchAction class, Taking Screenshot dan Configuration file.
 