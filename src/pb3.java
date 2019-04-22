import javax.swing.*;

public class pb3 {

	public static void main(String[] args) {
		
		String msg = "";
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				msg += String.valueOf(i + "\n");
			}
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
