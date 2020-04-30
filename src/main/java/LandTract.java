/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class LandTract{
    private double width;
    private double length;

    public LandTract(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "LandTract{" + "width=" + width + ", length=" + length + '}';
    }

    public double Area(double Length, double Width){
    
        return Length*Width;
    }


    @Override
    public boolean equals(Object obj) {
      LandTract incomingLandTract = (LandTract)obj;
      if(incomingLandTract.getLength() == this.getLength() || incomingLandTract.getWidth() == this.getWidth())
      {
          return true;
      }
      else {
          return false;
      }
              
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        return hash;
    }

    

           
}
