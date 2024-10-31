import java.util.Scanner;

public class ArrayNilai16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi array
        int[] nilaiAkhir = new int[10];
        
        //logic untuk input nilai
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + "\t: ");
            nilaiAkhir[i] = input.nextInt();
        }

        //logic untuk menampilkan isi array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }
            else if (nilaiAkhir[i] <= 70) {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
        }

    }

}
