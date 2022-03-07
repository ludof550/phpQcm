/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsport;

/**
 *
 * @author ludovic0
 */
public class Sport implements ISportCollectif, ISport
{
    private String nomSport;
    private int NbJoueur;
    public  Sport(String unNom,int unNb)
    {
        nomSport = unNom;
        NbJoueur = unNb;
    }

    
    

    /**
     * @param nomSport the nomSport to set
     */
    public void setNomSport(String nomSport) {
        this.nomSport = nomSport;
    }

    

    /**
     * @param NbJoueur the NbJoueur to set
     */
    public void setNbJoueur(int NbJoueur) {
        this.NbJoueur = NbJoueur;
    }

    @Override
    public String GetNomSport() {
        return nomSport;
    }

    @Override
    public String GetDescription() {
       return "sport = "+nomSport+" Nombre de joueur= "+ NbJoueur;

    }

    @Override
    public int GetNbJoueur() {
        return NbJoueur;
    }
   
    
    
}
