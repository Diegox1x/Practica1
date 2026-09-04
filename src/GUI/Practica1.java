package GUI;

import javax.swing.*;

public class Practica1 extends JFrame {

    JLabel nombre, edad, correo, usuario, contrasenia, informacion;
    JTextField tnombre, tedad, tcorreo, tusuario;
    JPasswordField pcontrasenia;
    JTextArea area;
    JScrollPane scroll;
    JButton nuevo, agregar;

    public Practica1 () {
        setTitle("Práctica 1");
        setSize(600, 350);
        setLayout(null);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }

    public void componentes() {
        nombre = new JLabel("Nombre:");
        nombre.setBounds(30, 30, 80, 25);

        edad = new JLabel("Edad:");
        edad.setBounds(30, 70, 80, 25);

        correo = new JLabel("Correo:");
        correo.setBounds(30, 110, 80, 25);

        usuario = new JLabel("Usuario:");
        usuario.setBounds(30, 150, 80, 25);

        contrasenia = new JLabel("Contraseña:");
        contrasenia.setBounds(30, 190, 90, 25);

        tnombre = new JTextField();
        tnombre.setBounds(120, 30, 140, 25);

        tedad = new JTextField();
        tedad.setBounds(120, 70, 140, 25);

        tcorreo = new JTextField();
        tcorreo.setBounds(120, 110, 140, 25);

        tusuario = new JTextField();
        tusuario.setBounds(120, 150, 140, 25);

        pcontrasenia = new JPasswordField();
        pcontrasenia.setBounds(120, 190, 140, 25);

        informacion = new JLabel("Información");
        informacion.setBounds(300, 30, 100, 25);

        area = new JTextArea();
        scroll = new JScrollPane(area);
        scroll.setBounds(300, 65, 240, 150);

        nuevo = new JButton("Nuevo");
        nuevo.setBounds(180, 240, 95, 30);

        agregar = new JButton("Agregar");
        agregar.setBounds(295, 240, 95, 30);

        add(nombre);
        add(edad);
        add(correo);
        add(usuario);
        add(contrasenia);
        add(tnombre);
        add(tedad);
        add(tcorreo);
        add(tusuario);
        add(pcontrasenia);
        add(informacion);
        add(scroll);
        add(nuevo);
        add(agregar);
    }
}