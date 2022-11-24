public class PneuDeVelo implements Recyclable {

    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        throw new ProduitNonRecyclableException();
    }

    @Override
    public String toString() {
        return "pneu de vélo";
    }
}
