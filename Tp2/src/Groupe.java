import java.util.ArrayList;
import java.util.List;

public class Groupe{

    private List<Personne> persos;
        public Groupe() {
        this.persos = new ArrayList<Personne>();
        }

        public void ajouterPerso(Personne p) {
            if (this.persos.indexOf(p)==-1){
                this.persos.add(p);
            }
        }

        public void afficher(){
            int p = 0;
            while (p<this.persos.size()){
                System.out.println((p+1)+": "+this.persos.get(p));
                p++;
            }        }
}

