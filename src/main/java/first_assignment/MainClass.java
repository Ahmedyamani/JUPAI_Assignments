package first_assignment;

import java.io.FileNotFoundException;
import java.util.List;

public class MainClass {
    public static void main(String[] args)throws FileNotFoundException {
         
  PyramidCSVDAO pyrmd_csv_reader = new PyramidCSVDAO();
        List<Pyramid> pyramids = pyrmd_csv_reader.readPyramidsFromCSV("C:\\Users\\Ahmed yamani\\Downloads\\pyramids.csv");
        
        
        for(Pyramid p: pyramids) {
            System.out.println(p);
            
        }
}
    static int median(int StartIndex, int r)
    {
       int n = r - StartIndex + 1;
       n = (n + 1) / 2 - 1;
       return n + StartIndex;
    }
    }