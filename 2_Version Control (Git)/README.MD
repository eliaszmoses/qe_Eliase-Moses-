# (2) Version Control (Git)
Version control adalah sebuah sistem yang mereka perubahan-peribahan dari sebuah berkas atau sekumplan berkas dari waktu ke waktu sehingga dapat menilik kembali versi khusus.
## Materi 1 : Versioning Control with Git
### Poin pertama : Pengenalan versioning, cara install dan Persiapan
Yakni mengatur versi dari source code program. Di dalam versioning terdapat 3 tools yang digunakan :
- Version Control System (VCS)
- Source Code Manager (SCM)
- Revision Control System (RCS)

Cara install Git di device yang kita pakai seperti di Apple, Windows, dan Linux

Pengaturan Git Init, Git Clone, Config :
1. > Git-init : Digunakan untuk membuat repository yang ada pada file lokal dan berlokasi di folder.git
2. > Git Clone : Perintah dasar untuk membuat salinan repository lokal.
3. > Config : Modifikasi atau pengoptimalan program.

### Poin kedua : Membahas penyimpanan file, Pemeriksaan repository dan menghubungkan lokal ke repo git
The staging area adalah sebuah berkas sederhana, umumnya berada dalam direktori Git, yang menyimpan informasi mengenai apa yang menjadi commit selanjutnya masuk ke repository.

![The Staging Area (Gambar).png](..%2FThe%20Staging%20Area%20%28Gambar%29.png)

Dengan command git status > git add > git commit

Perlu di ketahui terdapat beberapa tipe commit message seperti :
- If applied, this commit will refactor subsytem X for readability
- If applied, this commit will update getting started documentation
- If applied, this commit will remove deprecated methods
- If applied, this commit will release version 1.0.0

Namun commit tidak akan bekerja untuk bentuk non-imperatif lainnya seperti :
- If applied, this commit will fixed bug with Y
- If applied, this commit will changing behavior of X
- If applied, this commit will more fixes for broken stuff
- If applied, this commit will sweet new API methods

> - Command git diff untuk memberitahukan secara detail perubahan yang terjadi di dua titik referensi Git
> - Command git stash tempat dimana kita ingin menyimpan kode yang belum selesai dikerjakan untuk di commit

Terdapat tiga command yang bisa kita gunakan yakni :
- Git log berfungsi untuk melihat riwayat perubahan pada project
- Checkout berfungsi untuk menukar cabang aktif dengan cabang yang dipilih
- Git Reset berfungsi untuk membatalkan perubahan yang dilakukan

Terdapat tiga command yang bisa kita gunakan yakni :
- Git Push berfungsi untuk mentranskfer perubahan file ke repository setelah melakukan perubahan
- Git Fetch berfungsi untuk memberitahu git lokal untuk mengambil meta-daya dari repo asli
- Git Pull berfungsi untuk menarik/mengambil source code dari repository.

### Poin ketiga : Pencabangan file, cara melakukan pull request dan fungsi workflow collaboration
Cabang atau pointer yang bergerak ke salah satu commit dengan command nya :
Git Branching (untuk membuat cabang atau melanjutkan cabang yang sudah ada) dan Git Merge (untuk menggabungkan perubahan yang terdapat dalam dua atau lebih branch)

Permintaan untuk menggabungkan (merge) kode yang sydah dimofikasi dengan repositori utama atau repositori lain yang dituju.

Dilakukan agar branch yang berkolaborasi dapat berjalan dengan optimal. Adapun langkah-langkahnya yakni :
- Buat Branch Master dari Branch Development
- Hindari Direct Edit ke Branch Development
- Merge Branch Feature hanya ke Branch Development
- Merge Branch Development ke Branch Master jika Development selesai











