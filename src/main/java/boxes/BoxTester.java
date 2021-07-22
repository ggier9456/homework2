package boxes;

import javax.swing.*;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        String letter;
        float length;
        float width;
        int height;
        Scanner sca=new Scanner(System.in);
        Box3 box3 =new Box3();
        Box5 box5 =new Box5();
        System.out.println("plz choice Box: (A) Box3 / (B) Box5");
        letter= sca.next();
        if(letter.equals("A")){
            System.out.println("plz enter object's length:");
            length= sca.nextFloat();
            System.out.println("plz enter object's width:");
            width=sca.nextFloat();
            System.out.println("plz enter object's height");
            height=sca.nextInt();

            if(box3.validate(length,width,height)==true){
                System.out.println("Box3 OK!!");
            }
            else {
                System.out.println("Your object too big!!");
                }
            }
        else if (letter.equals("B")){
            System.out.println("plz enter object's length:");
            length= sca.nextFloat();
            System.out.println("plz enter object's width:");
            width=sca.nextFloat();
            System.out.println("plz enter object's height");
            height=sca.nextInt();
            if(box5.validate(length,width,height)==true){
                System.out.println("Box5 OK!!");
            }
            else {
                System.out.println("Your object too big!!");
            }
        }
        else{
            System.out.println("plz choice the box!!");
        }

    }
}
