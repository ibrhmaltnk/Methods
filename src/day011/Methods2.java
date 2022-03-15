package day011;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
/*        int sayi1=5;
        int sayi2=6;
        System.out.println(sayi1+" tek mi? "+tekMi(sayi1));
        System.out.println(sayi2+" tek mi? "+tekMi(sayi2));*/

        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınız : ");
        int dYil=input.nextInt();
        int aYil=LocalDateTime.now().getYear();

        System.out.println("Senin Yaşın = "+calculateAge(dYil,aYil));
    }

    //Bir sayının tek olup olmadığını test eden bir metot yazınız.
    public static boolean tekMi(int sayi){
        boolean result=(sayi%2)==1;
        return result;
    }

    //Kaç yaşında olduğunu hesaplayan metot yazınız.
    public static int calculateAge(int birthYear,int currentYear){
        int age=currentYear-birthYear;
        return age;
    }
}
