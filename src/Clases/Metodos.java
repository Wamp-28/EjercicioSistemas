package Clases;

public class Metodos {

    // area del circulo pi*(radio)^2

    private double pi;

    private double radio;

    public Metodos() {
    }

    public Metodos(double pi, double radio) {
        this.pi = pi;
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Metodos{" +
                "pi=" + pi +
                ", radio=" + radio +
                '}';
    }

    public double areaCirculo(double pi, double radio){
        return pi*Math.pow(radio,2);

    }




}
