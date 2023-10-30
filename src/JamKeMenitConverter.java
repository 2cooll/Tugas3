import java.util.Scanner;

/**
 * ini adalah class program jam ke menit
 * dalam class ini berisi fungsi untuk program ini
 */

/**
 * ini program convert jamkemenit
 */
public class JamKeMenitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * masukkan angka jam yang ingin di ubah ke menit
         * inputan akan di olah oleh program
         */
        System.out.print("Masukkan jumlah jam: ");
        int jam = input.nextInt();

        int menit = jam * 60;
        /**
         * Konversi jam ke menit
         */
        System.out.println(jam + " jam sama dengan " + menit + " menit.");
        /**
         * nanti akan keluar hasil dari jam ke menit
         */
        input.close();
    }
}
