package ifElse;

import java.util.Scanner;


public class nilai {

    public static void main (String [] hady){

        String nama , nim ;

        final double n_tugas , n_uts , n_proyek , n_uas , n_akhir , n_kehadiran;

        Scanner input = new Scanner (System.in);

  System.out.println("===== Nilai akhir Mahasiswa Prgram Studi Teknik Informatika=====\n");

        System.out.print("Masukan nama : ");

        nama = input.nextLine();

        System.out.print("Masukan NIM : ");

        nim = input.nextLine();

        System.out.print("Nilai tugas : ");

        n_tugas = input.nextInt();

        System.out.print("Nilai kuis : ");

        n_proyek = input.nextInt();

        System.out.print("Nilai uts : ");

        n_uts = input.nextInt();

        System.out.print("Nilai uas : ");

        n_uas = input.nextInt();
        
        System.out.print("Nilai kehadiran : ");

        n_kehadiran = input.nextInt();

        n_akhir = ((0.20 * n_tugas) + (0.20 * n_proyek) + (0.20 * n_uts) + (0.25 * n_uas) + (0.15 * n_kehadiran));

        System.out.println(nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir);

    }

}