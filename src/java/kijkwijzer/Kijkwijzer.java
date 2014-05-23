package kijkwijzer;

import java.util.ArrayList;

/**
 *
 * @author Fuck her right in the pussy
 */
public class Kijkwijzer {
    String genre; //horror, detective, actie, romantisch, komisch
    
    private ArrayList<filmlijst> array;
    String html = "";
    String imdbsite = "http://www.imdb.com/title/tt";
    
    public Kijkwijzer(){
        array = new ArrayList<filmlijst>();
    }
    
        public void voegfilmtoe(){
        array.add(new filmlijst("X-Men: Days of Future Past","horror", 1877832));
        array.add(new filmlijst("Blended","detective", 1086772)); 
        array.add(new filmlijst("Cold in July","actie", 1179031)); 
        array.add(new filmlijst("Stand clear of the closing doors","romantisch", 2405372)); 
        array.add(new filmlijst("Words and Pictures","horror", 2380331)); 
        array.add(new filmlijst("The angriest man in Brooklyn","actie", 1294970)); 
    }
 
    public Kijkwijzer(String genre) {
        this.genre = genre;
    }
    
    public String getPlaatjes() {
        String pre = "<img class='kijkwijzer' src='images/";
        String post = ".jpg'>";
        if (genre.equals("horror")) {
            return pre + "5" + post + pre + "4" + post + pre + "3" + post;
        } else if (genre.equals("detective")) {
            return pre + "5" + post + pre + "6" + post;
        } else if (genre.equals("actie")) {
            return pre + "3" + post + pre + "4" + post + pre + "16" + post;
        } else if (genre.equals("romantisch")) {
            return pre + "1" + post + pre + "6" + post;
        } else if (genre.equals("komisch")) {
            return pre + "1" + post;
        } else {
            return "";
        }
    }
    public String genereerPagina(){
        
        for(filmlijst filmlijst : array)
        { 
        html += "<div class=\"filmstuffz\">"
             +""+ filmlijst.getNaam()+"<br />"
             + "imdbwebsite" + filmlijst.getImdb()+"<br />"
             + "Genre "+ filmlijst.getGenre()+"</br /></br />"
             + "</div>";
        }
     
        return html; 
    }
    

    
}
     
