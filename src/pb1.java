import javax.swing.*;

public class pb1 {

	public static void main(String[] args) {
		
		int n = 0;
		int quant[] = {0, 0, 0};
		String option[] = {"Alcool", "Gasolina", "Diesel"};
		String msg = "MUITO OBRIGADO";
		boolean error = false;
		
		do {
			try {
				while (n != 4) {
					n = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o:\n1: " + option[0] + "\n2: " + option[1] + "\n3: " + option[2] + "\n4: Fim"));
					
					if (n < 1 || n > 4) {
						error = true;
						JOptionPane.showMessageDialog(null, "Op��o invalida!");
					} else {
						error = false;
						switch (n) {
							case 1:
								quant[n-1]++;
								break;
							case 2:
								quant[n-1]++;
								break;
							case 3:
								quant[n-1]++;
								break;
							default:
								break;
						}						
					}
				}				
			} catch (Exception e) {
				if(e.getMessage().equals("null")) {
					System.exit(1);
				} else if(e.getMessage().equals("For input string: \"\"")) {
					JOptionPane.showMessageDialog(null, "Campo Obrigat�rio!");
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas n�meros!");
				}
				error = true;
			}
		} while (error);

		for (int i = 0; i < 3; i++) {
			msg += String.valueOf("\n" + option[i] + ": " + quant[i]);
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
