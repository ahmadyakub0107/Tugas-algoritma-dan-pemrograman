import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;
        double gajiPokok = 0, persenLembur = 0;
        double gajiLembur, totalGaji;

        System.out.println("=== PROGRAM GAJI KARYAWAN ===");
        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        golongan = input.next().toUpperCase();

        System.out.print("Masukkan jumlah jam lembur: ");
        jamLembur = input.nextInt();

        // Menentukan gaji pokok berdasarkan golongan
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
        }

        // Menghitung gaji lembur jika golongan valid
        if (gajiPokok > 0) {
            if (jamLembur == 1) {
                persenLembur = 30;
            } else if (jamLembur == 2) {
                persenLembur = 32;
            } else if (jamLembur == 3) {
                persenLembur = 34;
            } else if (jamLembur == 4) {
                persenLembur = 36;
            } else if (jamLembur >= 5) {
                persenLembur = 38;
            } else {
                persenLembur = 0;
            }

            // Operator aritmetika
            gajiLembur = gajiPokok * persenLembur / 100;
            totalGaji = gajiPokok + gajiLembur;

            // Menampilkan hasil
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Golongan Karyawan : " + golongan);
            System.out.println("Gaji Pokok        : Rp " + gajiPokok);
            System.out.println("Jam Lembur        : " + jamLembur + " jam");
            System.out.println("Persentase Lembur : " + persenLembur + "%");
            System.out.println("Gaji Lembur       : Rp " + gajiLembur);
            System.out.println("Total Gaji        : Rp " + totalGaji);
        }

        input.close();
    }
}