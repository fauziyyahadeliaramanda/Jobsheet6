import java.util.Scanner;
public class Pemilihan2Percobaan210 {
    public static void main (String[]args){
        Scanner input10 = new Scanner (System.in);

        int totalSudut, sudut1, sudut2, sudut3;

        System.out.println("Masukkan sudut 1");
        sudut1 = input10.nextInt();
        System.out.println("Masukkan sudut 2");
        sudut2 = input10.nextInt();
        System.out.println("Masukkan sudut 3");
        sudut3 = input10.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;
        
        if (totalSudut == 180){
            if((sudut1 == 90)|| (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku0siku");
            else
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        }else
        System.out.println("Bukan Segitiga");
    }
}
