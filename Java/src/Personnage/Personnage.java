package Personnage;

import Personnage.Classe.*;
import Personnage.Objets.*;
import Personnage.Race.*;

import java.util.Scanner;
import java.util.Vector;

public class Personnage implements IPersonnage{
    private String nom, prenom;
    private IRace race;
    private IClasse classe;
    private int niveau;
    private int[] stats=new int[6];
    private Vector<IObjets> inventaire=new Vector<IObjets>();
    private IArme armeEquipe;
    private IArme armeSecondaire;
    private Scanner clavier=new Scanner(System.in);

    /**
     * Creationdu personnage, l'utilisateur choisiras sa race et sa classe, une arme de base seras equipe en fonction de sa classe
     * son niveau est initialiser a 1 et son inventaire est vide, sauf ses items de classe.
     * @param nom
     * @param prenom
     */
    public Personnage(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        //Choix de la race
        System.out.println("Choisissez votre race: (1) Humain, (2) Elfe,(3) Gnome,(4) Nain,(5) Demi-Elfe,(6) Demi-Orque,(7) Helfelin");
        int raceClavier = clavier.nextInt();
        while(raceClavier>7 || raceClavier<1){
            System.out.println("Race non-existante");
            System.out.println("Choisissez votre race: (1) Humain, (2) Elfe,(3) Gnome,(4) Nain,(5) Demi-Elfe,(6) Demi-Orque,(7) Helfelin");
            raceClavier=clavier.nextInt();
        }
        switch (raceClavier) {
            case 1 -> race = new Humain();
            case 2 -> race = new Elfe();
            case 3 -> race = new Gnome();
            case 4 -> race = new Nain();
            case 5 -> race = new DemiElfe();
            case 6 -> race = new DemiOrque();
            case 7 -> race = new Halfelin();
        }
        //choix de la classe
        System.out.println("Choisissez maintenant une classe: (1) Paladin, (2) Barbare,(3) Rodeur,(4) Ensorceuleur,(5) Druide,(6) Barde,(7) Moine, (8) Sorcier");
        int classeClavier=clavier.nextInt();
        while(classeClavier>8 || classeClavier<1){
            System.out.println("Classe non-existante");
            System.out.println("Choisissez maintenant une classe: (1) Paladin, (2) Barbare,(3) Rodeur,(4) Ensorceuleur,(5) Druide,(6) Barde,(7) Moine, (8) Sorcier");
            classeClavier=clavier.nextInt();
        }
        switch (raceClavier) {
            case 1 -> classe = new Paladin();
            case 2 -> classe = new Barbare();
            case 3 -> classe = new Rodeur();
            case 4 -> classe = new Ensorceleur();
            case 5 -> classe = new Druide();
            case 6 -> classe = new Barde();
            case 7 -> classe = new Moine();
            case 8 -> classe = new Sorcier();
        }
        //ajout des items de depart des classes au personnage
        Vector<IObjets> temp = classe.getObjets();
        inventaire.addAll(temp);
        //La premiere arme de l'inventaire est equipé
        for(int i=0; i<inventaire.size();i++){
            if(inventaire.get(i).getType().equals(Type.ARME)){
                armeEquipe= (IArme) inventaire.get(i);
            }
        }
        niveau=1;
    }

    /**
     * statistique generale du personnage (bonus racial et arme equipe)
     * @return
     */
    public int[] getStats() {
        int[] stats=new int[6];
        int j=0;
        for(int i:race.getStats()){
            stats[j]=i;
            j++;
        }
        for(int i:armeEquipe.getStats()){
            stats[j]=i;
            j++;
        }
        return stats;
    }

    /**
     * nom du personnage
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * prenom du personnage
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * inventaire du personnage
     * @return
     */
    public Vector<IObjets> getInventaire() {
        return inventaire;
    }

    /**
     * arme actuellement equipe par le personnage
     * @return
     */
    public IArme getArmeEquipe() {
        return armeEquipe;
    }

    /**
     * niveau du personnage
     * @return
     */
    public int getNiveau(){
        return niveau;
    }

    /**
     * Change l'arme, elle equiperas l'arme de plus haute rarete.
     * @param armeDesire type d'arme que le joueur veux equiper a son personnage
     */
    public void cahngerArme(TypeArme armeDesire) {
        Vector<IObjets> temp = classe.getObjets();
        int rarete=0;
        int i=0;
        boolean legendaireTrouver=false;
        System.out.println("(1) Primaire ou (2) secondaire? ");
        int arme=clavier.nextInt();
        while (arme>2 || arme <1){
            System.out.println("(1) Primaire ou (2) secondaire? ");
            arme=clavier.nextInt();
        }
        if(arme == 1) {
            while (i < temp.size() && !legendaireTrouver) {
                if (temp.get(i) instanceof IArme) {
                    IArme armeTemp = (IArme) temp.get(i);
                    if (armeTemp.getTypeArme().equals(armeDesire)) {
                        if (armeTemp.getRarete().equals(Rare.COMMUNE)) {
                            rarete = 1;
                        }
                        if (armeTemp.getRarete().equals(Rare.PEUCOMMUNE)) {
                            rarete = 2;
                        }
                        if (armeTemp.getRarete().equals(Rare.RARE)) {
                            rarete = 3;
                        }
                        if (armeTemp.getRarete().equals(Rare.TRESRARE)) {
                            rarete = 4;
                        }
                        if (armeTemp.getRarete().equals(Rare.LEGENDAIRE)) {
                            rarete = 5;
                            legendaireTrouver = true;
                        }
                    }
                }
            }
            if (rarete != 0) {
                armeEquipe = (IArme) temp.get(i);
            } else {
                System.out.println("Il n'y a pas d'autre arme dans votre inventaire");
            }
        }else if(armeDesire.equals(TypeArme.BOUCLIER) || armeDesire.equals(TypeArme.DAGUE)){
            while (i < temp.size() && !legendaireTrouver) {
                if (temp.get(i) instanceof IArme) {
                    IArme armeTemp = (IArme) temp.get(i);
                    if (armeTemp.getTypeArme().equals(armeDesire)) {
                        if (armeTemp.getRarete().equals(Rare.COMMUNE)) {
                            rarete = 1;
                        }
                        if (armeTemp.getRarete().equals(Rare.PEUCOMMUNE)) {
                            rarete = 2;
                        }
                        if (armeTemp.getRarete().equals(Rare.RARE)) {
                            rarete = 3;
                        }
                        if (armeTemp.getRarete().equals(Rare.TRESRARE)) {
                            rarete = 4;
                        }
                        if (armeTemp.getRarete().equals(Rare.LEGENDAIRE)) {
                            rarete = 5;
                            legendaireTrouver = true;
                        }
                    }
                }
            }
            if (rarete != 0) {
                armeSecondaire = (IArme) temp.get(i);
            } else {
                System.out.println("Il n'y a pas d'autre arme dans votre inventaire");
            }
        }else{
            System.out.println("Aucune arme ne peux etre euquipe");
        }
    }

    public String toString(){
        return nom+" "+prenom+" ";
    }
}