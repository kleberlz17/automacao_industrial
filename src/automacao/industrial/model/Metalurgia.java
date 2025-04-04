package automacao.industrial.model;

public class Metalurgia implements Maquinas, Sensores {

	public void operar() {
		System.out.println("Máquina de Fundição");
	}
	
	public void lerDados() {
		System.out.println("Sensor de Temperatura");
	}
}