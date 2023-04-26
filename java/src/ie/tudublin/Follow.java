package ie.tudublin;

public class Follow {

		private int myNumber;
		private String myString;

        public Follow(int number, String string) {
        myNumber = number;
        myString = string;
        }

        public int getNumber() {
            return myNumber;
        }

        public String getString() {
            return myString;
        }

        public void setNumber(int number) {
            myNumber = number;
        }

        public void setString(String string) {
            myString = string;
        }

        public void printValues() {
            System.out.println("Number: " + myNumber);
            System.out.println("String: " + myString);
        }
				
	
    
}
