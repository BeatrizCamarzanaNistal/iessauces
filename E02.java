/*2. Realiza el pseudocódigo y la codificación en lenguaje de programación
Java de un algoritmo que solicite por teclado dos números enteros
positivos y muestre por pantalla un mensaje indicando si el segundo es
divisor del primero o no.*/
import java.util.Scanner;
public class E02{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int num1, num2;
		System.out.print("Introduzca primer numeor por favor ");
		num1=teclado.nextInt();
		System.out.print("Introduzca segundo segundo por favor ");
		num2=teclado.nextInt();
		
		if(num1%num2==0){
			System.out.println(num2+" es divisor de "+num1);
		}else{
			System.out.println(num2+" NO es divisor de "+num1);
		}
		
	}
}
