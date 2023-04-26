package ie.tudublin;

import java.util.ArrayList;

import javax.swing.JTable.PrintMode;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	private String line;

	null = 14;

    public String[] writeSonnet()
    {
        return null;
    }

	public void printMode() {

		

	}

	public void loadFile(){
		loadStrings("filename.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words
		String w;
		w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		String s;
		s.toLowerCase(); // Convert a string to lower case 

	}

	// public void FindWord(str){



	// }

	// public String findFollow(str){

	// 	return null;
	// }

	public void setup() {
		colorMode(HSB);
 
	}

	public void keyPressed() {
		if(key == ' '){

			writeSonnet();

		}

	}



	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

}





