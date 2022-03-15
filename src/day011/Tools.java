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

}
