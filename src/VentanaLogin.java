import javax.swing.*;

public class VentanaLogin extends  JFrame {

    public VentanaLogin() {

        setTitle("Ventana de Login");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel textoLogin = new JLabel("Usuario:");
        textoLogin.setBounds(50, 50, 100, 30);
        add(textoLogin);

        JTextField campoLogin = new JTextField();
        campoLogin.setBounds(150, 50, 200, 30);
        add(campoLogin);

        JLabel textoPassword = new JLabel("Contraseña:");
        textoPassword.setBounds(50, 100, 100, 30);
        add(textoPassword);

        JPasswordField campoPassword = new JPasswordField();
        campoPassword.setBounds(150, 100, 200, 30);
        campoPassword.setEchoChar('*');
        add(campoPassword);

        JCheckBox mostrarPassword = new JCheckBox("Mostrar Contraseña");
        mostrarPassword.setBounds(360, 100, 200, 30);
        mostrarPassword.addActionListener(e -> {
            campoPassword.setEchoChar(mostrarPassword.isSelected() ? '\u0000' : '*');
        });
        add(mostrarPassword);

        JButton botonLogin = new JButton("Iniciar Sesión");
        botonLogin.setBounds(150, 150, 200, 30);
        botonLogin.setBackground(new java.awt.Color(0, 255, 10));
        add(botonLogin);

        // agregar boton de registro en la parte inferior
        JButton botonRegistro = new JButton("Registrarse");
        botonRegistro.setBounds(150, 200, 200, 30);
        add(botonRegistro);

        botonRegistro.addActionListener(e -> {
            VentanaRegistro ventanaRegistro = new VentanaRegistro();
            ventanaRegistro.setVisible(true);
            setVisible(false);
        });

    }    
}
