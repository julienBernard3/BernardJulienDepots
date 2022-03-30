import java.util.ArrayList;
import java.util.List;

public class Interclassement {

    public static ArrayList lentierInterclasser(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> l3 = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1<l1.size() && p2<l2.size()){
            int e1 = l1.get(p1);
            int e2 = l2.get(p2);
            if (e1<e2){
                l3.add(e1);
                p1++;
            }else {
                l3.add(e2);
                p2++;
            }
        }
        if (p1>=l1.size()){
            while(p2<l2.size()){
                l3.add(l2.get(p2));
                p2++;
            }
        }else {
            while(p1<l1.size()){
                l3.add(l1.get(p1));
                p1++;
            }
        }
        return l3;
    }



}
