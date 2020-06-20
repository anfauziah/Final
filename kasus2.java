import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class kasus2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            String nama;
            int jum, gol, jkerja, jlembur, gpok;
            double gajitotal, lembur, glembur;

            System.out.println("========== Gaji Karyawan Setiap Minggu CV. ABC ==========");
            
            System.out.print("Nama : ");
            nama=input.next();
            System.out.print("Golongan : ");
            gol=input.nextInt();
            System.out.print("Jam Kerja : ");
            jkerja=input.nextInt();

            switch(gol){
                case 1 : 
                        gpok=3000;
                        break;
                case 2 :
                        gpok=3500;
                        break;
                case 3 :
                        gpok=4000;
                        break;
                case 4 :
                        gpok=5000;
                        break;
                default :
                        gpok=0;
                        
            }

            if (jkerja>40){
                jlembur=jkerja-40;	
            }else{
                 jlembur=0;
            }

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            
            lembur=(1.5 * gpok);
            glembur=(jlembur * lembur);
            gajitotal=(gpok+glembur);

            System.out.println("Nama                 : "+nama);
            System.out.println("Gaji Pokok           : "+ kursIndonesia.format(gpok));
            System.out.println("Gaji Lembur          : "+kursIndonesia.format(glembur));
            System.out.println("Gaji Diterima        : "+kursIndonesia.format(gajitotal));
  }  
}