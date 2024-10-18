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

            switch (choice) { //Memilih menu
                case 1:
                    showPackages();
                    break;
                case 2:
                    selectPackages();
                    break;
                case 3:
                    inputCustomerData();
                    break;
                case 4:
                    calculateTotalPrice();
                    break;
                case 5:
                    calculateDeliveryFee();
                    break;
                case 6:
                    confirmOrder();
                    break;
                case 7:
                    showOrderDetails();
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

    public static void selectPackages(){
        System.out.print("Pilih Paketan yang ingin dipesan (1-3): ");
        int packageChoice = scanner.nextInt();
        System.out.print("Masukkan jumlah pesanan: ");
        int quantity = scanner.nextInt();

        switch (packageChoice){
            case 1:
                totalPrice += 100000 * quantity;
                break;
            case 2:
                totalPrice += 200000 * quantity;
                break;
            case 3:
                totalPrice += 50000 * quantity;
                break;
            default:
                System.out.println("Paketan tidak valid! ");
        }
    }

    public static void inputCustomerData(){
        scanner.nextLine();
        System.out.print("Masukkan nama: "); //Menginput nama pemesan
        customerName = scanner.nextLine();
        System.out.print("Masukkan alamat: "); //Menginput Alamat pemesan
        customerAddress = scanner.nextLine();
        System.out.print("Masukkan nomor hp: "); //Menginput nomor HP pemesan
        customerPhone = scanner.nextLine();
    }

    public static void calculateTotalPrice(){
        System.out.println("Total harga saat ini: Rp " + totalPrice); //Menghitung total harga keseluruhan
    }

    public static void confirmOrder(){
        System.out.println("Pesanan telah dikonfirmasi."); //Mengkorfimasi orderan
    }

    public static void showOrderDetails(){
        System.out.println("===== Detail Pesanan ====="); //Menampilkan detail orderan data pembeli
        System.out.println("Nama: " + customerName);
        System.out.println("Alamat: " + customerAddress);
        System.out.println("Nomor Hp: " + customerPhone);
        System.out.println("Ongkos Antar: Rp " + deliveryFee);
        System.out.println("Total Harga: Rp " + totalPrice);
    }

    public static void calculateDeliveryFee(){
        System.out.print("Masukkan jarak ke alamat (km): "); //menginput data jarak alamat
        distance = scanner.nextInt();
        deliveryFee = distance * 5000; //menghitung ongkos 1KM = Rp.5000
        System.out.println("Ongkos antar: Rp " + deliveryFee);
        totalPrice += deliveryFee;
    }
}




