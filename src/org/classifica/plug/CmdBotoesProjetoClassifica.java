package org.classifica.plug;

import org.guga.contagil.acoes.geral.AcaoSair;
import org.guga.contagil.projeto.comandos.ComandoBotao;
import org.guga.contagil.projeto.comandos.RelacaoBotoes;

public class CmdBotoesProjetoClassifica implements RelacaoBotoes {

	/**
	 * Retorna a rela��o de defini��es de bot�es na forma de um array
	 */
	public ComandoBotao[] getBotoes() {
		/**
		 * Define os bot�es que devem aparecer na janela principal
		 */
		final ComandoBotao[] botoes = { 
			new ComandoBotao(AcaoMostraClassificaForm.class), 
			new ComandoBotao(AcaoSair.class), 
		};

		return botoes;
	}

}
