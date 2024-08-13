package menu;

import javax.swing.JOptionPane;

import controller.recursividadeController;

/*
 * 1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
multiplicação de A por B.
 */
public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recursividadeController recursiva = new recursividadeController();
		
		JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + recursiva.recSoma(0, 5));
	}

}
