package automacao.industrial.app;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import automacao.industrial.factory.AlimenticioFactory;
import automacao.industrial.factory.MetalurgiaFactory;
import automacao.industrial.factory.SetorFactory;
import automacao.industrial.factory.TextilFactory;
import automacao.industrial.model.Dispositivo;
import automacao.industrial.model.Setor;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		logger.info("Sistema iniciado");

		try (Scanner scanner = new Scanner(System.in)) {
			logger.info("Aguardando entrada do usuário para tipo de dispositivo: 1) Máquina, 2)Sensor");
			int codigoDispositivo = scanner.nextInt();

			Dispositivo dispositivoEscolhido = Dispositivo.fromCodigo(codigoDispositivo);
			if (dispositivoEscolhido == null) {
				logger.warn("Dispositivo inválido: {}", codigoDispositivo);
				System.out.println("Opção inválida. Tente novamente.");
				return;
			}

			logger.info("Aguardando entrada do setor: 1)Metalurgia, 2)Textil, 3)Alimenticio");
			int codigoSetor = scanner.nextInt();

			Setor setorEscolhido = Setor.fromCodigo(codigoSetor);
			if (setorEscolhido == null) {
				logger.warn("Setor inválido: {}", codigoSetor);
				System.out.println("Setor inválido. Tente novamente.");
				return;
			}

			SetorFactory factory = switch (setorEscolhido) {
			case METALURGIA -> new MetalurgiaFactory();
			case TEXTIL -> new TextilFactory();
			case ALIMENTICIO -> new AlimenticioFactory();
			default -> throw new IllegalStateException("Erro inesperado");
			};

			TipoDispositivo setor = new TipoDispositivo(factory);
			switch (dispositivoEscolhido) {
			case MAQUINA -> setor.praMaquinas();
			case SENSOR -> setor.praSensores();
			default -> logger.error("Dispositivo inválido no switch.");
			}

		} catch (Exception e) {
			logger.error("Erro no sistema: ", e);
		}

		logger.info("Sistema finalizado");
	}
}