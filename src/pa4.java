import javax.swing.*;

public class pa4 {

	public static void main(String[] args) {
		
		float X = 0;
		float vetor[] = new float[5];
		String msg = "";
		boolean error = false;
		
		do {
			try {
				
				X = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
				error = false;
				
			} catch (Exception e) {	
				if(e instanceof java.lang.NullPointerException) {
					System.exit(1);
				} else if(e instanceof java.lang.NumberFormatException) {
					if(e.getMessage().equals("empty String")) {
						JOptionPane.showMessageDialog(null, "Campo Obrigatório!");
					} else {
						JOptionPane.showMessageDialog(null, "Digite apenas números!");
					}					
				}
				error = true;
			}
		} while (error);
		
		for (int i = 0; i < vetor.length; i++) {
			if (i == 0) {
				vetor[i] = X;
			} else {
				vetor[i] = vetor[i - 1] / 2;
			}	
			
			msg += String.valueOf("N[" + i + "] = " + vetor[i] + "\n");
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
