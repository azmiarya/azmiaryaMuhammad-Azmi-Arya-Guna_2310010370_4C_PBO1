# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi kepegawaian ini terdiri dari tiga class utama.
Class pertama adalah Pegawai, yaitu kelas induk yang menyimpan data dasar pegawai seperti 'nama' dan 'nip', serta menyediakan method tampilInfo() untuk menampilkan informasi tersebut.
Class kedua adalah 'JenisPegawai', yaitu kelas turunan dari 'Pegawai' yang menambahkan atribut jenis pegawai (Tetap atau Kontrak) dan gaji, serta melakukan override terhadap method tampilInfo() agar dapat menampilkan data lengkap sesuai jenis pegawai.
Class ketiga adalah 'MainKepegawaian', yang berperan sebagai kelas utama tempat program dijalankan.
Class ini menangani input data dari pengguna, validasi gaji sesuai jenis pegawai, penyimpanan data menggunakan array, dan menampilkan seluruh data pegawai ke layar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `PegawaiDetail`, dan `MainPegawai` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class PegawaiDetail extends Pegawai {
    ...
}

public class MainPegawai {
    ...
}
```

2. **Object** adalah hasil instansiasi (perwujudan nyata) dari sebuah class. Dalam aplikasi ini, objek dibuat dari class 'JenisPegawai', yang merupakan turunan dari class 'Pegawai'. Setiap objek merepresentasikan satu pegawai lengkap, dengan atribut nama, NIP, jenis pegawai, dan gaji.

```bash
listpegawai1[i] = new PegawaiDetail(nama, nip, jenis, gaji);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, 'npm', 'jenis' dan `gaji` adalah contoh atribut.

```bash
String nama;
String nip;
```

```bash
String jenis;
double gaji;
```

4. **Constructor** adalah method khusus dalam sebuah class yang digunakan untuk menginisialisasi nilai awal atribut saat objek dibuat.
Constructor memiliki 'nama' yang sama dengan nama class dan tidak memiliki tipe kembalian.

```bash
public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

public PegawaiDetail(String nama, String nip, String jenis, double gaji) {
        super(nama, nip);
        this.jenis = jenis;
        this.gaji = gaji;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNip` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setNip(String nip) {
        this.nip = nip;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Accessor dalam aplikasi ini digunakan untuk mengambil nilai atribut seperti 'nama', 'NIP', 'jenis pegawai', dan 'gaji' yang bersifat private. Method accessor dibuat dalam bentuk getter 'getNama()', 'getNip()', dll. agar nilai-nilai tersebut bisa diakses dari luar class dengan cara yang aman sesuai prinsip enkapsulasi.

```bash
public String getNama() {
        return nama;
    }

public String getNip() {
        return nip;
    }
```

```bash
public String getJenis() {
        return jenis;
    }

public double getGaji() {
        return gaji;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Enkapsulasi dalam aplikasi ini diterapkan dengan menjadikan semua atribut pegawai bersifat 'private', sehingga tidak bisa diakses langsung dari luar class. Untuk mengakses nilai-nilai tersebut, disediakan method accessor '(getter)'. Dengan cara ini, data pegawai menjadi lebih aman dan sesuai dengan prinsip OOP.
```bash
private String nama;
private String nip;
```

```bash
private String jenis;
private double gaji;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Inheritance dalam aplikasi ini diterapkan dengan cara membuat class 'JenisPegawai' sebagai subclass yang mewarisi atribut dan method dari class 'Pegawai'. Dengan menggunakan keyword extends, class 'JenisPegawai' dapat memanfaatkan method tampilInfo() dari superclass dan menambahkan informasi jenis dan gaji pegawai tanpa harus mendefinisikan ulang atribut dasar.
```bash
public class PegawaiDetail extends Pegawai {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Polymorphism dalam aplikasi ini diterapkan melalui method tampilInfo() yang di-override di class 'JenisPegawai'. Meskipun nama method-nya sama dengan method di class 'Pegawai', isi dan output-nya berbeda sesuai jenis objek yang digunakan. Dengan demikian, aplikasi dapat menampilkan informasi pegawai yang berbeda secara fleksibel menggunakan method yang sama.

```bash
 @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis Pegawai   : " + jenis);
        System.out.println("Gaji            : Rp " + gaji);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Seleksi dalam aplikasi kepegawaian digunakan untuk memvalidasi input jenis pegawai dan membatasi gaji pegawai kontrak agar tidak melebihi Rp 3.000.000. Struktur seleksi menggunakan if untuk memastikan data yang dimasukkan sesuai dengan ketentuan yang berlaku.

```bash
while(true){
    System.out.println("Jenis (Tetap/Kontrak): ");
    jenis = scanner.nextLine();
    // percabangan
    if(jenis.equalsIgnoreCase("Tetap") || jenis.equalsIgnoreCase("Kontrak")){
        break;
    } else{
        System.out.println("Input tidak valid!");
    }
}
double gaji = 0;
            
while (true) {
    try {
        System.out.print("Gaji: ");
        gaji = Double.parseDouble(scanner.nextLine());
        if (jenis.equalsIgnoreCase("Kontrak") && gaji > 3000000) {
            // Error Handling
            throw new Exception("Gaji pegawai Kontrak tidak boleh lebih dari 3.000.000!");
        }
        break;
     } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor");
     } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Perulangan dalam aplikasi ini digunakan untuk menginput dan menampilkan data pegawai secara berulang. Terdapat perulangan for untuk input dan output data dari array, serta while loop untuk validasi input jenis pegawai dan gaji agar sesuai dengan aturan. Penggunaan perulangan ini menjadikan aplikasi lebih interaktif dan efisien.

```bash
for(int i = 0; i < listpegawai1.length; i++){
    ...
}

for(PegawaiDetail data : listpegawai1){
            data.tampilInfo();
            System.out.println("----------------------");
        }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Input-output (I/O) sederhana dalam aplikasi ini dilakukan menggunakan class Scanner untuk menerima data pegawai dari keyboard, dan System.out.println() untuk menampilkan informasi serta hasil validasi ke layar. I/O ini membuat aplikasi dapat berinteraksi langsung dengan pengguna secara sederhana dan efisien.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("\nPegawai ke-" + (i + 1)); // 1., 2., dst...(jika length ingin ditambah)
            
System.out.println("Nama Pegawai: ");
String nama = scanner.nextLine();
            
System.out.println("NIP Pegawai: ");
String nip = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Array dalam aplikasi ini digunakan untuk menyimpan beberapa data pegawai dalam satu variabel bertipe objek JenisPegawai. Dengan array, program dapat mengelola dan menampilkan data pegawai secara berulang menggunakan perulangan, sehingga proses menjadi lebih efisien.

```bash
PegawaiDetail[] listpegawai1 = new PegawaiDetail[2]; //lenght
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Error handling dalam aplikasi ini diterapkan menggunakan struktur try-catch untuk menangani kesalahan input, khususnya saat pengguna memasukkan gaji yang melebihi batas untuk pegawai kontrak. Dengan mekanisme ini, program tetap berjalan dan memberikan pesan kesalahan yang informatif tanpa langsung berhenti.

```bash
try {
    System.out.print("Gaji: ");
    gaji = Double.parseDouble(scanner.nextLine());
    if (jenis.equalsIgnoreCase("Kontrak") && gaji > 3000000) {
        // Error Handling
        throw new Exception("Gaji pegawai Kontrak tidak boleh lebih dari 3.000.000!");
    }
    break;
} catch (NumberFormatException e){
    System.out.println("Kesalahan format nomor");
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Azmi Arya Guna
NPM: 2310010370
