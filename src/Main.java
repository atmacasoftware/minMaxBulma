import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken tanımlanması
        int giricekSayi, sayi, max=0, min=999999999;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan girilecek sayının alınması
        System.out.print("Kaç Sayı Gireceksizin : ");
        giricekSayi = input.nextInt();

        for(int i=1; i<=giricekSayi; i++){
            System.out.print(i + "'inci Sayıyı Giriniz : ");
            sayi = input.nextInt();

            //Sayı maxdan büyük olursa max değerine ilgili sayı atanır.
            if(sayi >= max){
                max = sayi;
            }

            //Sayı minden küçük olursa min değerine ilgili sayı atanır.
            if(sayi <= min){
                min = sayi;
            }

        }

        //Sonuçların ekana yazdırılması
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);

    }
}