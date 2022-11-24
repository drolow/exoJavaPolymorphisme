public class BoiteEnVerre implements Recyclable {

    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.VERRE;
    }

    @Override
    public String toString() {
        return "boite en verre";
    }
}
