package boxes;

public class Box3 {
    float length;
    float width;
    int height;
    public boolean validate(float length,float width,int height) {
        boolean bln ;
        this.length = length;
        this.width = width;
        this.height = height;
        if(length>23||width>14||height>13){
           return bln=false;
        }
        else {
            return bln=true;
        }

    }
}
