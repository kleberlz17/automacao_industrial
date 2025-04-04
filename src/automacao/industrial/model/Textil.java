package automacao.industrial.model;

public class Textil implements Maquinas, Sensores {

	public void operar() {
		System.out.println("Tear Automatizado");
	}
	
	public void lerDados() {
		System.out.println("Sensor de Umidade");
	}
}