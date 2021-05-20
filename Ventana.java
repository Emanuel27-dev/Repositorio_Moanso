package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clases.ArregloAdministradores;
import clases.ArregloProductos;
import clases.ArregloProductosAgregados;
import clases.ArregloUsuarios;
import clases.Producto;
import clases.ProductosAgregados;
import clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Button;

public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel x)
	{
		layeredPane.removeAll();
		layeredPane.add(x);
		layeredPane.repaint();
		layeredPane.validate();
	}
	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 10, 530, 360);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel_Ingreso = new JPanel();
		layeredPane.add(panel_Ingreso, "name_3397893717984900");
		panel_Ingreso.setLayout(null);
		
		label = new JLabel("Usuario:");
		label.setBounds(164, 120, 85, 14);
		panel_Ingreso.add(label);
		
		label_1 = new JLabel("Contrase\u00F1a:");
		label_1.setBounds(164, 145, 85, 14);
		panel_Ingreso.add(label_1);
		
		txtusu = new JTextField();
		txtusu.setColumns(10);
		txtusu.setBounds(259, 117, 86, 20);
		panel_Ingreso.add(txtusu);
		
		Ingresar = new JButton("Ingresar");
		Ingresar.addActionListener(this);
		Ingresar.setBounds(164, 181, 89, 23);
		panel_Ingreso.add(Ingresar);
		
		Registrarse = new JButton("Registrarse");
		Registrarse.addActionListener(this);
		Registrarse.setBounds(269, 181, 102, 23);
		panel_Ingreso.add(Registrarse);
		
		txtcon = new JPasswordField();
		txtcon.setBounds(259, 142, 85, 20);
		panel_Ingreso.add(txtcon);
		
		panel_Registro = new JPanel();
		layeredPane.add(panel_Registro, "name_3398571694052300");
		panel_Registro.setLayout(null);
		
		lblNombre = new JLabel("Ingrese nombre:");
		lblNombre.setBounds(77, 86, 156, 14);
		panel_Registro.add(lblNombre);
		
		txtnom = new JTextField();
		txtnom.setBounds(243, 83, 86, 20);
		panel_Registro.add(txtnom);
		txtnom.setColumns(10);
		
		lblApellido = new JLabel("Ingrese apellido:");
		lblApellido.setBounds(77, 111, 156, 14);
		panel_Registro.add(lblApellido);
		
		txtape = new JTextField();
		txtape.setBounds(243, 108, 86, 20);
		panel_Registro.add(txtape);
		txtape.setColumns(10);
		
		lblDni = new JLabel("Ingrese DNI:");
		lblDni.setBounds(77, 136, 156, 14);
		panel_Registro.add(lblDni);
		
		txtdni_usu = new JTextField();
		txtdni_usu.setBounds(243, 133, 86, 20);
		panel_Registro.add(txtdni_usu);
		txtdni_usu.setColumns(10);
		
		lblContrasea = new JLabel("Ingrese contrase\u00F1a:");
		lblContrasea.setBounds(77, 187, 156, 14);
		panel_Registro.add(lblContrasea);
		
		txtcon_R = new JTextField();
		txtcon_R.setBounds(243, 184, 86, 20);
		panel_Registro.add(txtcon_R);
		txtcon_R.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(270, 233, 89, 23);
		panel_Registro.add(btnRegistrar);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(this);
		btnVolver.setBounds(102, 233, 89, 23);
		panel_Registro.add(btnVolver);
		
		lblIngreseCdigo_1 = new JLabel("Ingrese c\u00F3digo:");
		lblIngreseCdigo_1.setBounds(77, 162, 114, 14);
		panel_Registro.add(lblIngreseCdigo_1);
		
		txtcod_usu = new JTextField();
		txtcod_usu.setBounds(243, 159, 86, 20);
		panel_Registro.add(txtcod_usu);
		txtcod_usu.setColumns(10);
		
		panel_Compra = new JPanel();
		layeredPane.add(panel_Compra, "name_3404995340484300");
		panel_Compra.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 30, 510, 227);
		panel_Compra.add(scrollPane);
		
		tblTable = new JTable();
		tblTable.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTable);
		modelo= new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("DNI");
		modelo.addColumn("Estado");
		tblTable.setModel(modelo);
		
		lblCodigoPro = new JLabel("C\u00F3digo del postulante:");
		lblCodigoPro.setBounds(10, 267, 140, 14);
		panel_Compra.add(lblCodigoPro);
		
		txtcod_pa = new JTextField();
		txtcod_pa.setBounds(160, 264, 86, 20);
		panel_Compra.add(txtcod_pa);
		txtcod_pa.setColumns(10);
		
		lblCantidad = new JLabel("Estado");
		lblCantidad.setBounds(293, 267, 73, 14);
		panel_Compra.add(lblCantidad);
		
		txtcant_pa = new JTextField();
		txtcant_pa.setBounds(379, 264, 86, 20);
		panel_Compra.add(txtcant_pa);
		txtcant_pa.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(10, 303, 89, 23);
		panel_Compra.add(btnAdicionar);
		
		btnCarrito = new JButton("");
		btnCarrito.addActionListener(this);
		btnCarrito.setBounds(431, 303, 89, 23);
		panel_Compra.add(btnCarrito);
		
		lblListaDeProductos = new JLabel("Lista de postulantes:");
		lblListaDeProductos.setBounds(10, 5, 140, 14);
		panel_Compra.add(lblListaDeProductos);
		
		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.addActionListener(this);
		btnCerrarSesin.setBounds(379, 1, 141, 23);
		panel_Compra.add(btnCerrarSesin);
		
		panel_Carrito = new JPanel();
		layeredPane.add(panel_Carrito, "name_3485629447928800");
		panel_Carrito.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 30, 499, 186);
		panel_Carrito.add(scrollPane_1);
		
		tblTable1 = new JTable();
		tblTable1.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(tblTable1);
		modelo1= new DefaultTableModel();
		modelo1.addColumn("Código");
		modelo1.addColumn("Nombre");
		modelo1.addColumn("Cantidad");
		modelo1.addColumn("Estado");
		modelo1.addColumn("Total");
		tblTable1.setModel(modelo1);
		
		btnVolver_1 = new JButton("Volver");
		btnVolver_1.addActionListener(this);
		btnVolver_1.setBounds(10, 292, 89, 23);
		panel_Carrito.add(btnVolver_1);
		
		lblCarritoDeCompra = new JLabel("Carro de compra:");
		lblCarritoDeCompra.setBounds(10, 5, 115, 14);
		panel_Carrito.add(lblCarritoDeCompra);
		
		btnConfirmarCompra = new JButton("Confirmar compra");
		btnConfirmarCompra.addActionListener(this);
		btnConfirmarCompra.setBounds(342, 292, 150, 23);
		panel_Carrito.add(btnConfirmarCompra);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(123, 292, 89, 23);
		panel_Carrito.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(231, 292, 89, 23);
		panel_Carrito.add(btnEliminar);
		
		lblIngreseCdigo = new JLabel("Ingrese c\u00F3digo:");
		lblIngreseCdigo.setBounds(10, 243, 89, 14);
		panel_Carrito.add(lblIngreseCdigo);
		
		txtcod_A = new JTextField();
		txtcod_A.setBounds(109, 240, 86, 20);
		panel_Carrito.add(txtcod_A);
		txtcod_A.setColumns(10);
		
		lblIngreseNuevaCantidad = new JLabel("Ingrese nueva cantidad:");
		lblIngreseNuevaCantidad.setBounds(251, 243, 145, 14);
		panel_Carrito.add(lblIngreseNuevaCantidad);
		
		txtcant_A = new JTextField();
		txtcant_A.setBounds(406, 240, 86, 20);
		panel_Carrito.add(txtcant_A);
		txtcant_A.setColumns(10);
		
		btnCerrarSesin_1 = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin_1.addActionListener(this);
		btnCerrarSesin_1.setBounds(368, 1, 141, 23);
		panel_Carrito.add(btnCerrarSesin_1);
		
		panel_Boleta = new JPanel();
		layeredPane.add(panel_Boleta, "name_3502063950526900");
		panel_Boleta.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 30, 510, 202);
		panel_Boleta.add(scrollPane_2);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane_2.setViewportView(txtS);
		modelo2 = new DefaultTableModel();
		modelo2.addColumn("Código");
		modelo2.addColumn("Nombre");
		modelo2.addColumn("Cantidad");
		modelo2.addColumn("Precio");
		modelo2.addColumn("Total");
		
		panel_AME_adm = new JPanel();
		layeredPane.add(panel_AME_adm, "name_125205081444200");
		panel_AME_adm.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 30, 510, 200);
		panel_AME_adm.add(scrollPane_3);
		
		tblTable3 = new JTable();
		tblTable3.setFillsViewportHeight(true);
		scrollPane_3.setViewportView(tblTable3);
		modelo3 = new DefaultTableModel();
		modelo3.addColumn("Código");
		modelo3.addColumn("Nombre");
		modelo3.addColumn("DNI");
		modelo3.addColumn("Estado");
		tblTable3.setModel(modelo3);
		
		lblNombre_1 = new JLabel("C\u00F3digo:");
		lblNombre_1.setBounds(39, 251, 60, 14);
		panel_AME_adm.add(lblNombre_1);
		
		txtcod_ame = new JTextField();
		txtcod_ame.setBounds(109, 245, 86, 20);
		panel_AME_adm.add(txtcod_ame);
		txtcod_ame.setColumns(10);
		
		btnVolver_A = new JButton("Volver");
		btnVolver_A.addActionListener(this);
		btnVolver_A.setBounds(10, 326, 89, 23);
		panel_AME_adm.add(btnVolver_A);
		
		btnAdicionar_A = new JButton("Adicionar");
		btnAdicionar_A.addActionListener(this);
		btnAdicionar_A.setBounds(132, 326, 89, 23);
		panel_AME_adm.add(btnAdicionar_A);
		
		btnModificar_A = new JButton("Modificar");
		btnModificar_A.addActionListener(this);
		btnModificar_A.setBounds(269, 326, 89, 23);
		panel_AME_adm.add(btnModificar_A);
		
		btnEliminar_A = new JButton("Eliminar");
		btnEliminar_A.addActionListener(this);
		btnEliminar_A.setBounds(399, 326, 89, 23);
		panel_AME_adm.add(btnEliminar_A);
		
		lblStock = new JLabel("DNI");
		lblStock.setBounds(39, 290, 45, 14);
		panel_AME_adm.add(lblStock);
		
		txtstock_ame = new JTextField();
		txtstock_ame.setBounds(109, 284, 86, 20);
		panel_AME_adm.add(txtstock_ame);
		txtstock_ame.setColumns(10);
		
		lblNombre_2 = new JLabel("Nombre:");
		lblNombre_2.setBounds(254, 251, 75, 14);
		panel_AME_adm.add(lblNombre_2);
		
		txtnom_ame = new JTextField();
		txtnom_ame.setBounds(324, 245, 86, 20);
		panel_AME_adm.add(txtnom_ame);
		txtnom_ame.setColumns(10);
		
		lblPrecio = new JLabel("Estado");
		lblPrecio.setBounds(269, 290, 46, 14);
		panel_AME_adm.add(lblPrecio);
		
		txtprecio_ame = new JTextField();
		txtprecio_ame.setBounds(324, 284, 86, 20);
		panel_AME_adm.add(txtprecio_ame);
		txtprecio_ame.setColumns(10);
		
		lblListaDeProductos_1 = new JLabel("Lista de postulantes");
		lblListaDeProductos_1.setBounds(10, 5, 125, 14);
		panel_AME_adm.add(lblListaDeProductos_1);
		
		btnCerrarSesin_2 = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin_2.addActionListener(this);
		btnCerrarSesin_2.setBounds(379, 1, 141, 23);
		panel_AME_adm.add(btnCerrarSesin_2);
	}
	ArregloUsuarios au=new ArregloUsuarios();
	ArregloAdministradores aa=new ArregloAdministradores();
	ArregloProductos ap=new ArregloProductos();
	ArregloProductosAgregados apa=new ArregloProductosAgregados();
	private JLayeredPane layeredPane;
	private JPanel panel_Ingreso;
	private JLabel label;
	private JLabel label_1;
	private JTextField txtusu;
	private JButton Ingresar;
	private JButton Registrarse;
	private JPanel panel_Registro;
	private JLabel lblNombre;
	private JTextField txtnom;
	private JLabel lblApellido;
	private JTextField txtape;
	private JLabel lblDni;
	private JTextField txtdni_usu;
	private JLabel lblContrasea;
	private JTextField txtcon_R;
	private JButton btnRegistrar;
	private JButton btnVolver;
	private JPanel panel_Compra;
	private JScrollPane scrollPane;
	private JTable tblTable;
	private DefaultTableModel modelo;
	private JLabel lblCodigoPro;
	private JTextField txtcod_pa;
	private JLabel lblCantidad;
	private JTextField txtcant_pa;
	private JButton btnAdicionar;
	private JPanel panel_Carrito;
	private JScrollPane scrollPane_1;
	private JTable tblTable1;
	private DefaultTableModel modelo1;
	private JButton btnCarrito;
	private JButton btnVolver_1;
	private JLabel lblListaDeProductos;
	private JLabel lblCarritoDeCompra;
	private JPanel panel_Boleta;
	private JButton btnConfirmarCompra;
	private JScrollPane scrollPane_2;
	private DefaultTableModel modelo2;
	private JPasswordField txtcon;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblIngreseCdigo;
	private JTextField txtcod_A;
	private JLabel lblIngreseNuevaCantidad;
	private JTextField txtcant_A;
	private JPanel panel_AME_adm;
	private JScrollPane scrollPane_3;
	private JTable tblTable3;
	private DefaultTableModel modelo3;
	private JLabel lblNombre_1;
	private JTextField txtcod_ame;
	private JButton btnVolver_A;
	private JButton btnAdicionar_A;
	private JButton btnModificar_A;
	private JButton btnEliminar_A;
	private JLabel lblStock;
	private JTextField txtstock_ame;
	private JLabel lblNombre_2;
	private JTextField txtnom_ame;
	private JLabel lblPrecio;
	private JTextField txtprecio_ame;
	private JLabel lblListaDeProductos_1;
	private JButton btnCerrarSesin;
	private JButton btnCerrarSesin_1;
	private JButton btnCerrarSesin_2;
	private JTextArea txtS;
	private JLabel lblIngreseCdigo_1;
	private JTextField txtcod_usu;
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrarSesin_2) {
			do_btnCerrarSesin_2_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrarSesin_1) {
			do_btnCerrarSesin_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrarSesin) {
			do_btnCerrarSesin_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar_A) {
			do_btnModificar_A_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAdicionar_A) {
			do_btnAdicionar_A_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar_A) {
			do_btnEliminar_A_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnVolver_A) {
			do_btnVolver_A_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnConfirmarCompra) {
			do_btnConfirmarCompra_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnVolver_1) {
			do_btnVolver_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCarrito) {
			do_btnCarrito_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnVolver) {
			do_btnVolver_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == Registrarse) {
			do_Registrarse_actionPerformed(arg0);
		}
		if (arg0.getSource() == Ingresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
	}
	void listar_prod(){
		modelo.setRowCount(0);
		for(int i=0;i<ap.tamano();i++){
			Object[] fila ={ap.obtener(i).getCod_p(),
			ap.obtener(i).getNom_p(),
			ap.obtener(i).getStock(),
			ap.obtener(i).getPrecio()};
			modelo.addRow(fila);
		}
	}
	void listar_prod_agregados(){
		double precio_total=0;;
		modelo1.setRowCount(0);
		for(int i=0;i<apa.tamano();i++){
			Object[] fila ={apa.obtener(i).getCod_pa(),
			apa.obtener(i).getNom_pa(),
			apa.obtener(i).getCant(),
			apa.obtener(i).getPrecio_pa(),
			apa.obtener(i).total()};
			precio_total+=apa.obtener(i).total();
			modelo1.addRow(fila);
		}
		Object[] filato={"-","-","-","Total a pagar:",precio_total};
		modelo1.addRow(filato);
	}
	void listar_prod_A(){
		modelo3.setRowCount(0);
		for(int i=0;i<ap.tamano();i++){
			Object[] fila ={ap.obtener(i).getCod_p(),
			ap.obtener(i).getNom_p(),
			ap.obtener(i).getStock(),
			ap.obtener(i).getPrecio()};
			modelo3.addRow(fila);
		}
	}
	void listar_Boleta(){
		float precio_total=0;;
		txtS.setText("");
		txtS.append("\n -------------------------------------------------------------");
		txtS.append("\n       FACTURA DE VENTA ELECTRONICA    ");
		txtS.append("\n -------------------------------------------------------------");
		for(int i=0;i<apa.tamano();i++){
			apa.obtener(i).getNom_pa();
			apa.obtener(i).getCant();
			apa.obtener(i).getPrecio_pa();
			//apa.obtener(i).total();
			precio_total+=apa.obtener(i).total();		
		}
		txtS.append("\n Producto    " + "    Cantidad    " + "    Precio ");
		for(int i=0;i<apa.tamano();i++){
			txtS.append("\n   " +apa.obtener(i).getNom_pa() + "                  "+ apa.obtener(i).getCant() +"                  "+ apa.obtener(i).getPrecio_pa() );
		}
		txtS.append("\n -------------------------------------------------------------");
		txtS.append("\n **OP. EXONERADAS S/ : 0.00" );
		float gravadas= (float) (precio_total - (precio_total *0.18));
		float igv = (float) (precio_total*0.18);
		txtS.append("\n **OP. GRAVADAS   S/ : " + gravadas);
		txtS.append("\n **I.G.V.                S/ : " + igv);
		txtS.append("\n TOTAL                   S/ : " + precio_total);
		txtS.append("\n -------------------------------------------------------------");
		for(int i=0;i<au.tamano();i++){
			if(au.obtener(i).getCod_usu().equals(leercod())){
				txtS.append("\nEstimado Cliente " + au.obtener(i).getNom_usu()+" "+au.obtener(i).getApe_usu());
			}
		}
		txtS.append("\nLa tiendita de Don Pepe le da las gracias por su preferencia");
	}
	void mensaje(String s){
		JOptionPane.showMessageDialog(this, s);
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
			String v_dni_usu=leercod();
			if(v_dni_usu.length()>0){
					String v_con_usu=leercon();
					if(v_con_usu.length()>0){
					for(int i = 0 ; i<au.tamano();i++){
						if((v_dni_usu.equals(au.obtener(i).getCod_usu()) && v_con_usu.equals(au.obtener(i).getCon_usu())) || (v_dni_usu.equals(aa.obtener(i).getCod_adm()) && v_con_usu.equals(aa.obtener(i).getCon_adm()))){
							if(v_dni_usu.equals(au.obtener(i).getCod_usu())){
							switchPanels(panel_Compra);
							txtcod_pa.grabFocus();
							if(apa.tamano()<=0)
								btnCarrito.setEnabled(false);
							listar_prod();
							break;
							}
							else{
								switchPanels(panel_AME_adm);
								listar_prod_A();
								txtcod_ame.grabFocus();
								break;
							}
						}
						else{
							if(i==au.tamano()-1){
							mensaje("El usuario o contraseña son incorrectos.");
							txtusu.setText("");
							txtcon.setText("");
							txtusu.grabFocus();
							}
						}
					}
				}else{
					mensaje("Ingrese una contraseña válida.");
					txtcon.grabFocus();
				}
		}else{
			mensaje("Ingrese un código válido.");
			txtusu.grabFocus();
		}
	}
	public boolean Verificar_Codigo_Repetido(){
		boolean verif_cr = false;
           for(int i = 0 ; i<au.tamano();i++){
               if(au.obtener(i).getDni_usu() == leerDNI_R() || au.obtener(i).getCod_usu().equals(leercod_R())){
                  verif_cr = true;
                  break;
               }
           }
          return verif_cr;
	}
	String leercod(){
		return txtusu.getText().trim();
	}
	String leercon(){
		return txtcon.getText();
	}
	int leerDNI_R(){
		return Integer.parseInt(txtdni_usu.getText().trim());
	}
	String leercod_R(){
		return txtcod_usu.getText().trim();
	}
	protected void do_Registrarse_actionPerformed(ActionEvent arg0) {
		txtusu.setText("");
		txtcon.setText("");
		switchPanels(panel_Registro);
		txtnom.grabFocus();
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent arg0) {
		String nom=txtnom.getText();
		if(nom.length()>0){
			String ape=txtape.getText();
			if(ape.length()>0){
				try{
				int dni_usu=leerDNI_R();
				String cod=txtcod_usu.getText();
				if(cod.length()>0){
					String con=txtcon_R.getText();
					if(con.length()>0){
						Usuario u=new Usuario(nom,ape,cod,con,dni_usu);
						if(Verificar_Codigo_Repetido()){
							mensaje("El DNI o código ya esta registrado.");
							txtnom.setText("");
							txtape.setText("");
							txtdni_usu.setText("");
							txtcod_usu.setText("");
							txtcon_R.setText("");
							txtnom.grabFocus();
						}
						else{
							au.adicionar(u);
							mensaje("Se registro exitosamente.");
							txtnom.setText("");
							txtape.setText("");
							txtdni_usu.setText("");
							txtcod_usu.setText("");
							txtcon_R.setText("");
							switchPanels(panel_Ingreso);
						}	
					}else{
						mensaje("Ingrese una contraseña válida.");
						txtcon_R.grabFocus();
					}
				}else{
					mensaje("Ingrese un código válido.");
					txtcod_usu.grabFocus();
				}
				}catch(Exception e){
					mensaje("Ingrese un DNI válido.");
					txtdni_usu.grabFocus();
				}
			}else{
				mensaje("Ingrese un apellido válido.");
				txtape.grabFocus();
			}
		}
		else{
			mensaje("Ingrese un nombre válido.");
			txtnom.grabFocus();
		}
	}
	protected void do_btnVolver_actionPerformed(ActionEvent arg0) {
		txtnom.setText("");
		txtape.setText("");
		txtdni_usu.setText("");
		txtcon_R.setText("");
		switchPanels(panel_Ingreso);
	}
	
	protected void do_btnAdicionar_actionPerformed(ActionEvent arg0) {
		try{
			int cod_pa=leercod_pa();
			try{
				int cant=leercant();
				int cant_prod_actualizada=0;
				for(int i=0;i<ap.tamano();i++){
					if(VerificarProductos()){
						if(Verificar_Codigo_Agregado()){
							if(Verificar_Stock()){
								if(ap.obtener(i).getCod_p() == leercod_pa()){
									ProductosAgregados pa=new ProductosAgregados(cod_pa,ap.obtener(i).getNom_p(),ap.obtener(i).getPrecio(),cant);
									apa.adicionar(pa);
									ordenar(i,pa);
									cant_prod_actualizada=ap.obtener(i).getStock()-leercant();
									Producto p=ap.buscar(cod_pa);
									p.setStock(cant_prod_actualizada);
									listar_prod();
									mensaje("Se agrego el producto exitosamente.");
									txtcod_pa.setText("");
									txtcant_pa.setText("");
									btnCarrito.setEnabled(true);
									txtcod_pa.grabFocus();
									break;
								}
							}
							else{
								mensaje("La cantidad de productos excede el stock.");
								txtcant_pa.setText("");
								break;
							}
						}
						else{
							mensaje("El código ya ha sido agregado.");
							txtcod_pa.setText("");
							txtcant_pa.setText("");
							break;
						}
					}
					else{
						mensaje("No existe el código.");
						break;
					}
				}
			}catch(Exception e){
				mensaje("Ingrese una cantidad válida.");
				txtcant_pa.grabFocus();
			}
		}catch(Exception e){
			mensaje("Ingrese un código válido.");
			txtcod_pa.grabFocus();
		}
	}
	int leercod_pa(){
		return Integer.parseInt(txtcod_pa.getText().trim());
	}
	int leercant(){
		return Integer.parseInt(txtcant_pa.getText().trim());
	}
	public boolean VerificarProductos(){
		boolean veri = false;
           for(int i = 0 ; i<ap.tamano();i++){
               if(ap.obtener(i).getCod_p() == leercod_pa()){
                  veri = true;
                  break;
               }
        }
          return veri;
	}
	public boolean Verificar_Stock(){
		boolean veri_s = false;
           for(int i = 0 ; i<ap.tamano();i++){
               if(ap.obtener(i).getCod_p() == leercod_pa() && ap.obtener(i).getStock()>=leercant()){
                  veri_s = true;
                  break;
               }
        }
          return veri_s;
	}
	public boolean Verificar_Codigo_Agregado(){
		boolean veri_ca = true;
		if(apa.tamano()>0){
           for(int i = 0 ; i<apa.tamano();i++){
               if(leercod_pa() != apa.obtener(i).getCod_pa()){
                  veri_ca=true;
               }
               else{
            	   veri_ca=false;
            	   break;
               }
        }
		}
          return veri_ca;
	}
	void ordenar(int i,ProductosAgregados pa){
		if(apa.tamano()>1){
			for(i=0;i<apa.tamano()-1;i++){
				for(int j=i+1;j<apa.tamano();j++){
					if(apa.obtener(i).getCod_pa()>apa.obtener(j).getCod_pa()){
						int aux_cod=apa.obtener(i).getCod_pa();
						String aux_nom=apa.obtener(i).getNom_pa();
						int aux_cant=apa.obtener(i).getCant();
						double aux_precio=apa.obtener(i).getPrecio_pa();
						ProductosAgregados aux_pa=new ProductosAgregados(aux_cod,aux_nom,aux_precio,aux_cant);
						apa.eliminar(i);
						apa.adicionar(aux_pa);
						i=0;
						j=i+1;
					}
				}
			}
		}
	}
	protected void do_btnCarrito_actionPerformed(ActionEvent arg0) {
		txtcod_pa.setText("");
		txtcant_pa.setText("");
		switchPanels(panel_Carrito);
		txtcod_A.grabFocus();
		listar_prod_agregados();
	}
	protected void do_btnVolver_1_actionPerformed(ActionEvent arg0) {
		txtcod_A.setText("");
		txtcant_A.setText("");
		switchPanels(panel_Compra);
		listar_prod();
		txtcod_pa.grabFocus();
	}
	protected void do_btnConfirmarCompra_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Boleta);
		listar_Boleta();
	}
	public boolean Verificar_Codigo(){
		boolean verif_c = false;
           for(int i = 0 ; i<apa.tamano();i++){
               if(apa.obtener(i).getCod_pa() == leercod_m_e()){
                  verif_c = true;
                  break;
               }
           }
          return verif_c;
	}
	int leercod_m_e(){
		return Integer.parseInt(txtcod_A.getText().trim());
	}
	int leercant_m_e(){
		return Integer.parseInt(txtcant_A.getText().trim());
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent arg0) {
		try{
			int cont_stock=0;
			if(Verificar_Codigo()){
				for(int i=0;i<apa.tamano();i++){
					if(apa.obtener(i).getCod_pa() == leercod_m_e()){
						cont_stock=apa.obtener(i).getCant();
						for(int j=0;j<ap.tamano();j++){
							if(ap.obtener(j).getCod_p()==leercod_m_e()){
								Producto p=ap.buscar(leercod_m_e());
								p.setStock(cont_stock+ap.obtener(j).getStock());
							}
						}
						apa.eliminar(i);
						listar_prod_agregados();
						txtcod_A.setText("");
						txtcant_A.setText("");	
						break;
					}
				}
			}
			else{
				mensaje("El código no ha sido agregado al carrito.");
			}
		}catch(Exception e){
			mensaje("Ingrese un código válido.");
		}
		//Posible a usar o no.
		if(apa.tamano()==0){
			mensaje("No hay ningun producto en el carrito, sera redirigido a la página de compra.");
			switchPanels(panel_Compra);
			listar_prod();
			btnCarrito.setEnabled(false);
		}
	}
	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
		int cont_stock=0;
		int x=0;
		try{
			if(Verificar_Codigo()){
				try{
					for(int i=0;i<apa.tamano();i++){
						if(apa.obtener(i).getCod_pa() == leercod_m_e()){
							cont_stock=apa.obtener(i).getCant();
							ProductosAgregados pa=apa.buscar(leercod_m_e());	
							for(int j=0;j<ap.tamano();j++){
								if(ap.obtener(j).getCod_p()==leercod_m_e()){
									Producto p=ap.buscar(leercod_m_e());
									x=cont_stock-leercant_m_e();
									if(x+ap.obtener(j).getStock()>=0){
										p.setStock(x+ap.obtener(j).getStock());
										pa.setCant(leercant_m_e());
										mensaje("Se modifico correctamente.");
									}else{
										mensaje("La cantidad escrita supera el stock.");
										break;
									}
								}
							}
							listar_prod_agregados();
							txtcod_A.setText("");
							txtcant_A.setText("");			
							txtcod_A.grabFocus();
							break;
						}
					}
				}catch(Exception e){
					mensaje("Ingrese una cantidad válida.");
				}
			}
			else{
				mensaje("El código no ha sido agregado al carrito.");
			}
		} catch(Exception e){
			mensaje("Ingrese un código válido.");
		}
	}
	protected void do_btnVolver_A_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Ingreso);
	}
	protected void do_btnEliminar_A_actionPerformed(ActionEvent arg0) {
		try{
				if(Verificar_Codigo_Producto()){
					for(int i = 0 ; i<ap.tamano();i++){
						if(ap.obtener(i).getCod_p()==leercod_ame()){
							ap.eliminar(i);
							listar_prod_A();
							mensaje("El código fue eliminado exitosamente.");
							txtcod_ame.setText("");
							txtcod_ame.grabFocus();
							break;
						}
					}
				}else{
					mensaje("El código no existe.");
					txtcod_ame.setText("");
					txtcod_ame.grabFocus();
				}
		}catch(Exception e){
			mensaje("Ingrese un código vàlido.");
			txtcod_ame.grabFocus();
		}
	}
	protected void do_btnAdicionar_A_actionPerformed(ActionEvent arg0) {
		try{
			int cod_pro=leercod_ame();
				String nom_pro=txtnom_ame.getText();
				if(nom_pro.length()>0){
				try{
					int stock_pro=leerstock_ame();
					try{
						double precio_pro=leerprecio_ame();
						if(Verificar_Codigo_Producto()){
							mensaje("El código ya existe.");
							txtcod_ame.setText("");
							txtstock_ame.setText("");
							txtnom_ame.setText("");
							txtprecio_ame.setText("");
							txtcod_ame.grabFocus();
						}else{
							Producto p=new Producto(cod_pro,nom_pro,precio_pro,stock_pro);
							ap.adicionar(p);
							listar_prod_A();
							mensaje("Se agrego un nuevo producto exitosamente.");
							txtcod_ame.setText("");
							txtstock_ame.setText("");
							txtnom_ame.setText("");
							txtprecio_ame.setText("");
							txtcod_ame.grabFocus();
						}
					}catch(Exception e){
						mensaje("Ingrese un precio válido.");
						txtprecio_ame.setText("");
						txtprecio_ame.grabFocus();
					}	
				}catch(Exception e){
					mensaje("Ingrese un stock válido.");
					txtstock_ame.setText("");
					txtstock_ame.grabFocus();
				}
				}else{
					mensaje("Ingrese un nombre válido.");
					txtnom_ame.setText("");
					txtnom_ame.grabFocus();
				}
		}catch(Exception e){
			mensaje("Ingrese un código válido.");
			txtcod_ame.setText("");
			txtcod_ame.grabFocus();
		}
	}
	protected void do_btnModificar_A_actionPerformed(ActionEvent arg0) {
		try{
			int cod_prod=leercod_ame();	
			if(Verificar_Codigo_Producto()){
			try{
				int new_stock=leerstock_ame();
					for(int i=0;i<ap.tamano();i++){
						if(ap.obtener(i).getCod_p()==cod_prod){
							Producto p=ap.buscar(cod_prod);
							p.setStock(new_stock);
							mensaje("Se modifico exitosamente.");
							listar_prod_A();		
						}
					}	
			}catch(Exception e){
				mensaje("Ingrese un stock vàlido.");
				txtstock_ame.grabFocus();
			}
			}else{
				mensaje("El código no existe.");
				txtcod_ame.setText("");
				txtstock_ame.setText("");
				txtcod_ame.grabFocus();
			}
		}catch(Exception e){
		mensaje("Ingrese un código vàlido.");
		txtcod_ame.grabFocus();
		}
	
	}
	public boolean Verificar_Codigo_Producto(){
		boolean verif_c_a = false;
           for(int i = 0 ; i<ap.tamano();i++){
               if(ap.obtener(i).getCod_p() == leercod_ame()){
                  verif_c_a = true;
                  break;
               }
           }
          return verif_c_a;
	}
	int leercod_ame(){
		return Integer.parseInt(txtcod_ame.getText().trim());
	}
	int leerstock_ame(){
		return Integer.parseInt(txtstock_ame.getText().trim());
	}
	double leerprecio_ame(){
		return Double.parseDouble(txtprecio_ame.getText().trim());
	}
	protected void do_btnCerrarSesin_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Ingreso);
		txtusu.setText("");
		txtcon.setText("");
		txtusu.grabFocus();
	}
	protected void do_btnCerrarSesin_1_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Ingreso);
		txtusu.setText("");
		txtcon.setText("");
		txtusu.grabFocus();
	}
	protected void do_btnCerrarSesin_2_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Ingreso);
		txtusu.setText("");
		txtcon.setText("");
		txtusu.grabFocus();
	}
}
