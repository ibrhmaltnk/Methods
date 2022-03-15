package day011;


/**
 * Metotların overload edilmesi
 */
public class Calculator {
    public static void main(String[] args) {
        topla(4,4);
        topla(4.3,5);
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
