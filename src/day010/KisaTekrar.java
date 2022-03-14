package day010;

public class KisaTekrar {
    public static void main(String[] args) {
        //Değişken tanımlama
        //Resmi - gayrı resmi kurallar
        //Notasyonlar: Camel, Pascal, Snake
        //Sınıf tanımlamaları Pascal
        //Değişken ve Metot tanımlamaları ise Camel
        //Constant için Snake: PI_SAYISI
        int birinciSayi=15;
        //Operatörler:
        // Aritmetik: +,-,*,/,%
        //Relational Ops: ==, !=, <,>,<=,>=
        //Logical Ops: &,|,!
        int ikinciSayi=7;
        if (birinciSayi>ikinciSayi&ikinciSayi>=0){
            System.out.println("İşlem geçerli.");
        }else {
            System.out.println("Geçersiz.");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Merhaba");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        int sayac=6;
        int toplam=0;
        while (sayac<=5){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("Toplam = "+toplam);
        do{
            //statement(s);
        }while (sayac<=5);
    }
}
