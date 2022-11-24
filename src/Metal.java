public abstract class Metal implements Recyclable {

    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.METAL;
    }

}
