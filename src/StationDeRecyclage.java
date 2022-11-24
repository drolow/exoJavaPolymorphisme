import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StationDeRecyclage {

    private List<Recyclable> objetsArrives = new ArrayList<>();

    private Map<MatiereRecyclee, Integer> matieresRecyclees = new HashMap<>();

    private List<Recyclable> objetsNonRecycles = new ArrayList<>();

    void arrivage(Recyclable objetRecyclable) {
        objetsArrives.add(objetRecyclable);
    }

    void recycler() {
        System.out.println("Début du recyclage des objets arrivés...");
        for (Recyclable objet : objetsArrives) {
            try {
                MatiereRecyclee matiereRecyclee = objet.recycle();
                System.out.println("L'objet " + objet + " a été recyclé en " + matiereRecyclee);
                Integer cpt = matieresRecyclees.putIfAbsent(matiereRecyclee, 1);
                if (cpt != null) {
                    matieresRecyclees.put(matiereRecyclee, cpt + 1);
                }
            } catch (ProduitNonRecyclableException e) {
                System.out.println("L'objet " + objet + " n'est pas recyclable !");
                objetsNonRecycles.add(objet);
            }
        }
        System.out.println("Fin du recyclage");
    }

    void afficherCompteurs() {
        System.out.println("Stocks de matières recyclées dans la station : ");
        for (MatiereRecyclee matiereRecyclee : matieresRecyclees.keySet()) {
            System.out.println("-" + matiereRecyclee + " : " + matieresRecyclees.get(matiereRecyclee));
        }

        System.out.println("Liste des objets non recyclés : ");
        objetsNonRecycles.stream().forEach(o -> System.out.println("-" + o));
    }
}
