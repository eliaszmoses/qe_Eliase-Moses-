# (9) From Manual to Automation Testing & Behaviour Driven Development
## Materi 1 : From Manual to Automation Testing
### Poin 1 : Manual Testing
Pengujian manual adalah pengujian yang dilakukan secara manual oleh QA. QA memeriksa semua fitur pada _software_, untuk memastikan ada atau tidaknya bug dalam _software_. Tujuan dari Pengujian manual ini adalah untuk eksplorasi dan observasi.
Pengujian manual berperan penting saat pengujian visual dimana automation tools tidak dapat melakukan.

Kenapa manual testing ? karena bisa dieksplorasi, cepat dan kegunaannya lebih mudah

> Kelebihan manual testing
- **Mendapatkan umpan balik visual**. Tools dan Scripts tidak dapat membantu dalam memberikan opini maupun input mengenai tampilan UI/UX.
- **Unsur manusia**. Bisa mendapatkan umpan balik dari orang secara langsung sehingga mengetahui apa yang user suka dan tidak suka
- **Lebih murah dalam proyek jangka pendek**. Jika hanya melakukan tes aplikasi sederhana yang tidak terlalu banyak updates maka manual testing tidak perlu menggunakan tools ataupun software yang mahal.

> Kekurangan manual testing
- **Kurang teliti daripada automation testing**. Kadang adanya human error atau ketidaktelitian, sehingga jika menggunakan automatioj testing akan mengurangi bug yang akan terlewat.
- **Tidak dapat didaur ulang**. Jika menemukan banyaknya perubahan maka harus melakukan pengecekan secara manual kembali dari awal agar memastikan perubahan baru tidak akan merusak aplikasi yang sudah jadi.
- **Kelelahan terhadap tester**. Jika QA tester sudah sangat familiar dengan aplikasi yang selalu dia tes secara terus menerus sehingga membuat QA tester sangat memahami alur dari aplikasi tersebut. Sehingga hal ini akan menyebabkan kelelahan dan kesalahan maka melewatkan beberapa hal dan membuat kesalahan.

### Poin 2 : Automation Testing
Automation test bergantung pada pra-scripted tes yang berjalan secara otomatis, fungsinya untuk membandingkan hasil yang diharapkan dengan hasil yang sebenarnya. Sehingga dapat mengetahui apakah aplikasi berjalan sesuai dengan apa yang diharapkan,  menggunakan automation testing dapat dilakukan secara berulang. Pada automation testing dibutuhkan tools untuk melakukan pengujiannya, seperti Selenium IDE.

Kenapa automation testing ? karena fleksibel, cepat, dibungkus dengan rapi dan dapat menghidari error

> Kelebihan automation testing
- **Dapat menemukan bug lebih banyak dari manual tester**. Script dapat mencari lebih dalam, sehingga dapat menemukan bug yang tester tidak dapat ditemukan.
- **Kecepatan dan efisiensi**. Script lebih cepat dari tester, sehingga dapat cepat selesai dalam menemukan bug.
- **Test reusable**. Jika selalu mendapatkan update dan perubahan masing-masing unit/feature, maka tidak perlu menulis ulang scripts setiap saat dan dapat digunakan kembali pada regression testing.

> Kekurangan automation testing
- **Lebih mahal**. Karena menggunakn tools maka pengerjaan menggunakan automation testing akan mahal, namun tetap menghemat waktu serta usabilitas.
- **Kurangnya elemen manusia**. seperti pada info sebelumnya, manual testing memberikan human element untuk dapat melakukan interaksi user dengan aplikasi termasuk secara visual.
- **Tidak ada nya umpan balik mengenai UI**. Tanpa adanya human element, maka kita tidak bisa melakukan pengecekan terhadap UI seperti warna,kontras, pemilihan font, dan button sizes.

Adapun tahapan proses dalam automate testing :
1. Seleksi tools/alat yang digunakan untuk pengujian
   > Dalam memilih tools/alat yang digunakan untuk pengujian QA harus mempertimbangkan Usability (kegunaan), Simplicity (kemudahan), dan Cost (biaya)

2. Menentukan ruang lingkup otomatisasi
   > Dalam menentukan ruang lingkup otomatisasi adalah area dari aplikasi yang sedang dalam pengujian yang mana akan dilakukan secara otomatis.

3. Merencanakan, mendesain dan mengembangkan
   > Dalam merencanakan, mendesain dan mengembangkan QA merancang strategi dan rencana kemudian dikembangkan melalui script yang terautomisasi.

4. Mengeksekusi pengujian
   > Dalam melakukan pengujian script di uji

5. Perbaikan
   > Dalam perbaikan script tersebut di tambahkan apabila terdapat bagian yang butuh ditambahkan, direview apabila diperlukan dan diperbaiki di setiap siklusnya

Adapun praktik terbaik untuk otomatisasi yakni :
> Menentukan ruang lingkup otomatisasi membutuhkan tekad dalam merinci, ini yang menentukan ekspektasi dari otomatisasi benar.
> Memilih alat automation yang benar
> Melakukan standar dalam melakukan script hal ini diikuti saay menulis script untuk automation
> Mengukur metric keberhasilan automation tidak bisa ditentukan dari perbandingan usaha pengujian secara manual dengan usaha pengujian secara automation.

## Materi 2 : Behavior Driven Development
### Poin 1 : Apa itu BDD ?
Berdasarkan siklus yang diberikan pada slide ke-12, BDD (Behavior Driven Development) berfungsi untuk mencatat fitur-fitur yang gagal saat melakukan test dalam hal ini test yang difokuskan pada sistem. "Behavior" dalam konteks ini berkaitan dengan _Stakeholder/Customer_ yang mereka harapkan dapat dilakukan oleh sistem. 
TDD (Test Driven Development) merupakan metodologi pengembangan dimana kita mengutamakan komponen-komponen yang akan di test untuk membuat suatu sistem yang baik untuk _Stakeholder/Customer_.

Bahasa BDD Gherkin adalah bahasa yang dapat dibaca bisnis yang membantu Anda menggambarkan perilaku bisnis tanpa merinci implementasinya. Ini adalah bahasa khusus untuk menentukan tes dalam format Cucumber. Ini menggunakan bahasa sederhana untuk menggambarkan kasus penggunaan dan memungkinkan pengguna untuk menghapus detail logika dari behavior tes.

Format BDD terdiri dari :
1. User Story : Untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
2. As a [X], I want [Y], So that [Z] merupakan contoh dari scenario yang dibuat
3. Scenario
4. Given (menjelaskan konteks dari scenario), When (menjelaskan tindakan yang dilakukan oleh user) , Then (menjelaskan tindakan outcome yang dilakukan oleh user).

### Poin 2 : Apa itu Cucumber ?
Sebuah tools yang digunakan untuk melakukan BDD, Cucumber membaca suatu ketentuan yang dapat dieksekusi. ketentuan tersebut terdiri dari beberapa scenario.
Berikut ini adalah tahapan BDD menggunakan Cucumber :
1. Membuat Story (Ghekin Syntax) Given, When dan Than
2. Merangkai langkah-langkah untuk membuat java dengan memastikan langkah-langkah script dan validasinya
3. Memastikan story (Mengkombinasikan cerita dan langkah-langkahnya)
4. Menjalan story (Intelij IDEA dan Maven)
5. Melihat laporannya


