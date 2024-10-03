
import javax.swing.*;

public class VentanaRegistro extends JFrame {

    public VentanaRegistro() {

        setTitle("Ventana de Registro");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel textoNombre = new JLabel("Nombres:");
        textoNombre.setBounds(50, 50, 100, 30);
        add(textoNombre);

        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(150, 50, 200, 30);
        add(campoNombre);

        JLabel textoApellido = new JLabel("Apellidos:");
        textoApellido.setBounds(50, 100, 100, 30);
        add(textoApellido);

        JTextField campoApellido = new JTextField();
        campoApellido.setBounds(150, 100, 200, 30);
        add(campoApellido);

        JLabel textoGenero = new JLabel("Genero:");
        textoGenero.setBounds(50, 150, 100, 30);
        add(textoGenero);

        String[] generos = { "Masculino", "Femenino", "Otro" };
        JComboBox<String> comboGenero = new JComboBox<>(generos);
        comboGenero.setBounds(150, 150, 200, 30);
        add(comboGenero);

        JLabel textoEdad = new JLabel("Edad:");
        textoEdad.setBounds(50, 200, 100, 30);
        add(textoEdad);

        SpinnerModel modeloSpinner = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinnerEdad = new JSpinner(modeloSpinner);
        spinnerEdad.setBounds(150, 200, 200, 30);
        add(spinnerEdad);

        JLabel textoEmail = new JLabel("Email:");
        textoEmail.setBounds(50, 250, 100, 30);
        add(textoEmail);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(150, 250, 200, 30);
        add(campoEmail);

        JLabel textoPassword = new JLabel("Contraseña:");
        textoPassword.setBounds(50, 300, 100, 30);
        add(textoPassword);

        // campo de contraseña
        JPasswordField campoPassword = new JPasswordField();
        campoPassword.setBounds(150, 300, 200, 30);
        campoPassword.setEchoChar('*');
        add(campoPassword);


        // confirmar contraseña
        JLabel textoConfirmarPassword = new JLabel("Confirmar Pass:");
        textoConfirmarPassword.setBounds(50, 350, 200, 30);
        add(textoConfirmarPassword);

        JTextField campoConfirmarPassword = new JTextField();
        campoConfirmarPassword.setBounds(150, 350, 200, 30);
        add(campoConfirmarPassword);

        JCheckBox mostrarPassword = new JCheckBox("Mostrar Contraseña");
        mostrarPassword.setBounds(150, 200, 200, 30);
        mostrarPassword.addActionListener(e -> {
        campoPassword.setEchoChar(mostrarPassword.isSelected() ? '\u0000' : '*');
        });
        add(mostrarPassword);

        JButton botonRegistro = new JButton("Registrarse");
        botonRegistro.setBounds(150, 400, 200, 30);
        botonRegistro.setBackground(new java.awt.Color(0, 255, 10));
        add(botonRegistro);

        // agregar boton atras
        JButton botonAtras = new JButton("Atrás");
        botonAtras.setBounds(150, 450, 200, 30);
        add(botonAtras);

        botonAtras.addActionListener(e -> {
            VentanaLogin ventanaLogin = new VentanaLogin();
            ventanaLogin.setVisible(true);
            setVisible(false);
        });

    }
    
}
