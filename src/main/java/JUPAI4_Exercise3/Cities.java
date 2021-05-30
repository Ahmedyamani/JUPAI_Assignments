/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUPAI4_Exercise3;

/**
 *
 * @author Ahmed yamani
 */
public class Cities {
    public String city;
    public int country_code;
    public String continent;
    public double Surface_area;
    public double Population;

    public Cities(String city, int country_code, String continent, double Surface_area, double Population) {
        super();
        this.city = city;
        this.country_code = country_code;
        this.continent = continent;
        this.Surface_area = Surface_area;
        this.Population = Population;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_code() {
        return country_code;
    }

    public void setCountry_code(int country_code) {
        this.country_code = country_code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurface_area() {
        return Surface_area;
    }

    public void setSurface_area(double Surface_area) {
        this.Surface_area = Surface_area;
    }

    public double getPopulation() {
        return Population;
    }

    public void setPopulation(double Population) {
        this.Population = Population;
    }

    @Override
    public String toString() {
        return "Cities{" + "city=" + city + ", country_code=" + country_code + ", continent=" + continent + ", Surface_area=" + Surface_area + ", Population=" + Population + '}';
    }

    
    
}
