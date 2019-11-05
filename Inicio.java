package view;

import java.awt.BorderLayout;
import java.util.*;

import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class Inicio extends JFrame {
	
	private JLayeredPane contentPane;
	
	
	private final Canvas canvas = new Canvas();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setTitle("BEM VINDO AO MECEDUC");
		setBackground(Color.WHITE);
		
		Primeira_tela novojogo = new Primeira_tela();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 535);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Novo Jogo\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				novojogo.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(110, 448, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCarregarJogo = new JButton("Carregar Jogo");
		btnCarregarJogo.setBounds(308, 448, 122, 23);
		contentPane.add(btnCarregarJogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\esampaio\\Documents\\inicio.PNG"));
		lblNewLabel.setBounds(23, 0, 538, 486);
		contentPane.add(lblNewLabel);
	}
	
}