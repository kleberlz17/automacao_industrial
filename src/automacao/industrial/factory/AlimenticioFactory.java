package automacao.industrial.factory;

import automacao.industrial.model.Alimenticio;
import automacao.industrial.model.Maquinas;

import automacao.industrial.model.Sensores;

public class AlimenticioFactory implements SetorFactory {

	public Maquinas maquinaEscolhida() {
		return new Alimenticio();
	}

	public Sensores sensoresEscolhida() {
		return new Alimenticio();
	}

}