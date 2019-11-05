package view;

import java.awt.BorderLayout;
import java.io.*;
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.List;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.Component;

import javax.sound.sampled.AudioInputStream;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import sun.audio.*;
public class Tela_nivelamento extends JFrame {
	public void Tela_Nivelamento(String nome) {
		
	}
	private JPanel Painel1;
	int i=0;
	Random random = new Random();
	int pergunta1;
	int pergunta2;
	
	boolean proximo=true;
	boolean blockpergunta=false;
	public ArrayList<String> questao = new ArrayList();
	String msg[]= new String[15];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_nivelamento frame = new Tela_nivelamento(" ");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Soundacerto() {
		InputStream in;
		try {
		in=new FileInputStream(new File ("C:\\Users\\user\\Desktop\\correto.wav"));
		AudioStream audios = new AudioStream(in);
		AudioPlayer.player.start(audios);
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		
	}
	
	public void Sounderro() {
		InputStream in;
		try {
		in=new FileInputStream(new File ("C:\\Users\\user\\Desktop\\errado.wav"));
		AudioStream audios = new AudioStream(in);
		AudioPlayer.player.start(audios);
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		
	}
	public Tela_nivelamento(String nome) {
		Banco_de_perguntas banco =  new Banco_de_perguntas();
		setResizable(false);
		
		setTitle("Jogo Mec Educ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 434);;
		Painel1 = new JPanel();
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(365, 21, 150, 115);
		Painel1.add(textPane);
		Painel1.setFocusable(true);
		msg[0]="Seja bem vindo: "+nome.toUpperCase()+" ao teste de nivelamento, onde iremos avaliar seu conhecimento. Se voce for fera irá conseguir pular alguns niveis";
		msg[1]="Para responder as perguntas, Lembre-se de pressionar no teclado 'A', 'B' ou 'C'. Preparado?";
		msg[2]="Iremos começar com 10 perguntas. Por se tratar de um jogo educativo, voce vera aqui do lado seu historico na barra de progresso ";
		textPane.setText(msg[i]);
		
		
		Painel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel1);
		Painel1.setLayout(null);
		
		Label label_3 = new Label("");
		label_3.setBackground(Color.BLUE);
		label_3.setBounds(10, 329, 50, 6);
		label_3.setVisible(false);
		
		pergunta1 = random.nextInt(10);
		pergunta2 = random.nextInt(10);
		if (pergunta1==pergunta2){
			pergunta2=0;
			pergunta1=9;}
		
		JButton btnB = new JButton("B - ");
		btnB.setHorizontalAlignment(SwingConstants.LEFT);
		btnB.setBackground(new Color(255, 255, 153));
		btnB.setBounds(95, 331, 369, 28);
		btnB.setVisible(false);
		Painel1.add(btnB);
		
		JButton btnC = new JButton("C - ");
		btnC.setHorizontalAlignment(SwingConstants.LEFT);
		btnC.setBackground(new Color(255, 255, 153));
		btnC.setBounds(95, 353, 369, 28);
		btnC.setVisible(false);
		Painel1.add(btnC);
		Painel1.add(label_3);
		
		Label label_2 = new Label("");
		label_2.setBackground(Color.BLUE);
		label_2.setBounds(10, 341, 50, 6);
		label_2.setVisible(false);
		Painel1.add(label_2);
		
		Label label_1 = new Label("");
		label_1.setBackground(Color.BLUE);
		label_1.setBounds(10, 353, 50, 6);
		label_1.setVisible(false);
		Painel1.add(label_1);
		
		Label label_0 = new Label("");
		label_0.setBackground(Color.BLUE);
		label_0.setBounds(10, 365, 50, 6);
		label_0.setVisible(false);
		Painel1.add(label_0);
		
		Label label_4 = new Label("");
		label_4.setBackground(Color.BLUE);
		label_4.setBounds(10, 317, 50, 6);
		label_4.setVisible(false);
		Painel1.add(label_4);
		
		Label label_5 = new Label("");
		label_5.setBackground(Color.BLUE);
		label_5.setBounds(10, 305, 50, 6);
		label_5.setVisible(false);
		Painel1.add(label_5);
		
		Label label_6 = new Label("");
		label_6.setBackground(Color.BLUE);
		label_6.setBounds(10, 293, 50, 6);
		label_6.setVisible(false);
		Painel1.add(label_6);
		
		Label label_7 = new Label("");
		label_7.setBackground(Color.BLUE);
		label_7.setBounds(10, 281, 50, 6);
		label_7.setVisible(false);
		Painel1.add(label_7);
		
		Label label_8 = new Label("");
		label_8.setBackground(Color.BLUE);
		label_8.setBounds(10, 269, 50, 6);
		label_8.setVisible(false);
		Painel1.add(label_8);
		
		Label label_9 = new Label("");
		label_9.setBackground(Color.BLUE);
		label_9.setBounds(10, 257, 50, 6);
		label_9.setVisible(false);
		Painel1.add(label_9);
		
		JButton btnA = new JButton("A - ");
		btnA.setBackground(new Color(255, 255, 153));
		btnA.setHorizontalAlignment(SwingConstants.LEFT);
		btnA.setBounds(95, 305, 369, 28);
		btnA.setVisible(false);
		Painel1.add(btnA);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botaoA_2) {
				
				
			}
		});
		
