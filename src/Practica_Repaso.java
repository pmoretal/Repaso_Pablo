import java.util.Scanner;

public class Practica_Repaso {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		float num1=0.0f;
		float num2=0.0f;
		String respuesta="";
		System.out.println("Introduce el primer n�mero");
		num1=ent.nextFloat();
		System.out.println("Introduce el segundo n�mero");
		num2=ent.nextFloat();
		System.out.println("Introduce la operaci�n a realizar (suma, resta, multiplicaci�n o divisi�n)");
		respuesta=ent.next();
		switch(respuesta) {
			case "suma":
				sumar(num1,num2);
				break;
			case "resta":
				restar(num1,num2);
				break;
			case "multiplicaci�n":
				multiplicar(num1, num2);
				break;
			case "divisi�n":
				dividir(num1, num2);
				break;
			default:
				System.out.println("Operaci�n Incorrecta");
			
		}
		
		

	}

	public static void sumar(float num1, float num2) {
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1+num2));
	}
	
	public static void restar(float num1, float num2) {
		System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1-num2));
	}
	public static void multiplicar(float num1, float num2) {
		System.out.println("La multiplicaci�n de " + num1 + " y " + num2 + " es " + (num1*num2));
	}
	public static void dividir(float num1, float num2) {
		System.out.println("La divisi�n de " + num1 + " y " + num2 + " es " + (num1/num2));
	}


}
