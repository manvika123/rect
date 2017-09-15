package rect;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float width = scan.nextFloat();
        float height = scan.nextFloat();

        System.out.println("area of rectangle is "+ (width*height));
        System.out.println("perimeter of rectangle is"+ (2*(width+height)));
    }
}
