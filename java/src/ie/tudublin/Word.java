package ie.tudublin;

import java.util.ArrayList;


// this class for word 
public class Word {

    public String word;
    ArrayList<Follow> follow = new ArrayList<Follow>();

    public void word(String word){

        this.word = word;
        this.follow = new ArrayList<Follow>();

    }

    public String getWord(){

        return word;
    }

    public String toString(){

        return word + follow;
  
        
    }
 







    
}

