import java.util.Scanner;

public class Pemilihan2Tugas11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        String jenisBuku;
        double hargaBuku = 20000.0, jumlahDiskon = 0, totalHarga;
        int jumlahBuku;

        System.out.println("Masukkan Jenis Buku : ");
        jenisBuku = input11.nextLine();
        System.out.println("Jumlah Buku yang ingin dibeli : ");
        jumlahBuku = input11.nextInt();
         
        if ( jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku <= 2)
            jumlahDiskon = 0.1 * hargaBuku * jumlahBuku;
            else if (jumlahBuku > 2 )
            jumlahDiskon = 0.12 * hargaBuku * jumlahBuku;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3)
            jumlahDiskon = 0.09 * hargaBuku * jumlahBuku;
            else if (jumlahBuku <= 3)
            jumlahDiskon = 0.08 * hargaBuku * jumlahBuku;
        } else if (jenisBuku.equalsIgnoreCase("Lainnya")) {
            if (jumlahBuku > 3)
            jumlahDiskon = 0.05 * hargaBuku * jumlahBuku;
        } 
        System.out.println("Jumlah Diskon yang di dapat : " + jumlahDiskon);
            totalHarga = (hargaBuku * jumlahBuku) - jumlahDiskon;
            System.out.println("Total Harga Bayar buku : " + totalHarga);
    }
}
