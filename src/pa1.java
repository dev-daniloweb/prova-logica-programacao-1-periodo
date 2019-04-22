import javax.swing.*;

public class pa1 {

	public static void main(String[] args) {
		
		int v[] = new int[3];
		int horaChegada = 0;
		String msg[] = {"a hora de sa�da", "o tempo de viagem", "o fuso hor�rio do destino"};
		boolean error;
		
		for (int i = 0; i < v.length; i++) {
			do {
				try {
					v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + msg[i] + ":"));
					error = false;
					
					switch (i) {
						case 0:
							if (v[i] < 0 || v[i] > 23) {
								error = true;
								JOptionPane.showMessageDialog(null, "N�mero invalido!\n\nDigite um h�rario valido!\n(0 at� 23)");
							}
							break;
						case 1:
								if (v[i] < 1 || v[i] > 12) {
									error = true;
									JOptionPane.showMessageDialog(null, "N�mero invalido!\n\nDigite um h�rario valido!\n(1 at� 12)");
								}
								break;
						case 2:
							if (v[i] < -5 || v[i] > 5) {
								error = true;
								JOptionPane.showMessageDialog(null, "N�mero invalido!\n\nDigite um h�rario valido!\n(-5 at� 5)");
							}
							break;
						default:
							break;
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
			} while(error);
		}
		
		for (int j = 0; j < v.length; j++) {
			if (j == 0 && v[j] == 0) {
				v[j] = 24;
			}
			horaChegada += v[j];
		}
		
		if(horaChegada > 24) {
			horaChegada -= 24;
		}
		
		JOptionPane.showMessageDialog(null, horaChegada);
	}
}