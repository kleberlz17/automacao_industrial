package automacao.industrial.factory;

import automacao.industrial.model.Maquinas;
import automacao.industrial.model.Sensores;
import automacao.industrial.model.Textil;

public class TextilFactory implements SetorFactory {

	public Maquinas maquinaEscolhida() {
		return new Textil();
	}

	public Sensores sensoresEscolhida() {
		return new Textil();
	}

}