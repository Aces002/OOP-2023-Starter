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

		// i: love(2) 
		// love: star(1) is(1) tu(1) 
		// star: trek(1)
		// trek:
		// is: love(1)
		// tu: dublin(1)
		// dublin:

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

	public void FindWord(){



	}

	public String findFollow(){

		return null;
	}

	public void setup() {
		colorMode(HSB);
 
	}

	//Add code to generate a new sonnet on keyPress
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





