# (14) Testing in CI/CD Pipeline
## Materi 1 : Pengenalan CI/CD, Keuntungan menggunakannya dan Proses dalam CI/CD
### Poin 1 : Pengenalan, kriteria yang baik untuk dan Process CI/CD

#### 1. Pengenalan CI/CD 

1. Continuous Integration

- Continuous Integration merupakan latihan untuk mengintegrasikan sintaks ke dalam repository yang sudah dibagikan dan pengujian dapat berubah secata otomatis segera secepat mungkin, biasanya beberapa kali dalam sehari.
- Paling baik dicapai melalui integrasi dengan version control.

2. Continuous Delivery / Deployment

**Continuous Delivery** menambahkan pada software dapat dirilis di produksi kapan saja, sering secara otomatis meminta perubahan menjadi sistem yang ditunjukkan.

Continuous Deployment mendorong perubahan dari jauh pada produksi secara otomatis

> Continuous Delivery : Secara otomatis mempersiapkan dan melacak yang dirilis ke produksi dan outpun keluaran yang diinginkan bahwa semua orang dengan hak istimewa yang kurang dapat menerapkan rilis baru kapan saja dalam satu atau beberapa kali klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif.

> Continuous Deployment : Setiap perubahan pada kode sumber di terapkan pada produksi otomatis, tanpa persetujuan eksplisit dari pengembang dan sepanjang ini melampaui kualitas kontrol.

Builds --> Test ---------> Acceptance Test --> Deploy to Staging --> Deploy to Production

(Continuous Integration)                            (Continuous Delivery)

Builds --> Test ---------> Acceptance Test --> Deploy to Staging --> Deploy to Production

(Continuous Integration)                            (Continuous Deployment)

#### 2. Apa kriteria yang baik untuk membuat CI/CD ?

Kriteria yang baik bagi CI

* Tahapan yang dipisahkan 
  - Setiap langkah dalam CL harus dilakukan dalam tugas terfokus tunggal

* Dapat diulang
  - Terotomatisasi dalam pengujian yang dilakukan berulang dan konsisten
  - Alat yang digunakan harus bekerja bagi pengembang lokal juga

* Cepat gagal
  - Kegagalan merupakan tanda awal dari timbulnya masalah

Kriteria yang baik bagi CD

* Di desain dengan sistem dalam pikiran
  - Mencakup banyak bagian dari penerapan sebisa mungkin, seperti : Aplikasi, Infrastruktur, Konfigurasi dan Data.

* Pipelines 
  - Terus menerus meningkatkan keyakinan saat kita bergerak menuju produksi

* Memiliki keunikan secara umum
  - Mengetahui bagian dari sistem di waktu kapan saja
  - Dapat mendemonstrasikan perbedaan antara sekarang dan bagian di masa depan

#### 3. Proses CI/CD

Proses CI/CD yaitu terdiri dari : commit, build, test dan deploy

### Poin 2 : Keuntungan dan biaya dari CI/CD, Alat yang digunakan untuk CI/CD dan Github Actions

#### 4. Keuntungan dan biaya dari mengimplementasikan CI/CD

Keuntungan dari menerapkan CI yakni :
- Dapat mendeteksi bug di tahap awal
- Mengurangi jumlah bug
- Pada saat melakukan pengembangan proses nya dilakukan lebih transparan
- Efisien

Keuntungan dari menerapkan CD yakni :
- Mengurangi resiko
- Menerapkan warna dengan penuh 
- Mengurangi biaya
- Proses yang otomatis dan transparan
- Dapat secara terus menerus melakukan rilis

Biaya yang dikeluarkan untuk CI yakni :
- Menulis pengujian ter-otomatisasi
- Server pengujian yang ter-otomatisasi
- Dapat menyatukan sintaks sesering mungkin

Biaya yang dikeluarkan untuk CD yakni : 
- Memiliki dasar yang kuat dalam CI
- Membutuhkan kualitas pengujian yang tinggi
- Dokumentasi dibutuhkan untuk dapat ditingkatkan secara berkala

#### 5. Alat yang digunakan CI/CD

> Jenkins, Bamboo, circleci, AWS CodeBuild, Azure DevOps, CI/CD, Travis CI dan GitHub Actions

- Jenkins merupakan alat otomatisasi sumber terbuka yang digunakan untuk menulis java menggunakan plugins built untuk integrasi lanjutan.

- GITLAB CI merupakan bagian dari jasa GitLab yang mana mengatur projek dan tampilan pengguna dan mengizinkan pengujian unit di setiap commit dan mengindikasikan pesan peringatan yang menunjukkan berhasil atau tidaknya dibangun.

- AtLassian Bamboo merupakan integrasi yang berlanjut dalam membuat server yang menampilkan : pembuatan secara otomatis dan peluncuran dalam satu tempat.

- Circle CI merupakan alat ci yang fleksibel yang dapat menjalankan bentuk apapun seperti cross platform aplikasi gadegt, server Python API, atau Docker Cluster. Alat ini untuk mengurangi bugs dan meningkatkan kualitas dari produksi.

- AWS Codebuild merupakan alat CI/CD yang mengizinkan pengembang untuk membuat dan menguji sintaks dalam skala berkelanjutan.

- Azure Devops merupakan CI/CD yang digunakan untuk perencanaan, pengujian, menyebarkan dan mendistribusikan. Alat ini diciptakan oleh Microsoft.

- Travis CI merupakan CI pertama yang dijadikan alat perbaikan. Ini memperkenalkan pendekatan baru dari membangun sintaks dalam cloud, Alat CI ini mengizinkan pengguna untuk daftar terlebih dahulu. menghubungkan repostiory, membangun seperti menguji aplikasi mereka.

- Github Actions merupakan platform CI dan CD yang memperbolehkan kamu untuk mengotomatisasi bagunan, pengujian dan pipline deployment.

#### 6. Github Actions

Merupakan platform CI dan CD yang mengizinkan kita untuk mengotomatisasi build, pengujian dan deployment pipeline

Komponen dari github actions yakni : workflow, jobs, actions, events dan runners

- Workflows merupakan konfigurasi proses otomatisasi yang menjalankan 1 atau lebih pekerjaan. Workflow dikenal dengan YAML file periksa dalam repository dan akan bekerja ketika dipicu oleh suatu aksi dalam repositori atau mereka dapat dipicu secara manual, dll.

- Events merupakan aktivitas secara rinci dari repositori yang memicu jalannya workflow.

- Runners merupakan server yang menjalankan workflows ketika mereka dipicu. Setiap runner dapat menjalankan sebuah pekerjaan dalam satu waktu. Github menyediakan Ubuntu Linux, Microsoft Windows, dan macOS runners untuk menjalan workflows.

- Jobs merupakan susunan dari seluruh langkah dalam workflow yang dieksekusi di runner yang sama. Setiap langkah dengan shell script akan di jalankan, atau sebuah action akan dijalankan. langkah-langkah tersebut dieksekusi dalam tujuan dan saling bergantung satu sama lain. Sejak satu langkah dengan langkah lain dieksekusi dalam runner yang sama, maka kita dapat membagikan data dari satu langkah ke langkah yang lain.

- Actions merupakan aplikasi dari platform GitHub Actions yang menampilkan tugas kompleks namun sering diulang. Menggunakan action untuk membantu mengurangi jumlah sintaks yang berulang yang di tulis di workflow files.



