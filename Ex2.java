import java.util.Scanner;

public class EX2 {

    public static void main(String[] args){

        double a;
        double b;
        double c;

        Scanner ET=new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        a=ET.nextDouble();
        System.out.print("\nDigite o segundo valor: ");
        b=ET.nextDouble();
        System.out.print("\nDigite o terceiro valor: ");
        c=ET.nextDouble();

        if(a<b && a<c){
            System.out.print("\n"+a);
            if(b<c){
                System.out.print("\n"+b);
                System.out.print("\n"+c);
            }else{
                System.out.print("\n"+c);
                System.out.print("\n"+b);
            }
        }else if(b<c){
            System.out.print("\n"+b);
            if(a<c){
                System.out.print("\n"+a);
                System.out.print("\n"+c);
            }else{
                System.out.print("\n"+c);
                System.out.print("\n"+a);
            }
        }else{
            System.out.print("\n"+c);
            if(a<b){
                System.out.print("\n"+a);
                System.out.print("\n"+b);
            }else{
                System.out.print("\n"+b);
                System.out.print("\n"+a);
            }
        }
    }
}