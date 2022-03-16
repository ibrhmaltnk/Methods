package day011;


/**
 * Metotların overload edilmesi
 */
public class Calculator {
    public static void main(String[] args) {

        topla(4,4);
        topla(4.3,5);
        int result1=cikar(5,2);
        double result2=cikar(8.9,7.3);
        System.out.println(result1);
        System.out.println(String.format("%4.2f",result2));
    }

    public static double cikar(double x, double y) {
        return x-y;
    }


    public static int cikar(int x,int y){
        return x-y;
    }



    //İki veya daha fazla metodun parametre tipleri ve/veya parametre adetleri birbirinden farklı ise
    //metotların imzaları birbirinden farklıdır denilir. Bu şekilde aynı isimde istenildiği kadar
    //metot yazılabilir. Bu durum metotların overload (aşırı yükleme) edilmesidir.
    //Metotların dönüş tipleri imzadan sayılmaz.
    public static int topla(int x,int y){
        return x+y;
    }


    public static double topla(double x, double y){
        return x+y;
    }








}
