package org.example;

import javax.swing.*;

public class LoginWindow extends JFrame {
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public LoginWindow() {
        // Установка заголовка окна
        setTitle("Вход");

        // Создание текстового поля для логина
        JLabel usernameLabel = new JLabel("Логин:");
        usernameTextField = new JTextField(20);

        // Создание поля для пароля
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField(20);

        // Создание кнопки "Войти"
        JButton loginButton = new JButton("Войти");

        // Создание панели и добавление на нее компонентов
        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Добавление панели на окно
        add(panel);

        // Установка размеров окна и его видимость
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
