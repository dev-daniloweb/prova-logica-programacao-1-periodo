import javax.swing.*;

public class pa2 {

	public static void main(String[] args) {
		
		int senha = 2019;
		int senhaDigitada;
		boolean senhaValida;
		
		do {
			try {
				
				senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));
				
				if(senhaDigitada == senha) {
					JOptionPane.showMessageDialog(null, "Acesso Permitido!");
					senhaValida = true;
				} else {
					JOptionPane.showMessageDialog(null, "Senha Invalida!");
					senhaValida = false;
				}
				
			} catch (Exception e) {
				if(e.getMessage().equals("null")) {
					System.exit(1);
				} else if(e.getMessage().equals("For input string: \"\"")) {
					JOptionPane.showMessageDialog(null, "Senha Obrigatória!");
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números!");
				}
				senhaValida = false;
			}
			
		} while (!senhaValida);
		
	}

}
