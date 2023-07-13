package br.com.projetoJava;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Layouts extends JFrame {
	
	public Layouts() {
		super("Meu Layout");
		
		Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton("BOTÃO NORTE"));
		c.add(BorderLayout.SOUTH, new JButton("BOTÂO SUL"));
		c.add(BorderLayout.CENTER, new JButton("BOTÂO CENTRO"));
		c.add(BorderLayout.EAST, new JButton("BOTÂO LESTE"));
		c.add(BorderLayout.WEST, new JButton("BOTÂO OESTE"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
