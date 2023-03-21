# (8) RESTful API Introduction & Testing
## Materi 1 : Basic of API Testing
### Poin 1 : API & REST API
API yang merupakan singkatan dari "Application Programming Interface" memungkinkan komunikasi an pertukaran data antara 2 atau lebih software/sistem yang terpisah.
sebuah software yang mengintegrasikan antara aplikasi yang kita buat dengan aplikasi yang lain. Tujuan pembuatannya yaitu untuk saling berbagi data antar aplikasi yang sudah diintegrasikan tersebut.
API Workflow memiliki ilustrasi sebagai berikut :

`Pelanggan (Client) --> memesan makanan pada menu --> pelayan (API) --> menu tersebut diberikan kepada juru masak --> Chef (System/Server)`

`Chef (System/Server) --> memasak makanan yang diinginkan pelanggan --> pelayan (API) --> memberikan makanan yang sudah dimasak tersebut kepada --> pelanggan (Client)`

REST API yang merupakan singkatan dari "Representational State Transfer" merupakan salah satu desain arsitektur yang terdapat di dalam API sendiri. 
Cara kerja dari RESTful API yaitu REST client akan melakukan akses pada data/resource pada REST server dimana masing-masing resource. Atau data/resource tersebut akan dibedakan oleh sebuah global ID atau URl(Universal Resource Identifiers).

REST server dapat berupa formal text, JSON atau XML. Format yang paling populer dan paling banyak digunakan adalah format JSON.
Adapun metode HTTP yang secara umum dipakai dalam REST API adalah :
- GET, berfungsi untuk membaca data/resource dari REST server
- POST, berfungsi untuk membuat sebuah data/resource baru di REST server
- PUT, berfungsi untuk memperbaharui data/resource dari REST server
- OPTIONS, berfungsi untuk mendapatkan operasi yang disupport pada resource dari REST server.

Komponen REST API terdiri dari : Method, URL (Base URL + Path), Header dan Body.

JSON (JavaScript Object Notation) adalah format file berbasis teks yang umumnya digunakan dalam proses pertukaran data antara server dan klien. File JSON memiliki ekstensi .json serta menggunakan teks yang sama-sama bisa dibaca oleh manusia dan dipahami oleh komputer.

### Poin 2 : HTTP Response Code
HTTP (Hypertext Transfer Protocol) Response Code : 
- code 200 : OK (permintaan sudah diterima dan dipahami kemudian sedang diproses)
- code 201 : Created (permintaan berhasil dan server membuat sumber/resource baru)
- code 400 : Bad Request (server tidak memahami sintaks/syntax permintaan dari klien)
- code 401 : Unauthorized (permintaan membutuhkan otentikasi. server biasanya menampilkan respon ini untuk halaman setelah login (page behind a login))
- code 404 : Not Found (server tidak dapat menemukan halam yang diminta)
- code 405 : Method Not Allowed (metode yang ditentukan dalam permintaan tidak diperbolehkan)
- code 500 : Internal Server Error (server mengalami galat/error dan tidak dapat memenuhi permintaan)

## Materi 2 : API Testing
### Poin 1 : API Testing dan penjelasannya
Beberapa pendakatan dari API Testing seperti :
- Mengerti fungsi dari API
- Dapat mengaplikasikan teknik testing
- Input Parameter untuk API perlu direncakan dan ditentukan sebelumnya
- Jalankan test case dan bandingkan antara hasil yang diharapkan dengan hasil yang didapatkan
- API Test sangat berbedan GUI
- Mengirim request dan mendapatkan response nya
- Memverifikasi response yang benar dan error handling

