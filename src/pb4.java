import javax.swing.*;

public class pb4 {

	public static void main(String[] args) {

		float num[] = new float[8];
		String msg = "";
		int index = 0;
		boolean error = false;
		
		do {
			try {
				for (int i = index; i < num.length; i++) {
					index = i;
					num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número:"));
					
					if (num[i] <= 10) {
						msg += String.valueOf("A[" + i + "] = " + num[i] + "\n");
					}
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

		JOptionPane.showMessageDialog(null, msg);
	}

}
