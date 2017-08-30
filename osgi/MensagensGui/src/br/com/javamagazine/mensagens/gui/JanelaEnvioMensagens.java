package br.com.javamagazine.mensagens.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.com.javamagazine.mensagens.core.CanalEnvioMensagens;
import br.com.javamagazine.mensagens.email.CanalEmail;
import br.com.javamagazine.mensagens.sms.CanalSms;
import br.com.javamagazine.mensagens.twitter.CanalTwitter;

public class JanelaEnvioMensagens extends JFrame {

	private static final long serialVersionUID = 7675429484825689576L;

	private List<CanalEnvioMensagens> canais = new ArrayList<CanalEnvioMensagens>();
	
	private JTextField mensagem;
	private JButton enviar;
	private JPanel panelCanaisDisponiveis;
	
	private JButton cancelar;
	private JLabel labelMensagem;
	private JLabel labelCanais;
	
	public JanelaEnvioMensagens() {
		setSize(350, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Spring Dynamic Modules");
		
		setLayout(null);

		labelMensagem = new JLabel("Mensagem: ");
		labelMensagem.setBounds(10, 10, 90, 25);
		
		mensagem = new JTextField();
		mensagem.setBounds(95, 10, 230, 25);
		
		labelCanais = new JLabel("Enviar por: ");
		labelCanais.setBounds(10, 40, 90, 25);
		
		panelCanaisDisponiveis = new JPanel();
		panelCanaisDisponiveis.setLayout(new FlowLayout(FlowLayout.LEADING));
		panelCanaisDisponiveis.setBounds(95, 40, 230, 25);
		
		enviar = new JButton("Enviar");
		enviar.setBounds(65, 75, 100, 30);
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder resultado = new StringBuilder();
				for (CanalEnvioMensagens canal : canais) {
					resultado.append(canal.enviar(mensagem.getText()) + "\n");					
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(175, 75, 100, 30);
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		add(labelMensagem);
		add(mensagem);
		add(labelCanais);
		add(panelCanaisDisponiveis);
		add(enviar);
		add(cancelar);
		
		setVisible(true);
	}
	
	public void adicionarCanal(CanalEnvioMensagens canal, Map<?, ?> properties) {
		canais.add(canal);
		update();
	}
	
	public void removerCanal(CanalEnvioMensagens canal, Map<?, ?> properties) {
		canais.remove(canal);
		update();
	}

	
	public void update() {
		panelCanaisDisponiveis.removeAll();

		for (final CanalEnvioMensagens canal : canais) {
			final JCheckBox chk = new JCheckBox(canal.getNome());
			chk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					canal.setAtivo(chk.isSelected());
				}
			});
			panelCanaisDisponiveis.add(chk);
		}

		panelCanaisDisponiveis.revalidate();
		panelCanaisDisponiveis.repaint();
	}
	
	public static void main(String[] args) {
		JanelaEnvioMensagens j = new JanelaEnvioMensagens();
		j.adicionarCanal(new CanalEmail(), null);
		j.adicionarCanal(new CanalSms(), null);
		j.adicionarCanal(new CanalTwitter(), null);
	}

}
