package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Worker worker = new Worker();
		System.out.print("How many workers do you want register? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("idade: ");
            int idade = sc.nextInt();
            System.out.print("Departamento: ");
            sc.nextLine();
            String departamento = sc.nextLine();
            System.out.print("Ramal: ");
            int ramal = sc.nextInt();
            sc.nextLine();
            worker.addWorker(new Worker(nome, cpf, idade, new Departament(departamento, ramal)));;
		}
		
		System.out.println(worker);
		
		
		
		
		
		sc.close();
		
		
	}

}
