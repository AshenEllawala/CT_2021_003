package q2;

public class Temerature {

    private double celsius;

    public Temerature() {
        this.celsius = 0.0;
    }

    public Temerature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
