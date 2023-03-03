# (3) Testing Documentation & Test Case & Tracking Management Tools 
## Materi 1 : Testing Documentation (Test Scenario - Test Case - dll)
### Poin pertama : Apa itu Test Scenario ?
Test Scenario mendeskripsikan apa saja yang perlu dilakukan pengujian pada suatu fitur.
Test Scenario juga merupakan tingkatan tertinggi dalam pengujian.   

Contoh Test Scenario yang sering kita lakukan pada saat masuk ke akun google :

>  Memeriksa fungsi dari kegunaan tombol "Login"

>  Memeriksa fungsi dari kegunaan tombol "Lupa email ?"

>  Memeriksa fungsi dari kegunaan membuat "akun google yang baru"
### Poin kedua : Apa itu Test Case ?
Test Case menjelaskan cara menguji sebuah fitur yang umumnya terdiri dari kondisi positif dan negatif.
Test Case terdiri dari kondisi awal, langkah-langkah, hasil yang diharapkan, status dan hasil yang didapatkan.  

Contoh Test Case pada saat kita menguji Test Scenario kegunaan dari tombol "Login"
maka terdapat beberapa hasil positif maupun negatif yang akan kita dapatkan yaitu :

> Test Case 1 : Enter valid email and valid password

> Test Case 2 : Enter valid email and invalid password  

> Test Case 3 : Enter invalid email and valid password 

> Test Case 4 : Enter invalid email and invalid password

### Poin ketiga : **Kesimpulan : Test Scenario menjawab "apa yang akan diuji ?", sedangkan Test Case menjawab "Bagaimana mengujinya ?"**

## Materi 2 : Test Case Management Tools
### Poin Pertama : Apa itu Test Case Management Tools & Kenapa kita butuh ?
Test Case Management Tools merupakan tools yang digunakan untuk merencanakan, mengelola, melaporkan hasil dari test yang telah dilakukan.  
Dengan adanya Test Case Management Tools kita dapat :
> Plan and Estimate
  
  Plan and Estimate, diinformasikan dalam Test Plan, dimana di dalamnua berisi fitur yang akan di test dalam planning, fitur yang tidak di test, hal-hal yang berhubungan dalam test,
  berapa banyak sumber daya yang dibutuhkan dan informasi dari aktivitas jadwal testing itu sendiri.

> Monitoring and Controlling

  Monitoring and Controlling, pada bagian ini kita menggunakan test case management tools untuk memantau proses pengumpulan, perekaman dan pelaporan
  informasi tentang aktivitas projek yang mana manajer projek dan pemangku kepentingan harus tau
  Selain itu, kita juga dapat mengontrol data-data yang telah dimasukkan dalam 1 tempat.

> Reporting and Integrate with another tools
  
  Reporting and Integrate with Another Tools kita tidak perlu lagi kesulitan dalam membuat dokumen laporan secara manual.
  Dengan Test Case Management Tols dapat di integrasikan dengan tools yang lain seperti : JIRA, Pivotal, Redmine, Jenkins, dan Travis CI.

Terdapat juga beberapa contoh dari test case management tools : Test rail, QA Complete, Zephyr dari Smartbear, Meliora, PractiTest dan ReQtest

### Poin Kedua : Bagaimana cara menggunakan TestRail ?
Terdapat beberapa langkah yang dapat diikuti agar dapat menggunakan TestRail :
1. Buka TestRail pada browser dan login dengan autentikasi (username dan password)
2. Klik create a Test Project Management
3. Mengisi semua mandatory field
4. Create Milestones
5. Create Test Run
6. Create Test Plan
7. Create test Cases
8. Test Report

### Poin Ketiga : Test Management sangat penting dalam aspek Software testing, tanpa adanya teknik yang benar dalam test management software tesing bisa menjadi gagal.

## Materi 3 : Tracking Management Tools
### Poin Pertama : Apa itu Jira ?
Jira adalah alat bantu yang bertujuan untuk pelacakan bugs, pelacak issue, dan manajemen proyek

### Poin Kedua : Langkah-langkah dalam menggunakan Jira
> Pembuatan Projek baru di Jira
  1. Klik button *drop down* menu di sebelah kiri atas dan klik "**Create Project**"
  2. Pilih Scrum sebagai metode (masukkan nama project dan click button create)
> Setelah buat project baru
  1. **TO DO**       : Panel yang berisi story yang akan dikerjakan dan sudah diprioritaskan saat planning
  2. **IN PROGRESS** : Panel yang berisi story yang sedang dikerjakan oleh **Software Engineer**
  3. **FINISH**      : Panel yang berisi story yang telah selesai dikerjakan oleh para Software Engineer, namun belum siap untuk tahap testing
  4. **DELIVER**     : Panel yang berisi story yang siap memasuki tahap testing oleh para Quality Engineer
  5. **NEED FIX**    : Panel yang berisi hasil proses testing yang tidak lolos criteria oleh team development
  6. **DONE**        : Panel yang berisi fitur-fitur yang sudah lolos dari criteria testing oleh development team
> Membuat masalah baru di Jira
Issue pada JIRA akan melacak masalah yang mendasari proyek ataupun bug.
Pada dasarnya terdapat 7 poin dalam menciptakan masalah :
1. Project
    Dipilih sesuai dengan issues yang akan dibuat akan ditempatkan di project tersebut.
2. Issue Type
    Terdiri dari 4 yakni :
    - Story jenis issue yang biasa digunakan untuk membuat fitur baru
    - Task jenis issue yang biasa digunakan untuk melakukan perincian tugas-tugas yang akan dikerjakan
    - Bug jenis issue yang biasa digunakan jika terjadi penemuan bug saat proses testing oleh Quality Engineer
    - Epic jenis issue untuk melakukan pengelompokan task
3. Reporter
    Tentukan **reporter** berdasarkan yang membuat tugas tersebut.
4. Description
    Menuliskan **description** dengan jelas menggunakan format yang sama dengan dituliskan pada pivotal tracker. Terdapat 2 kondisi dari description yaitu :
    - Acceptance Criteria, jika fitur yang dibuat sudah sesuai dengan acceptance criteria yang ditentukan oleh development team.
    - Test implementation membuat dokumentasi setelah melakukan proses testing (Test Scenario)
5. Priority
    Menentukan **priority** berdasarkan dari tingkat kesulitan sebuah task atau issue tersebut.
6. Assignee
    Menentukan **assignee** berdasarkan dari orang yang akan bertanggung jawab mengerjakan tugas tersebut.
7. Sprint
    Menentukan **sprint** berdasarkan dari ruang waktu pengerjaan sebuah task atau issue. (1 minggu / 2 minggu)
> Fase Pada Jira dimulai dari to do > in progress > finish > deliver > need fix (bila diperlukan kembali lagi ke langkah 2) > done
### Poin ketiga : Apa yang harus diperhatikan oleh quality engineer pada Jira ?
**Kondisi saat menemukan Bugs** membuat issue bertipe bugs saat ditemukan ada yang tidak sesuai dengan criteria testing dan memindahkan fitur yang berkaitan dengan bugs ke kolam "in progress"

