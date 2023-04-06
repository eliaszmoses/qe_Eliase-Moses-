# (7) Iterable and Map Data Structure 
## Materi 1 : Basic Data Structures
### Poin 1 : Iterable
`Iterable adalah antarmuka (Interface) dalam java yang digunakan untuk mengimplementasikan struktur data yang dapat diulang (Iterable data structure). Iterable juga bisa dikatakan sebagai struktur data yang dapat diakses satu per satu. Struktur data ini memungkinkan kita untuk mengakses setiap elemen di dalamnya secara terpisah.`
contoh dari iterable data structure ini seperti :
1. Collection
2. List
Terdiri dari : ArrayList, LinkedList dan ImmutableList.
3. Set
Terdiri dari : Hash Set, LinkedHashSet, Immutable Set, SortedSet, TreeSet, dan NavigableSet.
4. Queue
5. Deque
6. Stack

Dalam Java, semua struktur data ini dapat diimplementasikan sebagai Iterable dengan menggunakan keyword "implements".
Contoh penggunaan Iterable pada Java :

`List<String> myList = new ArrayList<>();
myList.add("Satu");
myList.add("Dua");
myList.add("Tiga");
for (String item : myList) {
System.out.println(item);
}`

Pada contoh di atas, kita membuat sebuah list dengan tipe data String, lalu menambahkan beberapa elemen ke dalamnya. Kemudian, kita menggunakan loop for-each untuk mengakses setiap elemen di dalam list tersebut dan mencetak nilainya ke console.

### Poin 2 : Map
Map adalah struktur data yang memetakan kunci (key) ke nilai (value). Dalam bahasa lain, Map digunakan untuk menyimpan pasangan data yang terdiri dari sebuah kunci dan sebuah nilai yang terkait.
Dalam Java, Map diimplementasikan sebagai antarmuka (interface) dengan beberapa implementasi yang berbeda, seperti HashMap, TreeMap, dan LinkedHashMap. Setiap implementasi memiliki karakteristik dan kegunaan yang berbeda.

Contoh penggunaan Map pada Java :

`Map<String, Integer> myMap = new HashMap<>();
myMap.put("Satu", 1);
myMap.put("Dua", 2);
myMap.put("Tiga", 3);
System.out.println(myMap.get("Satu"));`

Pada contoh di atas, kita membuat sebuah HashMap dengan kunci bertipe String dan nilai bertipe Integer, lalu menambahkan beberapa pasangan data ke dalamnya. Kemudian, kita menggunakan method "get" untuk mengakses nilai yang terkait dengan kunci "Satu" dan mencetaknya ke console.

Dalam pengembangan perangkat lunak, iterable dan map sering digunakan bersama-sama untuk memproses data secara efisien. Misalnya, kita dapat menggunakan iterable untuk mengakses setiap elemen dalam sebuah struktur data, lalu menggunakan map untuk mengubah nilai dari masing-masing elemen tersebut berdasarkan kunci tertentu.

Dengan menguasai iterable dan map, seorang programmer dapat memanfaatkan struktur data secara efektif dalam pengembangan perangkat lunak dan mengoptimalkan kinerja program yang dibuat.