import javax.swing.*;

public class pa3 {

	public static void main(String[] args) {
		
		int n;
		String ho = "";
		boolean error;
		
		do {
			try {
				n = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o número sorteado?"));
				
				error = false;
				
				if (n <= 0) {
					error = true;
					JOptionPane.showMessageDialog(null, "Número invalido!");
				}
				
				for (int i = 0; i < n; i++) {
					
					if (i == (n - 1)) {
						ho += "Ho!";
					} else {
						ho += "Ho ";
					}
				}
			} catch (Exception e) {
				if(e.getMessage().equals("null")) {
					System.exit(1);
				} else if(e.getMessage().equals("For input string: \"\"")) {
					JOptionPane.showMessageDialog(null, "Campo Obrigatório!");
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números!");
				}
				error = true;
			}
		} while (error);
		
		JOptionPane.showMessageDialog(null, ho);
	}

}
