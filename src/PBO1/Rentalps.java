package PBO1;

// 1. class
public class Rentalps {
    // 3. atribut
    // 7. Encapsulation 
    private String namaGame;
    private int hargaPerJam;
    private int durasiSewa;

    // 4. constructor   
    public Rentalps(String namaGame, int hargaPerJam, int durasiSewa) {
        this.namaGame = namaGame;
        this.hargaPerJam = hargaPerJam;
        this.durasiSewa = durasiSewa;
    }

    // 6. accessor
    public String getNamaGame() {
        return namaGame;
    }

    public void setNamaGame(String namaGame) {
        this.namaGame = namaGame;
    }

    public int getHargaPerJam() {
        return hargaPerJam;
    }

    // 5. mutator
    public void setHargaPerJam(int hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    public int getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }

    // 9. Polymorphism @Override
    public String toString() {
        return "PsRental{" +
                "namaGame='" + namaGame + '\'' +
                ", hargaPerJam=" + hargaPerJam + " IDR" +
                ", durasiSewa=" + durasiSewa + " jam" +
                '}';
    }
}
