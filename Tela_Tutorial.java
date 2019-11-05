package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Tutorial extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Tutorial frame = new Tela_Tutorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela_Tutorial() {
		setTitle("Tutorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 554, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("Ok!");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});
		btnOk.setBounds(230, 463, 89, 23);
		contentPane.add(btnOk);
		
		JTextPane txtpnAquiNsFalaremos = new JTextPane();
		txtpnAquiNsFalaremos.setBackground(SystemColor.menu);
		txtpnAquiNsFalaremos.setText("Aqui n\u00F3s falaremos desse jogo e explicaremos tudo\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nEsse jogo foi desenvolvido pela turma de inteligencia artificial da Universidade do Estado do Rio de janeiro, para apresenta\u00E7\u00E3o no dia 28/11/2019\r\n\r\n\r\n\r\n\r\n\r\nPelos integrantes : \r\n\r\n- Abner\r\n- Eduardo\r\n- Luana\r\n- Luiza\r\n\r\nTodos os direitos reservados\r\n");
		txtpnAquiNsFalaremos.setBounds(10, 11, 518, 424);
		contentPane.add(txtpnAquiNsFalaremos);
	}
}