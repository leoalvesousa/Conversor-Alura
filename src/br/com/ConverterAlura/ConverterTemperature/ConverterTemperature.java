package br.com.ConverterAlura.ConverterTemperature;

import br.com.ConverterAlura.Panel.Panel;
import javax.swing.*;

public class ConverterTemperature {
    public static void converterTemperature() {

            while (true) {
                String input = JOptionPane.showInputDialog("Insira um valor:");

                if (isNumeric(input)) {
                    double value = Double.parseDouble(input);

                    int conversionOption = Panel.panelComboTemperature();

                    double resultValue = 0;
                    switch (conversionOption) {
                        case 0:
                            resultValue = (value * 1.8) + 32;
                            break;

                        case 1:
                            resultValue = value + 273;
                            break;

                        case 2:
                            resultValue = (value - 32) / 1.8;
                            break;

                        case 3:
                            resultValue = (value + 459.67) / 1.8;
                            break;

                        case 4:
                            resultValue = value - 273;
                            break;

                        case 5:
                            resultValue = (value * 1.8) - 459.67;
                            break;
                    }
                    resultValue = Math.ceil(resultValue * 100) / 100;

                    Panel.showResultPanel(resultValue);

                    int choice = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (choice == JOptionPane.YES_OPTION){
                        Panel.panelComboConverter();
                    }
                    else if (choice == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        break;
                    } else if (choice == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa Concluído");
                        break;
                    }
                }
            }
    }
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira um valor numérico");
            return false;
        }
    }
}
