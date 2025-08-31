import java.util.Scanner;

public class Pujasera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Inisialisasi menu-menu untuk setiap kios
        Menu[] menuKantinDharmaWanita = {
            new Menu("Nasi Goreng Komplit", 17000),
            new Menu("Spaghetti Komplit", 17000),
            new Menu("Yoghurt", 12000)
        };
        
        Menu[] menuKantinMikes = {
            new Menu("Jus Jeruk", 8000),
            new Menu("Jus Mangga", 8000),
            new Menu("Extrajoss Susu", 5000)
        };
        
        Menu[] menuHarumanJaya = {
            new Menu("Nasi goreng Katsu", 15000),
            new Menu("Spaghetti Katsu", 15000),
            new Menu("Es Teh", 5000)
        };
        
        // Inisialisasi kios-kios
        Kios[] daftarKios = {
            new Kios("Kantin Dharma Wanita", menuKantinDharmaWanita),
            new Kios("Kantin Mikes", menuKantinMikes),
            new Kios("Haruman Jaya", menuHarumanJaya)
        };
        
        while (true) {
            System.out.println("\n=== SELAMAT DATANG DI PUJASERA POLBAN ===");
            System.out.println("Daftar Kios:");
            
            // Menampilkan daftar kios
            for (int i = 0; i < daftarKios.length; i++) {
                System.out.println((i + 1) + ". " + daftarKios[i].getNama());
            }
            System.out.println("0. Keluar");
            
            // Transaksi pemesanan
            System.out.print("\nPilih kios (Masukkan nomor): ");
            int pilihanKios = sc.nextInt();
            if (pilihanKios == 0) {
                System.out.println("Terima kasih telah mengunjungi Pujasera!");
                break;
            }
            
            if (pilihanKios < 1 || pilihanKios > daftarKios.length) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            
            Kios kiosTerpilih = daftarKios[pilihanKios - 1];
            Menu[] menuKios = kiosTerpilih.getMenu();
            
            System.out.println("\nMenu di " + kiosTerpilih.getNama() + ":");
            for (int i = 0; i < menuKios.length; i++) {
                System.out.println((i + 1) + ". " + menuKios[i].getNama() + " - Rp " + menuKios[i].getHarga());
            }
            
            System.out.print("\nPilih menu (Masukkan nomor): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > menuKios.length) {
                System.out.println("Pilihan menu tidak valid!");
                continue;
            }

            System.out.print("Masukkan jumlah pembelian: ");
            int jumlahPembelian = sc.nextInt();

            if (jumlahPembelian < 0) {
                System.out.println("Jumlah pembelian tidak valid!");
                continue;
            }
            
            Menu menuTerpilih = menuKios[pilihanMenu - 1];
            int totalHarga = jumlahPembelian * menuTerpilih.getHarga();
            System.out.println("\nAnda memesan " + jumlahPembelian + " "+ menuTerpilih.getNama() + " seharga Rp " + totalHarga);
            System.out.println("Terima kasih!");
        }
        
        sc.close();
    }
}