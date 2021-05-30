package JUPAI4_Excercise4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static javax.swing.Spring.height;

public class MainClass {
    public static void main(String[] args)throws FileNotFoundException {
        PyramidCSVDAO p= new PyramidCSVDAO();
        List<Double> SortedData = p.readPyramidsFromCSV("C:\\Users\\Ahmed yamani\\Desktop\\JUPAI4_Excercise4\\src\\main\\java\\ex4\\pyramids.csv").stream().sorted().collect(Collectors.toList());
        int size = SortedData.size();
        System.out.println("Size of Data = "+size );
        int Median = median(0,size);
        System.out.println("Median is "+Median+ "And its value is:" +SortedData.get(Median));
        int f = median(0, Median);
        System.out.println("Lower Quartile is in  = " + f +" And its value is: = "+SortedData.get(f));
        int s = median(Median+1 , size);
        System.out.println("Upper Quartile is in = " +s+" And its value is: = "+SortedData.get(s));
        System.out.println("InterQuartile is = " + (SortedData.get(s)-SortedData.get(f)));
            
        
        
}
    static int median(int s, int r)
    {
       int n = r - s + 1;
       n = (n + 1) / 2 - 1;
       return n + s;
    }
    }