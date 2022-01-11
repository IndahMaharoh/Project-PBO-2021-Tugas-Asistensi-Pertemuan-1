package tugasasistensi1_07342;
import java.util.Scanner;

public class TugasAsistensi1_07342 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banyak_07342, total_07342 = 0;
        float rata_rata_07342;
        String nama_matkul;
        int nilai_07342 [] = new int[100];
        
        System.out.print("Masukkan Jumlah Matkul : ");
        banyak_07342 = scan.nextInt();
        
        for (int i =1; i<= banyak_07342; i++)
        {
                System.out.print("Nama Matkul ke - "+i + " : ");
                nama_matkul = scan.next();
                System.out.print("Masukan Nilai Matkul " + nama_matkul + " : ");
                nilai_07342[i] = scan.nextInt();
                total_07342 = total_07342+nilai_07342[i];
        }
        System.out.println("Nilai total : " + total_07342);
        rata_rata_07342 = total_07342/banyak_07342;
        System.out.println("Nilai Rata-Rata : " + rata_rata_07342);
        if (rata_rata_07342 < 60)
        {
            System.out.println("E\nTIDAK LULUS");
        }
        else if (rata_rata_07342 <70 && rata_rata_07342 >= 60)
        {
            System.out.println("D\nTIDAK LULUS");
        }
        else if (rata_rata_07342 >=70 && rata_rata_07342 <75)
        {
            System.out.println("C\nTIDAK LULUS");
        }
        else if (rata_rata_07342 >= 75 && rata_rata_07342 < 80)
        {
                System.out.println("C\nLULUS");
        }
        else if (rata_rata_07342 >= 80 && rata_rata_07342 <=90)
        {
            System.out.println("B\nLULUS");
        }
        else
        {
            System.out.println("A\nLULUS");
        }
    }  
}