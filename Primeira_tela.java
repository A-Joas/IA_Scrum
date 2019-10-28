package view;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JEditorPane;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class Primeira_tela extends JFrame {

	private JPanel Painel;
	private JTextField txtDigiteSeuNome;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primeira_tela frame = new Primeira_tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Criar a janela
	 */
	public Primeira_tela() {
		setResizable(false);
		
		
		setTitle("Jogo Med Educ");
		setBackground(SystemColor.window);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 535);
		Painel = new JPanel();
		Painel.setBackground(SystemColor.menu);
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		Painel.setLayout(null);
		
		
		
		
		txtDigiteSeuNome = new JTextField();
		txtDigiteSeuNome.setHorizontalAlignment(SwingConstants.LEFT);
		txtDigiteSeuNome.setBounds(151, 459, 240, 20);
		txtDigiteSeuNome.setToolTipText("");
		Painel.add(txtDigiteSeuNome);
		txtDigiteSeuNome.setColumns(10);
		
		JButton btnNewButton = new JButton("VAI!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtDigiteSeuNome.getText().length() == 0)
					JOptionPane.showMessageDialog(null, "Nome invalido, Tente outro!");
				else
					JOptionPane.showConfirmDialog(null, "Voc� est� prestes a entrar no jogo com o nome de '"+txtDigiteSeuNome.getText()+"' Confirmar?","Seu nome no jogo", JOptionPane.YES_NO_OPTION);
					
			}
		});
		btnNewButton.setBounds(392, 456, 69, 27);
		Painel.add(btnNewButton);
		JLabel lblBemVindoAo = new JLabel("Bem vindo ao MedEduc");
		lblBemVindoAo.setBounds(76, 11, 452, 90);
		lblBemVindoAo.setFont(new Font("Tahoma", Font.PLAIN, 39));
		Painel.add(lblBemVindoAo);
		
		JButton btnTutorial = new JButton("Tutorial");
		btnTutorial.setBounds(224, 484, 89, 23);
		Painel.add(btnTutorial);
		
		
		JLabel lblDigiteAquiSeu = new JLabel("Digite aqui seu nome para come\u00E7ar");
		lblDigiteAquiSeu.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteAquiSeu.setBounds(151, 434, 240, 32);
		lblDigiteAquiSeu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Painel.add(lblDigiteAquiSeu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\InterfaceJogoIA\\src\\view\\fundo.jpg"));
		lblNewLabel.setBounds(0, 0, 548, 496);
		Painel.add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