Beberapa API Testing :
- Functionality (memiliki kegunaan sebagai perantara bagi beberapa aplikasi atau klien dan server, baik pada satu platform yang sama maupun lintas platform, agar bisa saling berkomunikasi)
- Load Test (merupakan teknik performance testing yang mana resoon  sistem diukur dalam berbagai load condition. load test membantu menentukan bagaimana software berperilaku ketika beberapa user mengakses software secara bersamaan)
- Security (untuk menguji keamanan suatu API terdpat beberapa cara yang dapat kita lakukan seperti menetapkan siapa yang memiliki tanggung jawab keseluruhan untuk menguji dan memelihara keamanan API, Anggaran waktu dan sumber daya untuk pengujian kemanan, mendaftar, mengklasifikasikan, dan mendokumentasikan tujuan dari setiap API dan bagaimana fungsinya, menjalankan pengujian lebih awal dan otomatiskan jika memungkinkan, menentukan jenis pengujian yang akan dijalankan, memperbaiki tes yang gagal dan tes ulang serta selalu mengikuti risiko keamanan dan perbarui dokumentasi)

Adapun beberapa alat API Testing seperti : Postman, Apache JMeter, frisby.js, dan REST-assured
Perbedaan API test dan Unit test
Unit Test terdiri dari :
* Dilakukan oleh Developer
* Fungsi-fungsi terpisah
* Developer bisa mengakses source code
* Hanya Dasar functionality yang di test
* Scopenya terbatas
* Biasanya dilakukan sebelum build

API Test terdiri dari :
* Tester yang melakukan itu
* End to End (proses yang mengambil sistem atau layanan dari awal hingga akhir dan memberikan solusi fungsional yang lengkap)
* Tidak bisa mengakses source code
* Hanya fungsi API saja
* Semua functional issue
* Scopenya lebih luas
* Dilakukan setelah build

Proses dalam API Testing terdiri dari :
1. Meninjau ulang spesifikasinya
2. Mengembangkan spesifikasi 
3. Mengembangkan kerangka kerjanya
4. Mengembangkan Test case nya
5. Melaksanakan API Testing dan membuat laporannya

Test cases untuk API Testing
> - Mendapatkan balikan (response) yang sesuai dengan inputan.
> - Apakah memberikan balikan atau tidak.
> - Apakah mengganggu fitur yang lain atau tidak.
> - Update struktur data
> - Memodifikasi data yang ada

Latihan terbaik untuk API Testing :
> - Kelompokkan test case kedalam beberapa kategori
> - Beri judul yang sesuai pada setiap test.
> - Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu
> - Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API

Tipe output dari API :
- Bisa berbentuk apa saja, tapi pada umumnya JSON atau XML.
- Status balikan (response) apakah Passed atau Fail
- Memanggil fungsi API lain.

Beberapa tipe test yang umum dilakukan dalam API Testing :
> - Memverifikasi apakah kita mendapat respon dari API
> - Memverifikasi apakah hasil input/request sudah sesuai atau belum
> - Memverifikasi apakah data yang kita input.update sudah benar-benar berubah atau bertambah
> - Memverifikasi waktu response yang diberikan

Beberapa tipe bugs yang dapat dideteksi API testing :
> - Gagal melakukan error handling pada keadaan tertentu
> - Kesulitan untuk tersambung dan mendapat respon API
> - Isu keamanan
> - Performance Issues
> - Error atau warning yang tidak tepat
> - Struktur dari data respon tidak benar (JSON & XML)

### Poin 2 : Kelebihan dan Tantangan dari Testing API
Kelebihan dari Testing API yaitu :
> = Efisiensi waktu
> - Bahasa yang independen
> - Mengurangi biaya testing
> - Mengurangi resiko

Tantangan menggunakan API Testing
> - Kombinasi parameter, pemilihan paramater
> - Tidak ada GUI (Graphic User Interface)
> - Kita harus mengetahui terlebih dahulu parameter
> - Perlu juga mengtest error handling dari setiap API

Kesimpulan : API terdiri dari beberapa classes/functions/procedures yang mana merepresentasikan lapisan logis bisnis. Jika API tidak di test dengan benar, maka akan menimbulkan masalah yang tidak hanya pada aplikasi API tapi pada saat dipanggil. Sangat diperlukan test pada software engineering.
