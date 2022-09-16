import java.util.Scanner;

public class Ucgen_Alani {
    public static void main(String[] args) {
        //Değişkenleri belirle
        double a,b,c,u,alan;

        //Kullanıcıdan Verileri alalım
        Scanner input = new Scanner (System.in);
        System.out.println("Birinci kenar ölçüsünü giriniz:");
        a = input.nextInt();
        System.out.println("İkinci kenar ölçüsünü giriniz:");
        b= input.nextInt();
        System.out.println("Üçüncü kenar ölçüsünü giriniz:");
        c= input.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan :" + alan );

    }
}
