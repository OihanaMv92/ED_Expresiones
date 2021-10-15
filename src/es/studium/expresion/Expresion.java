package es.studium.expresion;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a,b,c;
		float r;
		System.out.println("Dame un numero entero equivalente letra a ");
		a = teclado.nextInt();
		System.out.println("Ingrese otro numero entero para b ");
		b = teclado.nextInt();
		System.out.println("Ingrese otro numero entero para c ");
		c = teclado.nextInt();
		r = expresion (a,b,c);
		System.out.println("El resultado es " + r);
		teclado.close();
	}
	public static float expresion (int a, int b, int c)
	{
		return ((((float)b*(float)b)-(4*(float)a*(float)c))/(2*(float)a));
	}

}
