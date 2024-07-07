# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data rental PS menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama game, harga per jam, durasi sewa, dan status fasilitas tambahan, dan memberikan output berupa informasi detail dari rental PS tersebut seperti nama game, harga per jam, durasi sewa, dan fasilitas tambahan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Rentalps`, `Rentalpsvip`, dan `main` adalah contoh dari class.

```bash
public class Rentalps {
    ...
}

public class Rentalpsvip extends Rentalps {
    ...
}

public class main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `rental = new Rentalps(namaGame, hargaPerJam, durasiSewa);;` adalah contoh pembuatan object.

```bash
rental = new Rentalps(namaGame, hargaPerJam, durasiSewa);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaGame`, `hargaPerjama` dan `durasiSewa` adalah contoh atribut.

```bash
String namaGame;
int hargaPerJam;
int durasiSewa;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Rentalps` dan `Rentalpsvip`.

```bash
public Rentalps(String namaGame, int hargaPerJam, int durasiSewa) {
        this.namaGame = namaGame;
        this.hargaPerJam = hargaPerJam;
        this.durasiSewa = durasiSewa;
}

public Rentalpsvip(String namaGame, int hargaPerJam, int durasiSewa, boolean includeSnack) {
        super(namaGame, hargaPerJam, durasiSewa);
        this.includeSnack = includeSnack;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setHargaPerJam` dan `setDurasiSewa` adalah contoh method mutator.

```bash
public void setHargaPerJam(int hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    public int getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaGame` dan `getHargaPerJam`adalah contoh method accessor.

```bash
public String getNamaGame() {
        return namaGame;
    }

    public void setNamaGame(String namaGame) {
        this.namaGame = namaGame;
    }

    public int getHargaPerJam() {
        return hargaPerJam;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaGame`  `hargaPerjam` dan `durasiSewa` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaGame;
private int hargaPerJam;
private int durasiSewa;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Rentalpsvip` mewarisi `Rentalps` dengan sintaks `extends`.

```bash
 public Rentalpsvip(String namaGame, int hargaPerJam, int durasiSewa, boolean includeSnack) {
        super(namaGame, hargaPerJam, durasiSewa);
        this.includeSnack = includeSnack;
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `toString` di `Rentalps` merupakan overloading method `displayInfo` dan `toString` di `Rentalpsvip` merupakan override dari method `toString` di `Rentalps`.

```bash
public String toString() {
        return "PsRental{" +
                "namaGame='" + namaGame + '\'' +
                ", hargaPerJam=" + hargaPerJam + " IDR" +
                ", durasiSewa=" + durasiSewa + " jam" +
                '}';
}

@Override
@Override
    public String toString() {
        return "Rentalpsvip{" +
                "namaGame='" + getNamaGame() + '\'' +
                ", hargaPerJam=" + getHargaPerJam() + " IDR" +
                ", durasiSewa=" + getDurasiSewa() + " jam" +
                ", includeSnack=" + includeSnack +
                '}';
}
```
10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else untuk membuat pilihan dan seleksi if untuk membuat pembatasan pada tambah ps yang sesuai dengan array, seleksi if else-if switch if else-if else else  disini untuk menampilkan menu dan meminta input pengguna.

```bash
if (jenis == 1) {
            // 2. object
            rental = new Rentalps(namaGame, hargaPerJam, durasiSewa);
        } else if (jenis == 2) {
            boolean includeSnack;
            while (true) {
                System.out.print("Apakah rental VIP termasuk snack? (true/false): ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("true")) {
                    includeSnack = true;
                    break;
                } else if (input.equalsIgnoreCase("false")) {
                    includeSnack = false;
                    break;
                } else {
                    System.out.println("Masukkan harus true atau false.");
                }
            }
            rental = new Rentalpsvip(namaGame, hargaPerJam, durasiSewa, includeSnack);
        } else {
            System.out.println("Jenis rental PS tidak valid.");
            return;
        }

int pilihan = getInputInt();
            switch (pilihan) {
                case 1:
                    tambahRentalPs();
                    break;
                case 2:
                    tampilkanRentalPs();
                    break;
                case 3:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop while menampilkan menu ,meminta input dan menampilkan Apakah rental ps vip memiliki fasilitas snack .

while (true) {
    ...
}

while (true) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 System.out.print("Apakah rental VIP termasuk snack? (true/false): ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("true")) {
                    includeSnack = true;
                    break;
                } else if (input.equalsIgnoreCase("false")) {
                    includeSnack = false;
                    break;
                } else {
                    System.out.println("Masukkan harus true atau false.");
                }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Rentalps[] Rentalpsvip = new Rentalps[3];` adalah contoh penggunaan array.

```bash
private static Rentalps[] daftarPsRental = new Rentalps[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
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

Nama: Muhammad Ridhoni Ilham
NPM: 2110010515
