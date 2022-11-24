public class BouteilleEnPET implements Recyclable {

    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.PET;
    }

    @Override
    public String toString() {
        return "bouteille en PET";
    }
}
