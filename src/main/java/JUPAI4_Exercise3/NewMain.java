    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUPAI4_Exercise3;

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
        List<Country> countries = city_csv_reader.readCountriesFromCSV("C:\\Users\\Ahmed yamani\\Desktop\\Assignment_2\\src\\main\\java\\JUPAI4_Exercise3\\Countries.csv");
        CityDAO c=new CityDAO();
        List<Cities> cities=c.readCitiesFromCSV("C:\\Users\\Ahmed yamani\\Desktop\\Assignment_2\\src\\main\\java\\JUPAI4_Exercise3\\Cities.csv");
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
     Map<Integer, List<Cities>> collect_cities = cities.stream()
                .collect(Collectors.groupingBy(Cities::getCountry_code));
 List<Optional<Double>> highestPopulationPerCountry = collect_cities.values()
                .stream()//List<City>
                .map(cityList1 -> cityList1.stream()//city
                        .map(Cities::getPopulation)
                        .max(Double::compare)
                ).collect(Collectors.toList());
 
 Map<String, List<Cities>> collect_cities1 = cities.stream()
                .collect(Collectors.groupingBy(Cities::getContinent));
 List<Optional<Double>> highestPopulationPerContinent = collect_cities1.values()
                .stream()
                .map(cityList1 -> cityList1.stream()
                        .map(Cities::getPopulation)
                        .max(Double::compare)
                ).collect(Collectors.toList());
  
    //    System.out.println(highestPopulationPerCountry);
    //    System.out.println(highestPopulationPerContinent);
     //System.out.println(cities.stream().max(Comparator.comparingDouble((Cities m)->m.getPopulation())));

    };
    } 
    


    

