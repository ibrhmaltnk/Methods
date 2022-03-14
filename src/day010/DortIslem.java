package day010;

public class DortIslem {
    public static void main(String[] args) {
        int x=7;
        int y=3;
        ikiSayiyiTopla(x,y);
        ikiSayiyiTopla(8,4);
        System.out.println("Toplam = "+topla(6,7));


    }
    //İki tam sayıyı toplayan bir metot yazınız. Sonuç ekranda gösterilsin
    //Örnek; İki sayının toplamı 25'tir.

    public static void ikiSayiyiTopla(int a, int b){
        int toplam=a+b;
        System.out.println(String.format("İki sayının toplamı %d.",toplam));
    }

    //İki tam sayıyı toplayıp, sonucunu çağırıldığı yere döndüren bir metot yazınız.
    public static int topla(int x,int y){

        return x+y;
    }

}
