import java.util.Scanner;
public class tugas2jobsheet3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); 
        double upah, gajiKotor, gajiBersih, gajibonus;
        byte jKerja;
        double bonus = 10/100, pajak = 5/100;

        System.out.println("Masukkan jam kerja: ");
        jKerja = cin.nextByte();
        System.out.println("Masukkan upahn per jam: ");
        upah = cin.nextInt();

        gajiKotor = jKerja * upah;
        gajibonus = (gajiKotor + bonus * gajiKotor);
        gajiBersih = (gajibonus - pajak * gajibonus);

        System.out.println("gaji bulanan anda adalah Rp " + (gajiBersih * 30));

    }
}
