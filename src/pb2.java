import javax.swing.*;

public class pb2 {

	public static void main(String[] args) {
		
		boolean error = false;
		int num[] = new int[4];
		int index = 0;
		
		do {
			
			try {
				for (int i = index; i < num.length; i++) {
					index = i;
					num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número:"));
				}
				error = false;
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
	
		JOptionPane.showMessageDialog(null, "DIFERENCA = " + (num[0] * num[1] - num[2] * num[3]));
	}
}
