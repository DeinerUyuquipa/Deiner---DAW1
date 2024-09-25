package cliente;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tipo cliente (Normal, Socio, VIP): ");
		String tipo = entrada.next();
		System.out.println("Improte compra: ");
		double importe = entrada.nextDouble();
		double vip = importe -(importe *0.20);
		double socio = importe -(importe*0.05);
		
		if(tipo.equals("VIP")){
			System.out.println("Total: "+vip+"€");
		}else if (tipo.equals("Socio")) {
			System.out.println("Total: "+ socio+"€");
		}else if(tipo.equals("Normal")) {
		System.out.println("Total: "+ importe+"€");
		}else {
		System.out.println("Tipo incorrecto");
	}
		entrada.close();
	   
	}
}


