package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

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
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(14, 99, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(70, 96, 359, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos\r\n");
		lblNewLabel_1.setBounds(10, 130, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 127, 359, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 161, 46, 14);
		panel.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setBounds(70, 158, 359, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblColorPelo = new JLabel("Color pelo");
		lblColorPelo.setBounds(10, 192, 53, 14);
		panel.add(lblColorPelo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(70, 189, 359, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(165, 220, 89, 23);
		panel.add(btnBuscar);
		
		JLabel label = new JLabel("");
		label.setBounds(40, 254, 359, 20);
		panel.add(label);
		
		JLabel lblBuscadorDeClientes = new JLabel("BUSCADOR DE CLIENTES");
		lblBuscadorDeClientes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBuscadorDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscadorDeClientes.setBounds(55, 35, 344, 43);
		panel.add(lblBuscadorDeClientes);
	}
}
