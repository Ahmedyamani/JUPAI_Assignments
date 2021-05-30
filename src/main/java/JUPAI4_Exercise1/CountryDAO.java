/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUPAI4_Exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed yamani
 */
public class CountryDAO {
    public List<Country>readCountriesFromCSV(String fileName) {
	
	File country_file=new File(fileName);
	List<String>lines=new ArrayList();
	List<Country> countries=new ArrayList<>();
	
	try {
		lines=Files.readAllLines(country_file.toPath());
		for (int i=1 ;i<lines.size();i++) {
			countries.add((createcountries(lines.get(i))));
		}	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return countries;
	
}
  private Country createcountries(String lines) {
  String[] metadata=lines.split(",");
  return new Country (metadata[0], Integer.parseInt(metadata[1]));
}
}

