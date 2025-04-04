package automacao.industrial.factory;

import automacao.industrial.model.Maquinas;
import automacao.industrial.model.Metalurgia;
import automacao.industrial.model.Sensores;

public class MetalurgiaFactory implements SetorFactory {
	
	public Maquinas maquinaEscolhida() {
		return new Metalurgia();
	}
	
	public Sensores sensoresEscolhida() {
		return new Metalurgia();
	}

}