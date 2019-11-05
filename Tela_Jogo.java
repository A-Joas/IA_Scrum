package view;

import java.awt.BorderLayout;
import java.util.TimerTask;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Tela_Jogo extends JFrame {
	public void Tela_Jogo(String nome) {
		
	}
	private JPanel Painel1;

	public int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
				try {
					Tela_Jogo frame = new Tela_Jogo(" ");
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Tela_Jogo(String nome) {
		Inicio inicio = new Inicio();
		String msg[]= new String[6];
		
		
		
		Primeira_tela primeiratela = new Primeira_tela();
		Tela_nivelamento telaniv = new Tela_nivelamento(nome);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 434);
		Painel1 = new JPanel();
		Painel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel1);
		Painel1.setLayout(null);
		Painel1.setFocusable(true);
		Painel1.setBounds(100, 100, 626, 434);
		
		
		
		Button sair = new Button("Voltar ao Menu Principal");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela_nivelamento inicio = new Tela_nivelamento(nome);
				inicio.setVisible(true);
				dispose();
			}
		});
		sair.setBounds(10, 0, 169, 22);
		Painel1.add(sair);
		
		JTextPane txtpn1 = new JTextPane();
		txtpn1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpn1.setEditable(false);
		msg[0]=" Olá, você deve ser o(a) Doutor(Doutora): " +nome.toUpperCase()+", Que tal aprender medicina jogando?";
		msg[1]=" A Cada nivel concluido, você irá receber um equipamento médico para seu escritorio.";
		msg[2]=" Lembrando que, o Jogo só vai acabar quando o consultorio estiver completo";
		msg[3]="Então VAMOS MONTAR O CONSULTORIO E APRENDER MEDICINA!!!";
		msg[4]="Para começar, Vamos realizar um nivelamento para sabermos se voce está por dentro da area medica";
		msg[5]="É só clicar no botao de nivelamento ou entao apertar a tecla ENTER";
		JButton btnNewButton = new JButton("Nivelamento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				telaniv.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(202, 184, 124, 22);
		btnNewButton.setVisible(false);
		Painel1.add(btnNewButton);
		
		JButton btnReforo = new JButton("Refor\u00E7o");
		btnReforo.setEnabled(false);
		btnReforo.setForeground(SystemColor.textHighlight);
		btnReforo.setBounds(202, 205, 124, 22);
		btnReforo.setVisible(false);
		Painel1.add(btnReforo);
		
		JButton btnNivel_1 = new JButton("Nivel 1");
		btnNivel_1.setForeground(SystemColor.textHighlight);
		btnNivel_1.setEnabled(false);
		btnNivel_1.setVisible(false);
		btnNivel_1.setBounds(202, 227, 124, 22);
		Painel1.add(btnNivel_1);
		
		JButton btnNivel_2 = new JButton("Nivel 2\r\n");
		btnNivel_2.setForeground(SystemColor.textHighlight);
		btnNivel_2.setEnabled(false);
		btnNivel_2.setVisible(false);
		btnNivel_2.setBounds(202, 246, 124, 22);
		Painel1.add(btnNivel_2);
		
		JButton btnNivel_3 = new JButton("Nivel 3\r\n\r\n");
		btnNivel_3.setForeground(SystemColor.textHighlight);
		btnNivel_3.setEnabled(false);
		btnNivel_3.setBounds(202, 267, 124, 22);
		btnNivel_3.setVisible(false);
		Painel1.add(btnNivel_3);
		
		JButton btnNivel_4 = new JButton("Nivel 4\r\n\r\n");
		btnNivel_4.setForeground(SystemColor.textHighlight);
		btnNivel_4.setEnabled(false);
		btnNivel_4.setBounds(202, 286, 124, 22);
		btnNivel_4.setVisible(false);
		Painel1.add(btnNivel_4);
		
		JButton btnNivel_5 = new JButton("Nivel 5");
		btnNivel_5.setEnabled(false);
		btnNivel_5.setForeground(SystemColor.textHighlight);
		btnNivel_5.setBounds(202, 307, 124, 22);
		Painel1.add(btnNivel_5);
		btnNivel_5.setVisible(false);
		txtpn1.setText(msg[0]);
		txtpn1.setBounds(398, 31, 124, 101);
		Painel1.add(txtpn1);
		
		JLabel lblAperteATecla = new JLabel("Aperte a Tecla Enter ou Seta direita para continuar");
		lblAperteATecla.setFont(new Font("Tahoma", Font.PLAIN, 21));
		Timer tempo = new Timer();
		tempo.schedule(new TimerTask() {
			
			public void run() {
				Painel1.addKeyListener(new KeyAdapter() {
					
					public void keyPressed(KeyEvent evt) {
						if ((evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_RIGHT)) {
								lblAperteATecla.setVisible(false);
							}
						else 
							lblAperteATecla.setVisible(true);
						}
							
					
				});
				lblAperteATecla.setVisible(true);
				
			}
		},4000);
		lblAperteATecla.setVisible(false);
		lblAperteATecla.setBounds(10, 372, 577, 34);
		Painel1.add(lblAperteATecla);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\fundo2.jpg"));
		lblNewLabel.setBounds(0, 0, 620, 406);
		Painel1.add(lblNewLabel);
		
		Painel1.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent evt) {
				if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_RIGHT) {
						i=i+1;
						if (i > 4) {
							btnReforo.setVisible(true);
							btnNewButton.setVisible(true);
							btnNivel_1.setVisible(true);
							btnNivel_2.setVisible(true);
							btnNivel_3.setVisible(true);
							btnNivel_4.setVisible(true);
							btnNivel_5.setVisible(true);
						}
						txtpn1.setText(msg[i]);
						lblAperteATecla.setVisible(false);
					}
				}
					
			
		});

		
		
			
		}
		
	}


