package br.com.javamagazine.mensagens.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.javamagazine.mensagens.core.CanalEnvioMensagens;
import br.com.javamagazine.mensagens.email.CanalEmail;
import br.com.javamagazine.mensagens.sms.CanalSms;
import br.com.javamagazine.mensagens.twitter.CanalTwitter;

public class JanelaSimples extends JFrame {

	private List<CanalEnvioMensagens> canais = new ArrayList<CanalEnvioMensagens>();
	private JTextField mensagem;
	private JButton enviar;

	public JanelaSimples() {
		canais.add(new CanalEmail());
		canais.add(new CanalSms());
		canais.add(new CanalTwitter());
		
		setTitle("Spring Dynamic Modules");
		setSize(350, 100);
		setLayout(new GridLayout(2, 1));

		mensagem = new JTextField();
		add(mensagem);

		enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder resultado = new StringBuilder();
				for (CanalEnvioMensagens canal : canais) {
					resultado.append(canal.enviar(mensagem.getText()) + "\n");
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		add(enviar);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JanelaSimples().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
