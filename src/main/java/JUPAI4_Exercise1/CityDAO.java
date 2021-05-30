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
public class CityDAO {
    public List<Cities>readCitiesFromCSV(String fileName) {
	
	File city_file=new File(fileName);
	List<String>lines=new ArrayList();
	List<Cities> cities=new ArrayList<>();
	
	try {
		lines=Files.readAllLines(city_file.toPath());
		for (int i=1 ;i<lines.size();i++) {
			cities.add((createcountries(lines.get(i))));
		}	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return cities;
	
}
  private Cities createcountries(String lines) {
  String[] metadata=lines.split(",");
  return new Cities (metadata[0], Integer.parseInt(metadata[1]),metadata[2], (int) Double.parseDouble(metadata[3]),Integer.parseInt(metadata[4]));
}
}

