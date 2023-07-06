package br.com.ConverterAlura.ConverterCoins;

import br.com.ConverterAlura.Panel.Panel;

import javax.swing.*;

public class ConverterCoins {
    public static void converterCoins() {

        while (true) {
            String input = Panel.panelInput();

            if (isNumeric(input)) {
                double value = Double.parseDouble(input);
                Coins coins = ConverterCoinsAPI.getConverter();

                int conversionOption = Panel.panelComboCoins();

                double resultValue = 0;
                switch (conversionOption) {
                    case 0:
                        resultValue = value / coins.getUsd();
                        break;

                    case 1:
                        resultValue = value * coins.getBrl();
                        break;

                    case 2:
                        resultValue = value / coins.getGbp();
                        break;

                    case 3:
                        resultValue = value * coins.getBrl();
                        break;

                    case 4:
                        resultValue = value / coins.getEur();
                        break;

                    case 5:
                        resultValue = value * coins.getBrl();
                        break;

                    case 6:
                        resultValue = value / coins.getArs();
                        break;

                    case 7:
                        resultValue = value * coins.getBrl();
                        break;

                    case 8:
                        resultValue = value / coins.getClp();
                        break;

                    case 9:
                        resultValue = value * coins.getBrl();
                        break;
                }
                resultValue = Math.ceil(resultValue * 100) / 100;

                Panel.showResultPanel(resultValue);

                Panel.panelAdvance();
            }
        }
    }

    private static boolean isNumeric(String str) {
        try {
            double value = Double.parseDouble(str);
            if (value > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Insira um valor positivo");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira um valor numérico");
            return false;
        }
    }
}





