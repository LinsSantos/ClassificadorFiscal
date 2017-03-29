package org.classifica.plug;

import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import org.classifica.gui.ClassificaForm;
import org.guga.contagil.acoes.AcaoAbstract;
import org.guga.contagil.acoes.OpenDocumentsManager;

import gov.rfb.contagil.commons.utils.GuiUtils;

public class AcaoMostraClassificaForm  extends AcaoAbstract {

	public static final String cmd = "Mostrar Janela de Ajuda em Classifica��o";

	public static final String btn = "Janela de Ajuda em Classifica��o";

	/**
	 * Construtor sem par�metros.
	 */
	public AcaoMostraClassificaForm() {
		super(cmd, btn);
	}

	/**
	 * Construtor com indica��o de um ID interno.
	 */
	public AcaoMostraClassificaForm(String nomeInterno) {
		super(cmd, btn, nomeInterno);
	}

	/**
	 * Esta � a fun��o que � executada quando o usu�rio deseja executar esta a��o.
	 */
	public void run(Window wnd, OpenDocumentsManager man, ActionEvent event) {
		
		if (!GuiUtils.showWindow(ClassificaForm.class)) {
			ClassificaForm frame = new ClassificaForm();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		
	}
}
