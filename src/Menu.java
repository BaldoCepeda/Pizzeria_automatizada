import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class Menu extends JFrame {

	JPanel contentPane;
	JTextField txtTiempoEjecucion;
	JTextField txtLlegadaCliente;
	JTextField txtProximaPizza;
	JTextField txtProximoCliente;
	JTextField txtTrasLlegar;
	JTextField txtCola;
	JTextField txtCaja;
	JTextField txtTiempoEjecucion2;
	JTextField execTime;
	JButton btnContinue;
	JButton btnStop;
	JLabel lblStatus;
	JLabel lblStatus_1;
	JTextField txtpendped;

	/**
	 * Create the frame. 
	 */
	public Menu() {
		
		Container frame = this.getContentPane();
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTiempoDeEjecucion = new JLabel("Tiempo de ejecuci\u00F3n t=");
		lblTiempoDeEjecucion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTiempoDeEjecucion.setBounds(27, 96, 118, 14);
		contentPane.add(lblTiempoDeEjecucion);
		
		txtTiempoEjecucion = new JTextField();
		txtTiempoEjecucion.setEditable(false);
		txtTiempoEjecucion.setBounds(151, 93, 47, 20);
		contentPane.add(txtTiempoEjecucion);
		txtTiempoEjecucion.setColumns(10);
		
		JLabel lblMinutos = new JLabel("minutos");
		lblMinutos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMinutos.setBounds(208, 96, 46, 14);
		contentPane.add(lblMinutos);
		
		JLabel lblLlegaClienteNum = new JLabel("Llega cliente Num:");
		lblLlegaClienteNum.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLlegaClienteNum.setBounds(43, 137, 92, 14);
		contentPane.add(lblLlegaClienteNum);
		
		txtLlegadaCliente = new JTextField();
		txtLlegadaCliente.setEditable(false);
		txtLlegadaCliente.setBounds(134, 134, 38, 20);
		contentPane.add(txtLlegadaCliente);
		txtLlegadaCliente.setColumns(10);
		
		JLabel lblProximaEntregaDe = new JLabel("Proxima entrega de pizza tardar\u00E1:");
		lblProximaEntregaDe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblProximaEntregaDe.setBounds(43, 174, 177, 14);
		contentPane.add(lblProximaEntregaDe);
		
		txtProximaPizza = new JTextField();
		txtProximaPizza.setEditable(false);
		txtProximaPizza.setBounds(217, 171, 47, 20);
		contentPane.add(txtProximaPizza);
		txtProximaPizza.setColumns(10);
		
		JLabel lblMinutos_1 = new JLabel("minutos");
		lblMinutos_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMinutos_1.setBounds(274, 174, 46, 14);
		contentPane.add(lblMinutos_1);
		
		JLabel lblProximaLlegadaDe = new JLabel("Pr\u00F3xima llegada de cliente ser\u00E1 en:");
		lblProximaLlegadaDe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblProximaLlegadaDe.setBounds(43, 202, 177, 14);
		contentPane.add(lblProximaLlegadaDe);
		
		txtProximoCliente = new JTextField();
		txtProximoCliente.setEditable(false);
		txtProximoCliente.setBounds(217, 199, 46, 20);
		contentPane.add(txtProximoCliente);
		txtProximoCliente.setColumns(10);
		
		JLabel lblMinutos_2 = new JLabel("minutos");
		lblMinutos_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMinutos_2.setBounds(274, 202, 46, 14);
		contentPane.add(lblMinutos_2);
		
		JLabel lblTrasLlegarEl = new JLabel("TRAS LLEGAR EL CLIENTE");
		lblTrasLlegarEl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTrasLlegarEl.setBounds(43, 230, 129, 14);
		contentPane.add(lblTrasLlegarEl);
		
		txtTrasLlegar = new JTextField();
		txtTrasLlegar.setEditable(false);
		txtTrasLlegar.setBounds(178, 227, 38, 20);
		contentPane.add(txtTrasLlegar);
		txtTrasLlegar.setColumns(10);
		
		JLabel lblEnColaDe = new JLabel("En cola de preparaci\u00F3n hay");
		lblEnColaDe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEnColaDe.setBounds(43, 258, 141, 14);
		contentPane.add(lblEnColaDe);
		
		txtCola = new JTextField();
		txtCola.setEditable(false);
		txtCola.setBounds(188, 255, 38, 20);
		contentPane.add(txtCola);
		txtCola.setColumns(10);
		
		JLabel lblPedidos = new JLabel("pedidos");
		lblPedidos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPedidos.setBounds(236, 258, 46, 14);
		contentPane.add(lblPedidos);
		
		JLabel lblYEnCaja = new JLabel("Y en caja hay");
		lblYEnCaja.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblYEnCaja.setBounds(43, 283, 65, 14);
		contentPane.add(lblYEnCaja);
		
		txtCaja = new JTextField();
		txtCaja.setEditable(false);
		txtCaja.setBounds(118, 280, 38, 20);
		contentPane.add(txtCaja);
		txtCaja.setColumns(10);
		
		JLabel lblPersonas = new JLabel("personas");
		lblPersonas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPersonas.setBounds(166, 283, 46, 14);
		contentPane.add(lblPersonas);
		
		JLabel lblTiempoDeEjecucion2 = new JLabel("Tiempo de ejecuci\u00F3n t=");
		lblTiempoDeEjecucion2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTiempoDeEjecucion2.setBounds(37, 315, 118, 14);
		contentPane.add(lblTiempoDeEjecucion2);
		
		txtTiempoEjecucion2 = new JTextField();
		txtTiempoEjecucion2.setEditable(false);
		txtTiempoEjecucion2.setColumns(10);
		txtTiempoEjecucion2.setBounds(161, 312, 47, 20);
		contentPane.add(txtTiempoEjecucion2);
		
		JLabel lblMinutos_3 = new JLabel("minutos");
		lblMinutos_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMinutos_3.setBounds(218, 315, 46, 14);
		contentPane.add(lblMinutos_3);
		
		lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStatus.setBounds(134, 68, 46, 14);
		contentPane.add(lblStatus);
		
		JTextArea txtrH = new JTextArea();
		txtrH.setWrapStyleWord(true);
		txtrH.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrH.setLineWrap(true);
		txtrH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vehicula risus accumsan, placerat tellus ac, cursus leo. Suspendisse risus nunc, tempor quis bibendum id, bibendum ac leo. Nunc lectus orci, pellentesque vitae porttitor id, ultrices non ipsum. Cras a ultricies nunc. Aenean imperdiet ac ipsum at iaculis. Nulla convallis justo odio, ac volutpat arcu aliquet vitae. Nam iaculis massa sed libero tristique finibus. Aliquam hendrerit, sem non ultrices pulvinar, velit dui feugiat orci, id porta tellus dui vitae ante. Cras ut pharetra nisi. Donec eget tortor ut sapien maximus elementum vitae id augue.\nVestibulum in lorem non diam ornare auctor. Vivamus id magna dui. Curabitur mattis commodo mauris vel maximus. Fusce vel sem tempus, dictum leo nec, aliquet quam. Maecenas rhoncus arcu ac nisi pulvinar, ut pharetra purus tempus. Nam efficitur leo lorem, eget semper ipsum maximus ut. Fusce condimentum lectus felis, vehicula aliquam mi viverra eget. Integer vel mattis sapien. Duis eu enim tristique, tempor odio sodales, faucibus tellus.\nVestibulum sollicitudin, arcu vel rutrum laoreet, quam urna cursus ipsum, at lobortis turpis justo vitae ipsum. In euismod gravida sodales. Nullam maximus, nulla id scelerisque consectetur, lacus enim convallis felis, dictum ultrices urna ligula eget neque. Etiam volutpat sem a tortor pulvinar mollis. In non eros at arcu aliquet auctor et bibendum magna. Maecenas aliquam nisi nec congue malesuada. Fusce tincidunt enim ac eros iaculis, et aliquet nibh semper. Praesent aliquam quis eros vitae porta. Phasellus ut pellentesque enim. Curabitur congue venenatis sem sed aliquet. Donec placerat felis sit amet erat ultricies, sed consequat erat vehicula. Morbi eget mauris in risus laoreet convallis. In hac habitasse platea dictumst. Cras et erat non magna fermentum pulvinar ut aliquet magna. Sed tortor nisl, vestibulum vitae tristique vitae, congue et diam. Etiam facilisis dictum volutpat.");
		txtrH.setBounds(385, 43, 351, 402);
		contentPane.add(txtrH);
		
		JLabel lblIngresaLaDuracion = new JLabel("Ingresa la duracion de la ejecuci\u00F3n:");
		lblIngresaLaDuracion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIngresaLaDuracion.setBounds(27, 23, 177, 14);
		contentPane.add(lblIngresaLaDuracion);
		
		execTime = new JTextField();
		execTime.setEditable(true);
		execTime.setText("");
		execTime.setBounds(208, 20, 46, 20);
		contentPane.add(execTime);
		execTime.setColumns(10);
		
		btnContinue = new JButton("Iniciar");
		btnContinue.setBounds(52, 453, 89, 23);
		contentPane.add(btnContinue);
		
		btnStop = new JButton("Detener");
		btnStop.setBounds(175, 451, 89, 23);
		contentPane.add(btnStop);
		
		JLabel lblAlgunTexto = new JLabel("En cola de preparacion hay");
		lblAlgunTexto.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAlgunTexto.setBounds(27, 393, 145, 14);
		contentPane.add(lblAlgunTexto);
		
		txtpendped = new JTextField();
		txtpendped.setEditable(false);
		txtpendped.setBounds(166, 390, 38, 20);
		contentPane.add(txtpendped);
		txtpendped.setColumns(10);
		
		JLabel lblPedidos_1 = new JLabel("pedidos");
		lblPedidos_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPedidos_1.setBounds(218, 393, 46, 14);
		contentPane.add(lblPedidos_1);
		
		lblStatus_1 = new JLabel("Status 2");
		lblStatus_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStatus_1.setBounds(126, 365, 46, 14);
		contentPane.add(lblStatus_1);
		
		//JLabel lblNewLabel = new JLabel(new ImageIcon(Menu.class.getResource("/img/user.jpg")));
		//lblNewLabel.setBounds(23, 26, 710, 412);
		//contentPane.add(lblNewLabel);
	}
}
