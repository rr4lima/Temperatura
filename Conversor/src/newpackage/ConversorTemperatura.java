
package newpackage;

import java.awt.Color;


class ConversorTemperatura {


    private double temperaturaCelsius;
    private double temperaturaFahrenheit;
    private String tipoClima;


    public ConversorTemperatura(int temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        this.temperaturaFahrenheit = (temperaturaCelsius * 9.0 / 5.0) + 32;
        this.tipoClima = definirClima(this.temperaturaFahrenheit);
    }


    public ConversorTemperatura(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
        this.temperaturaCelsius = (temperaturaFahrenheit - 32) * 5.0 / 9.0;
        this.tipoClima = definirClima(this.temperaturaFahrenheit);
    }

    public ConversorTemperatura() {
        this.temperaturaCelsius = 0;
        this.temperaturaFahrenheit = 32;
        this.tipoClima = definirClima(this.temperaturaFahrenheit);
    }

    
    public String definirClima(double temperaturaFahrenheit) {
        if (temperaturaFahrenheit <= 64.4) {
            return "O clima é frio.";
        } else if (temperaturaFahrenheit <= 73.4) {
            return "O clima é agradável.";
        } else if (temperaturaFahrenheit <= 95) {
            return "O clima é quente.";
        } else {
            return "O clima é muito quente.";
        }
    }

    public Color obterCorFundo() {
        if (this.tipoClima.equals("O clima é frio.")) {
            return Color.BLUE;
        } else if (this.tipoClima.equals("O clima é agradável.")) {
            return Color.GREEN;
        } else if (this.tipoClima.equals("O clima é quente.")) {
            return Color.YELLOW;
        } else {
            return Color.RED;
        }
    }

    public String getTipoClima() {
        return tipoClima;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }
}


