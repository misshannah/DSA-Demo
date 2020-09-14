import java.util.Arrays;

class Main {
  static String[] nemo = {"nemo"};
  static String[] everyone = {"dory", "nigel","dory", "nigel","dory", "nigel","dory", "nigel"};
  
  public static void main(String[] args) {
    //findNemo(nemo);
    String[] large = new String[1000];
        Arrays.fill(large, "nemo");
        
   findNemo(large);

  }
  public static void findNemo(String [] arr) {
    for (int i = 0; i < nemo.length; i ++){
    System.out.println("Nemo exists");
    }
  }
    
}