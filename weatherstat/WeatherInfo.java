/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherstat;

/**
 *
 * @author huong
 */
public class WeatherInfo {
    private double rain;
    private double snow;
    private double sun;

    public WeatherInfo(double rain, double snow, double sun) {
        this.rain = rain;
        this.snow = snow;
        this.sun = sun;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getSun() {
        return sun;
    }

    public void setSun(double sun) {
        this.sun = sun;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" + "rain=" + rain + ", snow=" + snow + ", sun=" + sun + '}';
    }
    
    
}
