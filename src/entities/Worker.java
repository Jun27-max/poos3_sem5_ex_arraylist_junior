package entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	
	private String name;
	private String cpf;
	private int age;

	private Departament departament;
	
	private List<Worker> workers = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, String cpf, int age, Departament departament) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//
	public String getCpf() {
		return cpf;
	}

	public int getAge() {
		return age;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	
	public void addWorker(Worker worker) {
		workers.add(worker);
	}

	public void removeContract(String worker) {
		String personal = worker;
		if(personal.equals(cpf)) {
		workers.remove(personal);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\n");
		sb.append(" Nome: ");
		sb.append(name);
		sb.append(" - ");
		sb.append(" CPF: ");
		sb.append(cpf);
		sb.append(" - ");
		sb.append(" Idade: ");
		sb.append(age);
		sb.append(" - ");
		sb.append("Departamento: ");
		sb.append(departament.getNameDepartament());
		sb.append(" - ");
		sb.append("Ramal: ");
		sb.append(departament.getRamal() + "\n");
		
		

		return sb.toString();
	}

}
