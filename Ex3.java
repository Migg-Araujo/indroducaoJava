import java.util.Scanner;
import java.lang.Math;

public class EX3 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double Delta;
		double x1;
		double x2;
		
	Scanner ET = new Scanner(System.in);
		
		System.out.print("\nApresente o primeiro Valor: \n");
		a = ET.nextDouble();
		System.out.print("\nApresente o segundo Valor: \n");
		b = ET.nextDouble();
		System.out.print("\nApresente o terceiro Valor: \n");
		c = ET.nextDouble();

		Delta= (b*b) -(4*a*c);
		if(Delta>0) {
			x1= (-(b)+(Math.sqrt(Delta)))/(2*a);
			System.out.print(x1+"\n");
			x2= (-(b)-(Math.sqrt(Delta)))/(2*a);
			System.out.print(x2+"\n");
		}else if(Delta==0) {
			x1= -(b)/2*a;
			System.out.print(x1+"\n");
		}else {
			System.out.print("\nDelta Menor que zero!!!\n");
		}
		

	}

}