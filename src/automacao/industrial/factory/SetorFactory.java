package automacao.industrial.factory;

import automacao.industrial.model.Maquinas;
import automacao.industrial.model.Sensores;

public interface SetorFactory {

	Maquinas maquinaEscolhida();
	Sensores sensoresEscolhida();
}