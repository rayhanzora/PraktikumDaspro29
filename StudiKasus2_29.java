import java.util.Scanner;

public class StudiKasus2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara;
        int statusPKM;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            peringkatJuara = sc.nextInt();
            if (jumlahDokumen == 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Statuss: Dana penghargaan diberikan ");
                } else {
                    System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status: Dokumen tidak lengkap (kurang " + (4-jumlahDokumen)+ "dokumen). Dana penghargaan tidak diberikan");
            }
        } else if (jenisKegiatan.equals("PKM")){
            System.out.print("Status pendanaan PKM (1/0): ");
            statusPKM = sc.nextInt();
            if (jumlahDokumen == 4) {
                if (statusPKM == 1) {
                    System.out.println("Status: Dana penghargaan diberikan");
                } else {
                    System.out.println("Status: PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status: Dokumen tidak lengkap (kurang " + (4-jumlahDokumen)+ "dokumen). Dana penghargaan tidak diberikan");
            }
        } else {
            System.out.println("Kegiatan diluar kedua ketentuan, tidak memperoleh dana penghargaan");
        }
        sc.close();
    }
}
