# (4) Agile Testing 
## Materi 1 : Agile Testing
### Poin pertama : Pengenalan SDLC & Siklus SDLC
SDLC (Software Development Life Cycle) siklus yang digunakan dalam pembuatan atau pengembangan sistem informasi yang bertujuan untuk menyelesaikan masalah secara efektif.

SDLC digunakan oleh industri software untuk mendesain, mengembangkan dan menguji software tingkat tinggi.

Fase-fase yang terdapat dalam siklus SDLC : `Requirement Gathering > Design > Development (Code) > Testing > Deployment > Maintenance`
- Requirement Gathering
> Untuk menciptakan proses diagram dan menampilkan secara rinci analasis performanya
- Design
> Untuk merancang prasarana IT dan untuk  merancang model sistem yang diinginkan
- Development
> Untuk mengembangkan prasarana IT yang sudah dirancang dan untuk mengembangkan database dan code
- Testing
> Untuk menuliskan step-step test cases dan menjalankan test cases yang sudah ditulis langkah-langkahnya
- Deployment
> Untuk mengerahkan sistem pada kenyataan (lingkungan klien yang nerupakan pengguna) yang mulai menjalankan sistem
- Maintenance
> Untuk mendukung pengguna yang menggunakan sistem, perbaikan sistem, perubahan sistem dan penyesuaian terhadap perubahan yang sudah dilakukan

### Poin kedua : Agile Testing Manifesto
Terdapat 5 kunci dari tesing manifesto yaitu :
- Testing is an activity not a phase 
- Prevent bugas rather than finding bugs
- Don't be a checker, be a tester
- Don't try to break the system, instead help build the best possible system
- The whole team is responsible for quality, not just the tester

### Poin ketiga : Testung Pyramid
Penjelasan dari gambar Testing pyramid pada slide 30 website alta sebagai berikut (dari hirarki terendah ke hirarki teratas) :
- Unit Test merupakan sebuah proses berupa program (code test secara autonomous testing) untuk meverifikasi methode/function, class, atau widget yang berada di dalam aplikasi apakaj sesuai dengan persyaratan atau design yang sudah dirancang sebelumnya.
- Component/integration test/ component test/ service merupakan tahap dimana programmer memastikan pada sejumlah class yang bekerja sama apakah memiliki _behavior_ yang benar. pada tahap ini bisa dijalankan apabila codingan sudah di merge dari branch ke master.
- UI Test merupakan pengujian yang dilakukan dari ujung ke ujung yang berfokus pada hasil dari setiap interaksi pada fitur aplikasi (tampilan/output) namun dapat dilakukan dengan otomatisasi menggunakan software khusus seperti katalin studio/silenium, dll.






