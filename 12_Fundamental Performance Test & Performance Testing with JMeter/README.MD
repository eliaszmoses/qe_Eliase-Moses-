# (12) Fundamental Performance Test & Performance Testing with JMeter
## Materi 1 : Fundamental Performance Test
### Poin 1 : Performance Test
Teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stablitas dibawah berbagai beban (load) kerja.
Performance testing mengukur kualitas atribut dari sistem seperti stablitas, ketahanan (reliability) dan penggunaan sumber daya.

Dalam Performance Test yang perlu diukur yaitu :
- Performa suatu aplikasi sampai suatu batas tertentu.
- Bukan merupakan functional-test
- Bisa dalam berbagai macam bentuk untuk memahami reliability, stability dan availability pada lingkungan pengujian-nya.
  seperti : Mengamati response time ketika menjalankan request dalam jumlah yang sangat banyak dan melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.

Performance testing jarang dilakukan karena cukup mahal, pengetesan memerlukan persiapan yang dimana beberapa kasus harus membuat environment terpisah dari production agar tida tercampurnya data test dengan data production.
Environment ini ada yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production.

`Dalam melakukan performance test biasanya yang menjadi perhatian adalah throughout dan response data-nya.`

### Poin 2 : Metode Performance Test
1. Membuat Test Plan
Dengan mengenali apa yang dibutuhkan seperti :
- Endpoint yang akan ditest
- Kebutuhan masing-masing endpoint

2. Menentukan Metode Test
- Pilih berdasarkan kondisi sistem, apakah belum pernah dites atau sudah.
- Pilih berdasarkan situasi yang akan dihadapi

3. Beberapa tipe Metode Test
- Load test
- Endurance test
- Stress test
- Peak test

4. Smoke Testing
Dilakukan untuk memverifikasi script yang sudah dibuat, seperti apakah sistem dapat handle minimal load, tanpa masalah sama sekali. Biasanya 1-2 VUs.

5. Load Testing
Merupakan pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test ini digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.

6. Tabel Tier
Dapat dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production.
![Screenshot (401).png](Screenshot%2FScreenshot%20%28401%29.png)

7. Stress Testing
Metode ini dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem.
Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery.

8. Spike Testing
Metode sama dengan stress testing, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak.
contoh : e-commerce pada saat flash sale jumlah pengujung yang masuk langsung memuncak saat flash sale.

9. Soak Testing
Untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka pajang (>=1 jam). Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection dsb.

Beberapa istilah penting dalam performance test :
> System Under Test (SUT) --> Sebutan untuk sistem yang sedang dilakukan test.

> Load Generator --> Sebutan untuk server yang digunakan untuk membuat request.

> Throughput --> Satuan kerja dalam satuan waktu. Misalnya Request per second (RPS) dan Request per minute (RPM).

> Performance Threshold --> Target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, Max CPU usage 70% dsb.

> Saturation --> Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.

> Virtual Users --> Simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi.

> Response Time --> Lama waktu pengiriman request hingga menerima response.

### Poin 3 : Introduction to JMeter
> Alat yang digunakan seperti Apache JMeter, k6, Locust, BlazeMeter, Smartbear LoadNinja, dll.

> Pengenalan JMeter :`Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.`

> Kelebihan JMeter :`Merupakan Open source dan mudah untuk digunakan dengan GUI / Non GUI`

> Beberapa komponen script JMeter : 
- Test Plan : Rencana besar tes yang akan dilakukan (parent)
- Thread Groups : Kumpulan thread yang menjalankan skenario yang sama
- Samplers : Sebutan untuk request yang dikirim ke server
- Config elements : Elemen yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirim ke server.
- Listeners : Perekam data yang dihasilkan dari tes
- Timers : Fitur ini akan jalan duluan sebelum fitur yang lain berjalan
- Assertions : Seperti assert pada API/Web/Testing, merupakan kriteria tambahan apakah pass/tidak
- Pre-post processors : Fitur yang memproses response data sebelum/sesudah tes


