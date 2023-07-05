package br.com.ConverterAlura;

import br.com.ConverterAlura.ConverterCoins.ConverterCoins;
import br.com.ConverterAlura.ConverterTemperature.ConverterTemperature;
import br.com.ConverterAlura.Panel.Panel;

public class converter {
    public static void main(String[] args) {
        int panel = Panel.panelComboConverter();

        if (panel == 0) {
            ConverterCoins.converterCoins();
        } else if (panel == 1) {
            ConverterTemperature.converterTemperature();
        }
    }

}
