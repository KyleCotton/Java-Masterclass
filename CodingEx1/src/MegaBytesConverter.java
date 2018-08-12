public class MegaBytesConverter {
    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(0);
	
    }

    
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
      String message = "";
      int megaBytes = 0;
      int kiloBytesNew = 0;

      if (kiloBytes < 0) {
	  message = "Invalid Value";
      }
      else {
	  megaBytes = (int) (kiloBytes / 1024);
	  kiloBytesNew = (int) (kiloBytes % 1024);

	  message = kiloBytes + "KB = " + megaBytes + "MB and " + kiloBytesNew + " KB";
      
      }

      System.out.println(message);
      
     
  }
}
