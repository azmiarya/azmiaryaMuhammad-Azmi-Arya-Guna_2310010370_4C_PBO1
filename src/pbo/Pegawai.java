
package pbo;
// class
public class Pegawai {
    // enkapsulasi dan atribut
    private String nama;
    private String nip;
    
    // constructor
    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    // mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    // accessor
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    
    // constructor biasa
    public void tampilInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("NIP             : " + nip);
    }
}
