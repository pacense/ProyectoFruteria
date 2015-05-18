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
	private JTextField txtNombreProducto;
	private JTextField txtPrecioProducto;
	private JTextField txtDescripcion;
	private JButton btnNewButton;
	private JLabel lblPrecioDelProducto;
	private JLabel lblDescripcin;
	private JLabel lblPvp;
	private JLabel lblPVP;

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
		
		txtNombreProducto = new JTextField();
		GridBagConstraints gbc_txtNombreProducto = new GridBagConstraints();
		gbc_txtNombreProducto.anchor = GridBagConstraints.NORTH;
		gbc_txtNombreProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreProducto.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreProducto.gridx = 2;
		gbc_txtNombreProducto.gridy = 1;
		panel_1.add(txtNombreProducto, gbc_txtNombreProducto);
		txtNombreProducto.setColumns(10);
		
		lblPrecioDelProducto = new JLabel("Precio del producto");
		lblPrecioDelProducto.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPrecioDelProducto = new GridBagConstraints();
		gbc_lblPrecioDelProducto.anchor = GridBagConstraints.NORTH;
		gbc_lblPrecioDelProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioDelProducto.gridx = 1;
		gbc_lblPrecioDelProducto.gridy = 2;
		panel_1.add(lblPrecioDelProducto, gbc_lblPrecioDelProducto);
		
		txtPrecioProducto = new JTextField();
		GridBagConstraints gbc_txtPrecioProducto = new GridBagConstraints();
		gbc_txtPrecioProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioProducto.anchor = GridBagConstraints.NORTH;
		gbc_txtPrecioProducto.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioProducto.gridx = 2;
		gbc_txtPrecioProducto.gridy = 2;
		panel_1.add(txtPrecioProducto, gbc_txtPrecioProducto);
		txtPrecioProducto.setColumns(10);
		
		lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("MV Boli", Font.PLAIN, 12));
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 3;
		panel_1.add(lblDescripcin, gbc_lblDescripcin);
		
		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.anchor = GridBagConstraints.NORTH;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 3;
		panel_1.add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
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
		
		lblPVP = new JLabel("");
		GridBagConstraints gbc_lblPVP = new GridBagConstraints();
		gbc_lblPVP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPVP.gridx = 2;
		gbc_lblPVP.gridy = 4;
		panel_1.add(lblPVP, gbc_lblPVP);
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
