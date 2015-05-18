package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PantallaDeInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public PantallaDeInicio() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 268, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel label = new JLabel("Bienvenido a la Fruteria");
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		JLabel lblNewLabel = new JLabel("Por favor eliga su usuario:");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 14));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnTendero = new JButton("Tendero");
		GridBagConstraints gbc_btnTendero = new GridBagConstraints();
		gbc_btnTendero.insets = new Insets(0, 0, 5, 5);
		gbc_btnTendero.gridx = 3;
		gbc_btnTendero.gridy = 4;
		add(btnTendero, gbc_btnTendero);
		
		JButton btnGestor = new JButton("Gestor");
		GridBagConstraints gbc_btnGestor = new GridBagConstraints();
		gbc_btnGestor.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestor.gridx = 3;
		gbc_btnGestor.gridy = 6;
		add(btnGestor, gbc_btnGestor);
		
		JButton btnNewButton_2 = new JButton("Frutero");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 8;
		add(btnNewButton_2, gbc_btnNewButton_2);

	}

}
