package first_assignment;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
class PyramidCSVDAO {
    public List<Pyramid>readPyramidsFromCSV(String fileName) {
	
	File pyramids_file=new File(fileName);
	List<String>lines=new ArrayList();
	List<Pyramid> pyramids=new ArrayList<>();
	
	try {
		lines=Files.readAllLines(pyramids_file.toPath());
		for (int i=1 ;i<lines.size();i++) {
			pyramids.add(createPyramid(lines.get(i)));
		}	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return pyramids;
	
}

private Pyramid createPyramid(String line) {
  String[] metadata=line.split(",");
  double height=Double.NaN;
  if(!"".equals(metadata[7]))
   height=Double.parseDouble(metadata[7]);
  return new Pyramid(metadata[0], metadata[2], metadata[4], height);
}
}

