package senai;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		String menu = "Escolha uma opção abaixo:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Potência\n0 - Sair";
		int operacao = -1;

		while (operacao != 0) {
			operacao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if( operacao > 5) {
				JOptionPane.showMessageDialog(null, "Numero inválido");
			}
			else if (operacao != 0) {
				double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
				double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
				switch (operacao) {
				case 1:
					JOptionPane.showMessageDialog(null, numero1 + numero2);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, numero1 - numero2);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, numero1 * numero2);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, numero1 / numero2);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, Math.pow(numero1, numero2));
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Sair");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Numero inválido");
					break;
				}
			}
		}
	}
}
