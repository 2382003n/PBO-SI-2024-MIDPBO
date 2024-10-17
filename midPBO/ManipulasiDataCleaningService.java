package midPBO;

import java.util.Scanner;

public class ManipulasiDataCleaningService {
    static Scanner scanner = new Scanner(System.in);
    static String customerName, customerAddress, customerPhone;
    static double totalPrice = 0;
    static double deliveryFee = 0;
    static int distance = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("============ Cleaning Service UNAI ============");
            System.out.println("1. Tampilkan paketan bersih-bersih dan harga");
            System.out.println("2. Pilih Paketan dan jumlah pesanan");
            System.out.println("3. Input data pembeli (nama, alamat, nomor telepon)");
            System.out.println("4. Hitung total harga pesanan");
            System.out.println("5. Sistem antar (hitung ongkos jarak)");
            System.out.println("6. Konfirmasi pesanan");
            System.out.println("7. Tampilkan detail pesanan");
            System.out.println("8. Keluar");
            System.out.println("===============================================");
            System.out.print("Pilih opsi Menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showPackages();
                    break;
                case 2:
//                    selectPackages();
                    break;
                case 3:
//                    inputCustomerData();
                    break;
                case 4:
//                    calculateTotalPrice();
                    break;
                case 5:
//                    calculateDeliveryFee();
                    break;
                case 6:
//                    confirmOrder();
                    break;
                case 7:
//                    showOrderDetails();
                    break;
                case 8:
                    System.out.println("Keluar...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }


    public static void showPackages() {
        System.out.println("=== Daftar Paketan ===");
        System.out.println("1. Pembersihan Halaman - Rp 100,000");
        System.out.println("2. Pembersihan Rumah - Rp 200,000");
        System.out.println("3. Pembersihan Kamar - Rp 50,000");
    }
}




