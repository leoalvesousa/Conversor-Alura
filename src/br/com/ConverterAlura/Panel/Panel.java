package br.com.ConverterAlura.Panel;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static int panelComboConverter() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Escolha uma opção");
        String[] options = {"Converter Moeda","Converter Temperatura"};

        JComboBox<String> comboBoxConverter = new JComboBox<>(options);

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(comboBoxConverter);

        panel.setPreferredSize(new Dimension(250, 80));
        label.setPreferredSize(new Dimension(150, 15));
        comboBoxConverter.setPreferredSize(new Dimension(200, 30));

        JOptionPane.showOptionDialog(null, panel,
                "Menu", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, null, null);

        return comboBoxConverter.getSelectedIndex();

    }

    public static int panelComboCoins() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Escolha a moeda para qual você deseja girar seu dinheiro");
        String[] options = {"De Reais a Dólares",
                "De Dólares a Reais",
                "De Reais a Libras Esterlinas",
                "De Libras Esterlinas a Reais",
                "De Reais a Euro",
                "De Euro a Reais",
                "De Reais a Peso Argentino",
                "De Peso Argentino a Reais",
                "De Reais a Peso Chileno",
                "De Peso Chileno a Reais"
        };
        JComboBox<String> comboBox = new JComboBox<>(options);

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(comboBox);

        panel.setPreferredSize(new Dimension(250, 80));
        label.setPreferredSize(new Dimension(150, 15));
        comboBox.setPreferredSize(new Dimension(200, 30));

        JOptionPane.showOptionDialog(null, panel,
                "Menu", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, null, null);

        return comboBox.getSelectedIndex();
    }

    public static int panelComboTemperature(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Escolha qual temperatura você quer converter");
        String[] options = {"De Celsius para Fahrenheit",
                            "De Celsius para Kelvin",
                            "De Fahrenheit para Celsius",
                            "De Fahrenheit para Kelvin",
                            "De Kelvin para Celsius",
                            "De Kelvin para Fahrenheit "
        };
        JComboBox<String> comboBoxTemperature = new JComboBox<>(options);

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(comboBoxTemperature);

        panel.setPreferredSize(new Dimension(250, 80));
        label.setPreferredSize(new Dimension(150, 15));
        comboBoxTemperature.setPreferredSize(new Dimension(200, 30));

        JOptionPane.showOptionDialog(null, panel,
                "Menu", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, null, null);

        return comboBoxTemperature.getSelectedIndex();
    }

    public static void showResultPanel(double result) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Resultado da conversão: " + result);

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);

        JOptionPane.showMessageDialog(null, panel, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
