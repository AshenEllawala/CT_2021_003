package q1;

public class Temperature {
    private double celcius;

    public Temperature(){
        this.celcius = 0;
    }

    public Temperature(double celcius){
        this.celcius = celcius;
    }

    public double getCelcius(){
        return celcius;
    }
    public double getFahrenheit(){
        return (celcius * 9/5) + 32;
    }
    public void setFahrenheit(double fahrenheit){
        this.celcius = (fahrenheit-32) * 5/9 ;
    }


}
