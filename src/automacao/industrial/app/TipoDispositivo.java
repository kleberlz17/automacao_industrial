package automacao.industrial.app;

import automacao.industrial.factory.SetorFactory;
import automacao.industrial.model.Maquinas;
import automacao.industrial.model.Sensores;

public class TipoDispositivo {

	private SetorFactory setor;

	public TipoDispositivo(SetorFactory setor) {
		this.setor = setor;
	}

	public void praMaquinas() {
		Maquinas maquinas = setor.maquinaEscolhida();
		maquinas.operar();
	}

	public void praSensores() {
		Sensores sensores = setor.sensoresEscolhida();
		sensores.lerDados();
	}

}