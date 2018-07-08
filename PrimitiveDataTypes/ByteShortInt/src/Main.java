public class Main {
    public static void main(String[] args) {
	//Under Scores can be in integers & other numbers
	int kyleNumber = 1_234;


	//This expression has been casted because java,
	//changes the type to integers when doing the operations.
	byte divided = (byte) (kyleNumber/2);	

	System.out.println(divided);
	
	byte kyleByte = 127;
	System.out.println(kyleByte);
	System.out.println("Hello World");
	System.out.println(kyleNumber);
	
    }

}
