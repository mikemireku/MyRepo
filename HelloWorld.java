public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
	}
	
	public static int getNumOfLoonies(int changeNeeded){
		//return (changeNeeded%200)/100;
		return 1;
	}
	
	public static int getNumOfQuarters(int changeNeeded){
		return ((changeNeeded%200)%100)/25;
		//return 1;
	}
	
	public static int getNumOfDimes(int changeNeeded){
		return (changeNeeded%25)/10;
	}

}

