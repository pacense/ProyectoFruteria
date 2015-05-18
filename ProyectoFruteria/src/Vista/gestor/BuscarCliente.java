package Vista.gestor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Component;

public class BuscarCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public BuscarCliente() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 0, 450, 300);
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblBuscadorDeClientes = new JLabel("BUSCADOR DE CLIENTES");
		lblBuscadorDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscadorDeClientes.setPreferredSize(new Dimension(500, 500));
		panel.add(lblBuscadorDeClientes);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos\r\n");
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		panel.add(lblDni);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblColorPelo = new JLabel("Color pelo");
		panel.add(lblColorPelo);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		panel.add(btnBuscar);
		
		JLabel label_3 = new JLabel("");
		panel.add(label_3);
	}
}
