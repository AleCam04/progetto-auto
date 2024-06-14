public class GestioneAuto {

    private int numeroAuto;
    private Auto[] automobili;

    public GestioneAuto() {
        this.automobili = new Auto[10];
        this.numeroAuto = 0;
    }

    public void aggiungiAuto(String marca, String modello, String targa, int cilindrata) {
        Auto auto = new Auto(marca, modello, targa, cilindrata);
        if (numeroAuto < automobili.length) {
            automobili[numeroAuto] = auto;
            numeroAuto++;
        } else {
            System.out.println("Capacità massima raggiunta");
        }
    }

    public void rimuovereAuto(String targa){
        for(int i = 0; i < numeroAuto; i++){
            Auto auto = automobili[i];
            if(auto.getTarga().equals(targa)){
                automobili[i] = null;
                System.out.println("l'auto con la targa: " + targa + " è stato rimossa con successo");
            } else {
                System.out.println("Questo targa non esiste");
            }
        }
    }

    public void ricercaTarga(String targa){
        for(int i = 0; i < numeroAuto; i++){
            Auto auto = automobili[i];
            if(auto.getTarga().equals(targa)){
                System.out.println(auto.toString());
            } else {
                System.out.println("Questa targa non esiste");
            }
        }
    }

    public void visualizzazioneAuto(){
        for(int i = 0; i < numeroAuto; i++){
            System.out.println(automobili[i].toString());
        }
    }

}