package es.studium.CadenaConcatena;

import java.util.Scanner;

public class CadenaConcatena 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		String a, b, cadena;
		
		System.out.println("Introduce un nombre:");
		a = teclado.next();
		System.out.println("Introduce otro nombre:");
		b = teclado.next();
		
		cadena = a+" "+b;
		System.out.println(String.format("La cadena \"%s\" concatenada con la cadena \"%s\" resulta \"%s\"", a, b, cadena));
		
		teclado.close();
	}

}
