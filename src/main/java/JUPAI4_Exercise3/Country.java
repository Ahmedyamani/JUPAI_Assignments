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
public class Country {
    String Country_name;
    int Country_code;

    public Country(String Country_name, int Country_code) {
        this.Country_name = Country_name;
        this.Country_code = Country_code;
    }

    public String getCountry_name() {
        return Country_name;
    }

    public void setCountry_name(String Country_name) {
        this.Country_name = Country_name;
    }

    public int getCountry_code() {
        return Country_code;
    }

    public void setCountry_code(int Country_code) {
        this.Country_code = Country_code;
    }

    @Override
    public String toString() {
        return "Country{" + "Country_name=" + Country_name + ", Country_code=" + Country_code + '}';
    }
}



