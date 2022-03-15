package day011;

public class Numbers {
    public static void main(String[] args) {
/*        System.out.println("Max "+getMax(30,5));
        showMax(5,90);
        int kat5=5*getMax(10,20);
        System.out.println(kat5);*/



        int kucukSayi=getMin(14,28);
        getMin(6,4);
        System.out.println("Küçük Sayı = "+kucukSayi);
        System.out.println("Küçük Sayı = "+getMin(44,35));



    }

    //Verilen iki sayıdan büyük olanı tespit eden metot yazınız.
    public static int getMax(int x,int y){
        int max=x;
        if (y>max){
            max=y;
        }
        return max;
    }

    //Verilen iki sayıdan küçük olanı tespit eden metot yazınız.
    public static int getMin(int a, int b){
        int min=a;
        if(b<min){
            min=b;
        }
       return min;
    }

    public static void showMax(int x,int y){
        System.out.println("Max = "+getMax(x,y));
    }
}
