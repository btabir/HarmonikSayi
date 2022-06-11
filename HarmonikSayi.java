package Hesaplamalar;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int n=input.nextInt();
        double total = 0;      //Burada ve asagida double atamasi yapmanin sebebi,double sayi inte bolunmez
                              // ve formulde ondalik sayi oldugu icin bize kesin sonuc vermez.Bu yuzden double
                             //kullanmamiz gerek
        for (double i=1;i<=n;i++){
            total+=1/i;
        }
        System.out.println("Sonuc :"+total);

    }
}
