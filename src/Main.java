/*
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestioneAuto auto = new GestioneAuto();
        boolean a = true;
        String targa;
        do{
            System.out.println("1 aggiungi un'auto', 2 visualizzi automobili, 3 rimuovi auto, 4 esci");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta){
                case 1:
                    System.out.println("Inserisci marca");
                    String marca = scanner.nextLine();
                    System.out.println("Inserisci modello");
                    String modello = scanner.nextLine();
                    System.out.println("Inserisci targa");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci cilindrata");
                    int cilindrata = scanner.nextInt();
                    auto.aggiungiAuto(marca,modello,targa,cilindrata);
                    scanner.nextLine();
                    break;

                case 2:
                    auto.visualizzazioneAuto();
                    break;

                case 3:
                    System.out.println("Inserire targa da eliminare");
                    targa = scanner.nextLine();
                    auto.rimuovereAuto(targa);
                    break;

                case 4:
                    a = false;
                    break;

                default:
                    System.out.println("Comando non riconosciuto");
            }
        } while(a);
    }
}