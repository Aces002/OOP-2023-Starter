package ie.tudublin;

public class Follow {

		private int aCount;
		private String aString;

        public Follow(int count, String string) {
        aCount = count;
        aString = string;
        }

        public int getCount() {
            return aCount;
        }

        public String getString() {
            return aString;
        }

        public void setCount(int count) {
            aCount = count;
        }

        public void setString(String string) {
            aString = string;
        }

        public void printValues() {
            System.out.println("Number: " + aCount);
            System.out.println("String: " + aString);
        }
				
	
    
}
