import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        String member, qris;
        int pilihan_menu;
        double diskon, harga, total_bayar = 0, potonganHarga;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang di pilih = ");
        pilihan_menu = input11.nextInt();
        input11.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input11.nextLine();
        System.out.println("Apakah Ingin pembayaran melalui Qris (y/n)? = ");
        qris = input11.nextLine();

        System.out.println("-----------------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if(pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu yang benar");
                return;
            } 
            total_bayar = harga - (harga * diskon);
            System.out.println("Total Bayar setelah diskon = " + total_bayar);
        }
        else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
            
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
            System.out.println("Total Bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        }
        if (qris.equals("y")) {
            potonganHarga = 1000;
            total_bayar -= potonganHarga;
            System.out.println("Anda mendapatkan potongan Rp1000 karena menggunakan pembayaran Qris ");
            System.out.println("Total Bayar menggunakan Qris = " + total_bayar);

        }
        System.out.println("----------------------------------------");
    }
}