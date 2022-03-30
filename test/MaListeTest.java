import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaListeTest {

    @Test
    public void test_constructeurVie(){
        MaListe l = new MaListe();
        assertEquals(0, l.taille(),"La taille de la liste devrait etre 0");
    }

    @Test
    public void test_AjoutElement(){
        MaListe l = new MaListe();
        l.ajoutFin(2);
        assertEquals(1, l.taille(), "La taille de la liste devrait etre 1");
        assertEquals(2, l.element(0), "La liste devrait contenir un element '2' en position 0");
    }

    @Test
    public void test_AjoutElement2(){
        MaListe l = new MaListe();
        l.ajoutFin(2);
        assertEquals(0, l.indice(2), "La liste devrait contenir un element '2' en fin");
    }





}