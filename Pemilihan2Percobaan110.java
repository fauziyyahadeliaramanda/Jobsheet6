import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Pemilihan2Percobaan110{
    public static void main (String[]args){
        Scanner input10 = new Scanner (System.in);

        int tahun;

        System.out.println("Masukkan Tahun");
        tahun = input10.nextInt();
      
        if((tahun % 400)==0){
            if ((tahun % 100)!= 0)
            System.out.println("Tahun Kabisat");
        }else if ((tahun % 4)==0){
                if ((tahun % 100)!=0)
                System.out.println("Tahun Kabisat");
                else
                System.out.println("Bukan Tahun Kabisat");
            }else
            System.out.println("Bukan Tahun Kabisat");
        }
    }
