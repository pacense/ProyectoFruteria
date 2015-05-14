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

public class BuscarArticulo extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public BuscarArticulo() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre producto");
		lblNombre.setBounds(80, 71, 90, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(180, 68, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Precio producto");
		lblNewLabel.setBounds(80, 107, 90, 14);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 99, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(80, 150, 90, 14);
		add(lblDescripcion);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 147, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnBuscarPedido = new JButton("Buscar Pedido");
		btnBuscarPedido.setBounds(80, 200, 129, 23);
		add(btnBuscarPedido);
		
		JLabel lblPanelDeBusqueda = new JLabel("Panel de busqueda de productos");
		lblPanelDeBusqueda.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPanelDeBusqueda.setBounds(80, 27, 222, 14);
		add(lblPanelDeBusqueda);

	}
}
