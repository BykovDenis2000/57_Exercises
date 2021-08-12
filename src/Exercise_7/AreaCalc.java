package Exercise_7;

public class AreaCalc {
    public int length;
    public int width;

    public AreaCalc(){}
    public AreaCalc(String length,String width){
        this.length = Integer.parseInt(length);
        this.width = Integer.parseInt(width);
    }
    public String areaCalc(){
        String res = "";
        if (length < 0 || width < 0) {
            res = "Incorrect numbers";
        } else {
            double area = ((float) length * (float) width) * 0.0929;
            res = "The area is\n" + (length * width) + " square feet\n" + area + " square meters";
        }
        return res;
    }
}
