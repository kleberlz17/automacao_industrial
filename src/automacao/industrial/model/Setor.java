package automacao.industrial.model;

public enum Setor {
	METALURGIA(1), TEXTIL(2), ALIMENTICIO(3);

	private final int codigo;

	// Metodo para converter números em enum;

	Setor(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public static Setor fromCodigo(int codigo) {
		
		// for percorre o array(values) pra ver se algum setor tem o código digitado 1, 2, 3.
		for (Setor setor : values()) {
			if (setor.codigo == codigo) {
				return setor;
			}
		}
		return null;

	}
}