/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUPAI5;

import java.io.IOException;
import tech.tablesaw.api.Table;
import joinery.DataFrame;

/**
 *
 * @author Ahmed yamani
 */
public class tablesawtitanic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Table titanicdata=Table.read().csv("C:\\Users\\Ahmed yamani\\Desktop\\JUPAI5_Assignment\\src\\main\\java\\mypkg\\titanic.csv");
        System.out.println(titanicdata.summary());
        System.out.println(titanicdata.shape());
        System.out.println(titanicdata.columnNames());
        DataFrame <Object> df = DataFrame.readCsv("C:\\Users\\Ahmed yamani\\Desktop\\JUPAI5_Assignment\\src\\main\\java\\mypkg\\titanic.csv");
        df=df.retain("pclass", "name", "sex", "age");
        System.out.println(df.mean());
        System.out.println(df.max());
        System.out.println(df.min());
       DataFrame <Object> df2= DataFrame.readCsv("C:\\Users\\Ahmed yamani\\Desktop\\JUPAI5_Assignment\\src\\main\\java\\mypkg\\titanic.csv");
        df2=df2.retain("survived","sipsip","parch","name");
        System.out.println(df2.join(df,DataFrame.JoinType.INNER,0).describe());
        
        
    }
    
}
