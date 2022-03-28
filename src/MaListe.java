import java.util.ArrayList;
import java.util.List;

public class MaListe {

    private List<Integer> tab;

    public MaListe(){
        this.tab = new ArrayList<Integer>();
    }

    public MaListe(List<Integer> l){
        this.tab = l;
    }

    public int taille(){
        return (this.tab.size());
    }

    public void ajout(int index, Integer elem){
        this.tab.add(index,elem);
    }

    public void ajoutFin(Integer elem){
        this.tab.add(elem);
    }

    public int element(int index){
        return (this.tab.get(index));
    }

    public int indice(Integer elem){
        return (this.tab.indexOf(elem));
    }

    public boolean estVide(){
        return (this.tab.isEmpty());
    }

    public void supprime(Integer elem){
        this.tab.remove(elem);
    }



}
