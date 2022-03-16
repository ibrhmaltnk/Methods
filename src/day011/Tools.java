package day011;

public class Tools {
    public static void main(String[] args) {

        int aHiz=60;
        int aSure=3;
        int mesafe=calculateDistance(aHiz,aSure);
        System.out.println(String.format("A aracı %d km yol aldı.",mesafe));
        System.out.println("5'in karesi = "+kareAl(5));

        int result=kuvvetAl(2,0);
        System.out.println("Result = "+result);

        System.out.println("86 F --> "+convertFahrenheitToCelcius(86)+" C");
        System.out.println("60 F --> "+convertFahrenheitToCelcius(60)+" C");
        int f=60;
        System.out.println(String.format("%d F ---> %5.1f C",f,convertFahrenheitToCelcius(f)));
        convertFahrenheitToCelcius(95.8);

    }

    public static double convertFahrenheitToCelcius(double grade) {
        return (grade-32)/1.8;
    }

    //Mesafe hesaplayan bir metot yazınız
    public static int calculateDistance(int speed,int time){
        int distance=speed*time;
        return distance;
    }


    //Bir sayının kuvvetini alan metot yazınız.
    public static int kareAl(int sayi){
        return  sayi*sayi;
    }

    public static int kuvvetAl(int sayi, int us){
        int carpim=1;
        for (int i = 0; i < us; i++) {
            carpim *=sayi;//carpim=carpim*sayi;
        }
        return carpim;
    }


    //Sıcaklık Dönüşümü için metot tasarlayınız.
    //30x1.8+32=86
    //(86-32)/1.8=30
    public static double convertFahrenheitToCelcius(int grade){
        return (grade-32)/1.8;
    }

}
