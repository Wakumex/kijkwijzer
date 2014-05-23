/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kijkwijzer;

/**
 *
 * @author Fuck her right in the pussy
 */
public class filmlijst {
    /* Ik denk dat je kijkwijzer hier ook aan moet geven omdat dit in een ander java bestand staat. */
    Kijkwijzer kijkwijzer;
    String naam;
    String genre;
    int imdb;
   
    
    public filmlijst(String naam, String genre, int imdb)
    {
        this.naam=naam;
        this.genre=genre;
        this.imdb=imdb;
    }
    
    public String getNaam(){
        return naam;
    }
    public String getGenre(){
        return genre;
    }
    public int getImdb(){
        return imdb;
    }
    /* Plaatjes ook aangeven, Plaatjes staat in kijkwijzer.java vandaar de "return kijkwijzer.getPlaatjes();
       Dit volgt nog */

}
