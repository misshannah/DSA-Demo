
class Main {
  static String[] nemo = {"nemo"};
  static String[] everyone = {"dory", "nigel","dory", "nigel","dory", "nigel","dory", "nigel"};
  static long t1,t0;
  public static void main(String[] args) {
    findNemo(nemo);
    t1 = System.currentTimeMillis();
    
    t0 = System.currentTimeMillis();

  }
  public static void findNemo(String [] arr) {
    for (int i = 0; i < nemo.length; i ++){
      if (nemo[i] == "nemo" )
    System.out.println("Nemo exists");
    }
    System.out.println("Call to find Nemo took " + (t1 - t0) + " milliseconds");
  }
}