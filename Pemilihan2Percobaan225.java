import java.util.Scanner;

public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        float totalSudut;

        System.out.println("Masukkan Sudut 1 : ");
        float sudut1 = input25.nextInt();
        System.out.println("Masukkan Sudut 2 : ");
        float sudut2 = input25.nextInt();
        System.out.println("Masukkan Sudut 3 : ");
        float sudut3 = input25.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == sudut2) && (sudut2 == sudut3) && (sudut1 == sudut3))   
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1)) 
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else {
            System.out.println("Bukan Segitiga");    
        }

    }
}