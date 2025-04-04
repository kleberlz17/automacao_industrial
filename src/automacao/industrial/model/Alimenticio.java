package automacao.industrial.model;

public class Alimenticio implements Maquinas, Sensores {

	public void operar() {
		System.out.println("Embaladora Automática");
	}
	
	public void lerDados() {
		System.out.println("Sensor de Qualidade");
	}
}