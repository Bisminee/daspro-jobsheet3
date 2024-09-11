import java.util.Scanner;

public class Siakad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiUAS, nilaikuis, nilaiTugas, nilaiUTS, nilaiAkhir;

        System.out.print("Masukkan nama: ") ;
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = ((nilaikuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUTS * 30/100) + (nilaiUAS * 35/100)) ;

        System.out.println(String.format("Mahasiswa %s dengan NIM %s, kelas %s nomor absen %s", nama, nim, kelas, absen));
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
