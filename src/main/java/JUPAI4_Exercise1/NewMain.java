/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUPAI4_Exercise1;

import static java.awt.PageAttributes.MediaType.A;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Ahmed yamani
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws  IOException {
        CountryDAO city_csv_reader = new CountryDAO();
        List<Country> countries = city_csv_reader.readCountriesFromCSV("C:\\Users\\Ahmed yamani\\Desktop\\Assignment_2\\src\\main\\java\\mypkg\\Countries.csv");
        CityDAO c=new CityDAO();
        List<Cities> cities=c.readCitiesFromCSV("C:\\Users\\Ahmed yamani\\Desktop\\Assignment_2\\src\\main\\java\\mypkg\\Cities.csv");
        //for (Cities p:cities){
        //System.out.println(p); 
        Map<Integer,List<Cities>> cities_in_country= new HashMap<>();
        for(Cities pp:cities){
            if(!cities_in_country.containsKey(pp.country_code)){
                List<Cities> cc=new ArrayList<>();
                cc.add(pp);
                cities_in_country.put(pp.country_code,cc);
            }
            else{
                    cities_in_country.get(pp.country_code).add(pp);
                 }
            
        }
     //System.out.println(cities_in_country);   
     List<Double> sort;
        sort = cities
                .stream()
                .map(Cities::getPopulation)
                .sorted().collect(Collectors.toList());
        System.out.println(sort);
    }
}
    

