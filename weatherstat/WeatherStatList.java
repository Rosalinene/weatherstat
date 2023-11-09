/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherstat;

import java.util.LinkedList;

/**
 *
 * @author huong
 */
public class WeatherStatList extends LinkedList<WeatherInfo>
{
    public WeatherInfo GetWeatherInfo(int item)
    {
        WeatherInfo temp = null;
        
        try
        {
        if(!(this.isEmpty()))
            temp = this.get(item);
        }
        catch (IndexOutOfBoundsException)
        {
            System.out.println("Bad position");
        return temp;
    }
    }
}
