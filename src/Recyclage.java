public class Recyclage {

    public static void main(String[] args) {
        StationDeRecyclage station = new StationDeRecyclage();

        BoiteDeConserve boiteDeConserve = new BoiteDeConserve();
        BouteilleEnPET bouteilleEnPET = new BouteilleEnPET();
        TasDeFeuille tasDeFeuille = new TasDeFeuille();
        BoiteEnVerre boiteEnVerre = new BoiteEnVerre();
        BoiteDeSardines boiteDeSardines = new BoiteDeSardines();
        VieuxJournal vieuxJournal = new VieuxJournal();
        PneuDeVelo pneuDeVelo = new PneuDeVelo();

        station.arrivage(boiteDeConserve);
        station.arrivage(bouteilleEnPET);
        station.arrivage(tasDeFeuille);
        station.arrivage(boiteEnVerre);
        station.arrivage(boiteDeSardines);
        station.arrivage(vieuxJournal);
        station.arrivage(pneuDeVelo);

        station.recycler();
        station.afficherCompteurs();
    }
}
