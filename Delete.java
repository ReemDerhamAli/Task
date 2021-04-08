import java.util.Arrays;

/**
 * Created by Alia on 27/02/2021.
 */
public class Delete {
    int y[]={2,4,6,8,10};
    public void delete(int y[], int indx){
        if (indx>=0 && indx<y.length){
            int i=indx;
            while (i<y.length){
                y[i]=y[i+1];
                i++;
            }
            y[i]=0;
        }
    }

    public static void main(String[] args) {
        Delete d= new Delete();
        System.out.println(Arrays.toString(d.y));
        d.delete(d.y,2);
        System.out.println(Arrays.toString(d.y));
    }
}
