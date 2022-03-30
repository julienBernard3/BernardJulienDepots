import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InterclassementTest {

    @Test
    void lentierInterclasser() {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4;

        l1.add(1);
        l1.add(2);
        l1.add(5);
        l1.add(8);
        l1.add(8);
        l1.add(9);
        l1.add(11);

        l2.add(3);
        l2.add(7);
        l2.add(7);
        l2.add(8);
        l2.add(10);

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(5);
        l3.add(7);
        l3.add(7);
        l3.add(8);
        l3.add(8);
        l3.add(8);
        l3.add(9);
        l3.add(10);
        l3.add(11);

        l4= Interclassement.lentierInterclasser(l1,l2);
        System.out.println("Liste 1");
        System.out.println(l1);
        System.out.println("Liste 2");
        System.out.println(l2);
        System.out.println("Liste 3: resultat attendus");
        System.out.println(l3);
        System.out.println("Liste 4: resultat obtenus");
        System.out.println(l4);
        assertEquals(l3, l4, "La liste obtenus n'est pas la bonne");


    }
}