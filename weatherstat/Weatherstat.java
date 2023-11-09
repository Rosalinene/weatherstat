/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weatherstat;

/**
 *
 * @author huong
 */
public class Weatherstat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherStatList myList = new WeatherStatList();
        
        myList.add(new WeatherInfo(10,20,30));
        myList.add(new WeatherInfo(100,200,300));
        myList.add(new WeatherInfo(1000,2000,3000));
        
        WeatherInfo temp;
        
        for(int count = 3; count >=0; count--)
        {
            temp = myList.GetWeatherInfo(count);
            System.out.println(temp);
        }
        
    }
    
}
