import java.util.Scanner;
public class tugas1jobsheet3_07 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        double pListrik, tagihan;
        int tarif = 1500;
        
        System.out.println("Masukkan Penggunaan Listrik Anda dalam kWh: ");
        pListrik = cin.nextDouble();
        tagihan = pListrik * tarif;
        boolean lebih = pListrik > 500;
        System.out.println("Tagihan listrik anda Rp " + tagihan + " kWh");
        System.out.println("apakah melebihi 500 kWh? " + lebih);
    }    
}
