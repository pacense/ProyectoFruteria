package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class BuscarArticulo extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JLabel lblPrecioDelProducto;
	private JLabel lblDescripcin;
	private JLabel lblPvp;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public BuscarArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{470, 0};
		gridBagLayout.rowHeights = new int[]{372, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("MV Boli", Font.PLAIN, 21));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {113, 120, 0, 72};
		gbl_panel_1.rowHeights = new int[] {76, 52, 43, 34, 43, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel = new JLabel("Panel de busqueda de productos");
		lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 21));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Nombre del producto");
		lblNewLabel_2.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblPrecioDelProducto = new JLabel("Precio del producto");
		lblPrecioDelProducto.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPrecioDelProducto = new GridBagConstraints();
		gbc_lblPrecioDelProducto.anchor = GridBagConstraints.NORTH;
		gbc_lblPrecioDelProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioDelProducto.gridx = 1;
		gbc_lblPrecioDelProducto.gridy = 2;
		panel_1.add(lblPrecioDelProducto, gbc_lblPrecioDelProducto);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 3;
		panel_1.add(lblDescripcin, gbc_lblDescripcin);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Buscar producto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lblPvp = new JLabel("PVP");
		lblPvp.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPvp = new GridBagConstraints();
		gbc_lblPvp.anchor = GridBagConstraints.EAST;
		gbc_lblPvp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPvp.gridx = 1;
		gbc_lblPvp.gridy = 4;
		panel_1.add(lblPvp, gbc_lblPvp);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 5;
		panel_1.add(btnNewButton, gbc_btnNewButton);

	}
}
