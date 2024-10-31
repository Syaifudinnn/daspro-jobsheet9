import java.util.Scanner;

public class ArrayRataNilai16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi array
        //int[] nilaiMhs = new int[10];
        
        //deklarasi variable
        double total = 0;
        double rata2;
        int mhsLulus = 0;

        //input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = input.nextInt();

        //deklarasi array dengan inputan jumlah mahasiswa
        int[] nilaiMhs = new int[jmlMhs];

        //logic untuk input nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + "\t : ");
            nilaiMhs[i] = input.nextInt();
        }

        //logic untuk menghitung jumlah nilai keseluruhan
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        //logic untuk menghitung jumlah mhs yg lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                mhsLulus += 1;
            }
        }

        //logic untuk hitung rata2
        rata2 = total / nilaiMhs.length;

        //output
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Jumlah mahasiswa yg lulus : " + mhsLulus);

    }

}
