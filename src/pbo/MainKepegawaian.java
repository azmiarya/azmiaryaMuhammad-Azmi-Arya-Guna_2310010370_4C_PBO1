
package pbo;

import java.util.Scanner;

public class MainKepegawaian {
    public static void main(String[] args) {
        //  IO sederhana
        Scanner scanner = new Scanner(System.in);
        
        // array
        PegawaiDetail[] listpegawai1 = new PegawaiDetail[2]; //lenght
        PegawaiDetail[] listpegawai2 = new PegawaiDetail[2];
        
        System.out.println("===== INPUT DATA PEGAWAI =====");
        
        // perulangan
        for(int i = 0; i < listpegawai1.length; i++){
            System.out.println("\nPegawai ke-" + (i + 1)); // 1., 2., dst...(jika length ingin ditambah)
            
            System.out.println("Nama Pegawai: ");
            String nama = scanner.nextLine();
            
            System.out.println("NIP Pegawai: ");
            String nip = scanner.nextLine();
            
            String jenis = "";
            
            // seleksi
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
            // objek
            listpegawai1[i] = new PegawaiDetail(nama, nip, jenis, gaji);
            listpegawai2[i] = new PegawaiDetail(nama, nip, jenis, gaji);
        }
        
        // hasil akhir output
        System.out.println("\n===== DATA PEGAWAI =====");
        for(PegawaiDetail data : listpegawai1){
            data.tampilInfo();
            System.out.println("----------------------");
        }
    }
}        