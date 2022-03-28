import static org.junit.jupiter.api.Assertions.*;
import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

class MaListeTest {

    public void test_constructeurVie(){
        MaListe l = new MaListe();
        assertEquals("La taille de la liste devrait etre 0", 0, l.taille());
    }

    public void test_AjoutElement(){
        MaListe l = new MaListe();
        l.ajoutFin(1);
        assertEquals("La taille de la liste devrait etre 1", 1, l.taille());
    }





    public static void main(String[] args)
    {
        lancer(new MaListeTest(), args);
    }
}