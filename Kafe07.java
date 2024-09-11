import java.util.Scanner;
public class Kafe07 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, totalByte, nominalBayar, nominalInt;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt ();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        totalByte = (byte) totalHarga;
        nominalBayar = totalByte - (diskon * totalByte);
        nominalInt = (int) nominalBayar;

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println(String.format("Item pembelian %s kopi, %s teh, %s roti", jmlKopi, jmlTeh, jmlRoti));
        System.out.println("Nominal bayar Rp " + nominalInt);
    }
}
