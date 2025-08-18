
package pbo;
// inheritence
public class PegawaiDetail extends Pegawai {
    // atribut tambahan untuk detail data pegawai
    private String jenis;
    private double gaji;
    
    // overriding
    public PegawaiDetail(String nama, String nip, String jenis, double gaji) {
        super(nama, nip);
        this.jenis = jenis;
        this.gaji = gaji;
    }
    
    // accessor
    public String getJenis() {
        return jenis;
    }

    public double getGaji() {
        return gaji;
    }
    
    //polymorphism (overriding)
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis Pegawai   : " + jenis);
        System.out.println("Gaji            : Rp " + gaji);
    }
    
    
}
