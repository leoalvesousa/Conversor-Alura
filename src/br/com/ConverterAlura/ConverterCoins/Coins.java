package br.com.ConverterAlura.ConverterCoins;

public class Coins {

    private double eur;
    private double usd;
    private double brl;
    private double gbp;

    private double ars;

    private double clp;


        public Coins(double usd, double eur, double brl, double gbp,  double ars, double clp) {
            this.usd = usd;
            this.eur = eur;
            this.brl = brl;
            this.gbp = gbp;
            this.ars = ars;
            this.clp = clp;


        }

        public double getUsd() {
            return usd;
        }

        public double getEur() {
            return eur;
        }

        public double getBrl() {
        return brl;
    }

        public double getGbp() {return gbp;}

        public double getArs() {return ars;}

        public double getClp() {return clp;}

}



