import java.util.Scanner;
public class tugas1bioskop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int hargaTiket = 50000;
    int totalTiketTerjual = 0;
    double totalHargaPenjualan = 0;
    int jumlahTiket;
    System.out.println("PROGRAM PENJUALAN TIKET BIOSKOP");

    while (true){
        System.out.print("Masukkan jumlah tiket yang dibeli(ketik 0 untuk selesa/keluar): ");
        jumlahTiket = sc.nextInt();
        if(jumlahTiket == 0){
            break;
        }
        if(jumlahTiket == 0){
            break;
        }
        if(jumlahTiket < 0){
            System.out.println("Jumlah tiket tidak valid. Silahkan masukkan angka positif!\n");
            continue;
        }
        double totalHarga = jumlahTiket * hargaTiket;
        double diskon = 0;
        
        if(jumlahTiket > 10){
            diskon = 0.15;
        } else if(jumlahTiket > 4){
            diskon = 0.10;
        }
        double totalBayar = totalHarga - (totalHarga * diskon);
    totalTiketTerjual += jumlahTiket;
    totalHargaPenjualan += totalBayar;
    System.out.println("Harga sebelum diskon: Rp " + totalHarga);
    System.out.println("Diskon              : " + (diskon * 100) + "%");
    System.out.println("Total yang di bayar : Rp " + totalBayar + "\n");
    }
     System.out.println("=== LAPORAN PENJUALAN TIKET HARI INI ===");
     System.out.println("Total tiket terjual : " + totalTiketTerjual + "tiket");
     System.out.println("Total pendapatan : Rp " + totalHargaPenjualan);
     sc.close();
    }
 
}
