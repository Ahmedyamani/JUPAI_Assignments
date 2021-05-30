/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed yamani
 */
package JUPAI4_Excercise4;
public class Pyramid {
    String pharaoh;
    String modern_name;
    String site;
    double height;
    public Pyramid(String pharaoh,String modern_name,String site,double height){
        super();
        this.pharaoh=pharaoh;
        this.modern_name=modern_name;
        this.site=site;
        this.height=height;
         }

    Pyramid(double height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
	return "Pyramids [modern_name=" + modern_name + ", site=" + site + ", pharaoh=" + pharaoh + ", height=" + height
			+ "]";
    
}
}