		Label bardeprog = new Label("PROGRESSO\r\n\r\n");
		bardeprog.setAlignment(Label.CENTER);
		bardeprog.setBounds(0, 232, 110, 22);
		bardeprog.setVisible(false);
		Painel1.add(bardeprog);
		
		
		Painel1.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent evt) {
				if ((evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_RIGHT)) {
					if (proximo==true && blockpergunta==false) {
					i=i+1;
					}
					textPane.setText(msg[i]);}
				if (i ==2) {
						bardeprog.setVisible(true);
						label_9.setVisible(true);
						label_8.setVisible(true);
						label_7.setVisible(true);
						label_6.setVisible(true);
						label_5.setVisible(true);
						label_4.setVisible(true);
						label_3.setVisible(true);
						label_2.setVisible(true);
						label_1.setVisible(true);
						label_0.setVisible(true);
						
						
					}
			
					if (i == 3) {
						//proximo=false;
						blockpergunta=true;
						btnA.setVisible(true);
						btnB.setVisible(true);
						btnC.setVisible(true);
						
						questao = banco.perguntanv1(pergunta1);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
					
						if (evt.getKeyCode() == KeyEvent.VK_A)  {
							conferiracerto(1,"A", textPane,label_0,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(1,"B", textPane,label_0,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(1,"C", textPane,label_0,btnA,btnB,btnC);
							blockpergunta=false;
							
							}
					}
					Painel1.setFocusable(true);
				
					if (i==4) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv1(pergunta2);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
					
						
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(1,"A", textPane,label_1,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(1,"B", textPane,label_1,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(1,"C", textPane,label_1,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
					
					if (i==5) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv2(pergunta1);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
					
						
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(2,"A", textPane,label_2,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(2,"B", textPane,label_2,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(2,"C", textPane,label_2,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
					if (i==6) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv2(pergunta2);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
						
					
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(2,"A", textPane,label_3,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(2,"B", textPane,label_3,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(1,"C", textPane,label_3,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
					
					if (i==7) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv3(pergunta1);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
						
					
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(3,"A", textPane,label_4,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(3,"B", textPane,label_4,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(3,"C", textPane,label_4,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
					if (i==8) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv3(pergunta2);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
						
					
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(3,"A", textPane,label_5,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(3,"B", textPane,label_5,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(3,"C", textPane,label_5,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
					if (i==9) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv4(pergunta1);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
						
					
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(4,"A", textPane,label_6,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(4,"B", textPane,label_6,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(4,"C", textPane,label_6,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
					if (i==10) {
						blockpergunta=true;
						btnA.setBackground(new Color(255, 255, 153));
						btnB.setBackground(new Color(255, 255, 153));
						btnC.setBackground(new Color(255, 255, 153));
						questao = banco.perguntanv4(pergunta2);
						textPane.setText(questao.get(0));
						btnA.setText("A- "+ questao.get(1));
						btnB.setText("B- "+ questao.get(2));
						btnC.setText("C- "+ questao.get(3));
						
					
						if (evt.getKeyCode() == KeyEvent.VK_A) {
							conferiracerto(4,"A", textPane,label_7,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_B) {
							conferiracerto(4,"B", textPane,label_7,btnA,btnB,btnC);
							blockpergunta=false;
							}
						if (evt.getKeyCode() == KeyEvent.VK_C) {
							conferiracerto(4,"C", textPane,label_7,btnA,btnB,btnC);
							blockpergunta=false;
							}
					}
								
								
						
						
			}}
		
			);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\fundo_nivel.jpg"));
		lblNewLabel.setBounds(0, 0, 610, 396);
		Painel1.add(lblNewLabel);
	}
	
	public void conferiracerto(int nivel,String resposta, JTextPane textPane, Label label_1,JButton bta,JButton btb,JButton btc) {
		if (resposta==questao.get(4)) {
			textPane.setText("Parabéns, " + questao.get(5));
			label_1.setBackground(Color.GREEN);
			Soundacerto();
		}
		else {
			textPane.setText("Não, "+ questao.get(5));
			label_1.setBackground(Color.RED);
			Sounderro();
		}
		
		if(questao.get(4)=="A") {
			bta.setBackground(Color.GREEN);
			btb.setBackground(Color.RED);
			btc.setBackground(Color.RED);
			
		}
		if(questao.get(4)=="B") {
			bta.setBackground(Color.RED);
			btb.setBackground(Color.GREEN);
			btc.setBackground(Color.RED);
			
			
		}
		if (questao.get(4)=="C") {
		bta.setBackground(Color.RED);
		btb.setBackground(Color.RED);
		btc.setBackground(Color.GREEN);
		}
		
		
		
	}
}


