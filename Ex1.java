import java.util.Scanner;

public class EX1 {

    public static void main(String[] args){

        double a;
        double b;
        double c;
        double d;

        Scanner ET=new Scanner(System.in);

        System.out.print("\nDigite a primeira nota: ");
        a=ET.nextDouble();
        System.out.print("\nDigite a segunda nota: ");
        b=ET.nextDouble();
        System.out.print("\nDigite a terceira nota: ");
        c=ET.nextDouble();
        System.out.print("\nDigite a quarta nota: ");
        d=ET.nextDouble();

        a=(a+b+c+d)/4;

        if(a>=8.5){
            System.out.print("\nVocê foi Aprovado.");
        }else if(a<=6){
            System.out.print("\nVocê foi Retido.");
        }else{
            System.out.print("\nVocê esta no Exame.");
        }
    }
}