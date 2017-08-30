package dicionariogui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import dicionariocore.Tradutor;

public class DicionarioFrame extends JFrame {

	private BundleContext ctx;
	
	public DicionarioFrame(BundleContext ctx) {
		this.ctx = ctx;
		
		setSize(300, 100);
		setTitle("Dicion‡rio");
		getContentPane().setLayout(new GridLayout(2, 1));
		
		final JTextField txtATraduzir = new JTextField();
		getContentPane().add(txtATraduzir);
		
		JButton btnTraduzir = new JButton("Traduzir");
		btnTraduzir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoATraduzir = txtATraduzir.getText();
				String textoTraduzido = getTradutor().traduzir(textoATraduzir);
				JOptionPane.showMessageDialog(null, textoTraduzido);
			}
		});
		getContentPane().add(btnTraduzir);
	}
	
	private Tradutor getTradutor() {
		ServiceReference ref = ctx.getServiceReference(Tradutor.class.getName());
		return (Tradutor) ctx.getService(ref);
	}
	
	
}
