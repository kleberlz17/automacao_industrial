package automacao.industrial.app;

import java.util.Scanner;
import automacao.industrial.factory.AlimenticioFactory;
import automacao.industrial.factory.MetalurgiaFactory;
import automacao.industrial.factory.SetorFactory;
import automacao.industrial.factory.TextilFactory;
import automacao.industrial.model.Dispositivo;
import automacao.industrial.model.Setor;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("## Escolha entre:  1)Máquina ou 2)Sensor");
		int codigoDispositivo = scanner.nextInt();

		Dispositivo dispositivoEscolhido = Dispositivo.fromCodigo(codigoDispositivo);
		if (dispositivoEscolhido == null) {
			System.out.println("Opção inválida. Tente novamente.");
			scanner.close();
			return;
		}

		System.out.println("## Selecione o setor: 1)Metalurgia, 2)Têxtil, 3)Alimentício");
		int codigoSetor = scanner.nextInt();

		Setor setorEscolhido = Setor.fromCodigo(codigoSetor);
		if (setorEscolhido == null) {
			System.out.println("Setor inválido. Tente novamente.");
			scanner.close();
			return;
		}

		SetorFactory factory;
		switch (setorEscolhido) {
		case METALURGIA -> factory = new MetalurgiaFactory();
		case TEXTIL -> factory = new TextilFactory();
		case ALIMENTICIO -> factory = new AlimenticioFactory();
		default -> throw new IllegalStateException("Erro inesperado");
		}

		TipoDispositivo setor = new TipoDispositivo(factory);

		switch (dispositivoEscolhido) {
		case MAQUINA -> setor.praMaquinas();
		case SENSOR -> setor.praSensores();
		default -> System.out.println("Opção inválida.");
		}

		scanner.close();

	}
}