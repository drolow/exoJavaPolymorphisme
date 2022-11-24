public class TasDeFeuille implements Recyclable {

    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.COMPOST;
    }

    @Override
    public String toString() {
        return "tas de feuilles";
    }
}
