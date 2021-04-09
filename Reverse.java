/**
 * Created by Alia on 28/02/2021.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Reverse {
    public static void main(String[] args) {
        List colors= new ArrayList(Arrays.asList(2,4,6,8,10));
        System.out.println("befor:"+colors);
        int j=colors.size()-1;
        for (int i = 0; i <j ; i++) {
          colors.add(i, colors.remove(j));
        }
        System.out.println("After :"+ colors);
    }
}
