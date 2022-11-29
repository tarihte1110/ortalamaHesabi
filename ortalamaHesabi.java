import java.util.Scanner;
public class ortalamaHesabi {
    public static void main(String[] args){
        int mat,fizik,kimya,biyoloji,turkce;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat=input.nextInt();
        System.out.print("Türkçe notunuz:");
        turkce=input.nextInt();
        System.out.print("Fizik notunuz:");
        fizik=input.nextInt();
        System.out.print("Kimya notunuz:");
        kimya=input.nextInt();
        System.out.print("Biyoloji notunuz:");
        biyoloji=input.nextInt();

        double avarage;

        if(0>mat || mat>100){
            avarage=(kimya+turkce+fizik+biyoloji)/4;
        }
        else if(0>biyoloji || biyoloji>100){
             avarage=(mat+kimya+fizik+turkce)/4;
        }
        else if(0>fizik || fizik>100){
             avarage=(mat+kimya+turkce+biyoloji)/4;
        }
        else if(0>turkce || turkce>100){
             avarage=(mat+fizik+kimya+biyoloji)/4;
        }
        else if(0>kimya || kimya>100){
             avarage=(mat+turkce+fizik+biyoloji)/4;
        }
        else{
             avarage=(mat+turkce+fizik+kimya+biyoloji)/5;
        }

        System.out.print("Ortalamanız:" + avarage);

        if(avarage<=55){
            System.out.print("\nSınıfta kaldınız.");
        }
        else{
            System.out.print("\nSınıfı geçtiniz.");
        }
    }
}
