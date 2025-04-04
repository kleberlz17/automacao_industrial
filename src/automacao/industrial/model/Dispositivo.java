package automacao.industrial.model;

public enum Dispositivo {
	MAQUINA(1), SENSOR(2);

	private final int codigo;

	// Metodo para converter números em enum.

	Dispositivo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public static Dispositivo fromCodigo(int codigo) {
		// for percorre o array(values) pra ver se algum dispositivo tem o código digitado 1, 2.
		for (Dispositivo dispositivo : values()) {
			if (dispositivo.codigo == codigo) {
				return dispositivo;
			}

		}

		return null;
	}
}