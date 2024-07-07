package PBO1;

// 8. inheritance
public class Rentalpsvip extends Rentalps {
    private boolean includeSnack;

    // 4. constructor
    public Rentalpsvip(String namaGame, int hargaPerJam, int durasiSewa, boolean includeSnack) {
        super(namaGame, hargaPerJam, durasiSewa);
        this.includeSnack = includeSnack;
    }
    
    // Getter untuk atribut includeSnack
    public boolean isIncludeSnack() {
        return includeSnack;
    }

    // Setter untuk atribut includeSnack
    public void setIncludeSnack(boolean includeSnack) {
        this.includeSnack = includeSnack;
    }

    // 9. Polymorphism  // Override method toString untuk representasi String dari objek PsRentalVIP
    @Override
    public String toString() {
        return "Rentalpsvip{" +
                "namaGame='" + getNamaGame() + '\'' +
                ", hargaPerJam=" + getHargaPerJam() + " IDR" +
                ", durasiSewa=" + getDurasiSewa() + " jam" +
                ", includeSnack=" + includeSnack +
                '}';
    }
}
