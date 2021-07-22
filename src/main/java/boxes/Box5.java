package boxes;

public class Box5 {
    float length;
    float width;
    int height;
    public boolean validate(float length,float width,int height) {
        boolean bln;
        this.length = length;
        this.width = width;
        this.height = height;
        if (length > 39.5 || width > 27.5 || height > 23) {
            return bln = false;
        } else {
            return bln = true;
        }
    }
}
