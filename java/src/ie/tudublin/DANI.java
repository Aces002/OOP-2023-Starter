package ie.tudublin;

import java.util.ArrayList;

import javax.swing.JTable.PrintMode;

import processing.core.PApplet;

public class DANI extends PApplet {


	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    public String[] writeSonnet()
    {
        return null;
    }

	public void printMode() {

		

	}
	

	public void loadFile(String small) {
		String[] liness = loadStrings("small.txt");
		for (String line : liness) {
			String[] words = split(line, ' ');
			for (String w : words) {
				w.replaceAll("[^\\w\\s]", "");
				w.toLowerCase();
			}
		}
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





