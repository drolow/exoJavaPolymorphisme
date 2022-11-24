public enum MatiereRecyclee {
    COMPOST("compost"),
    METAL("métal"),
    VERRE("verre"),
    PET("plastique PET"),
    PATE_A_PAPIER("pâte à papier");

    private String libelle;

    MatiereRecyclee(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return libelle;
    }
}
