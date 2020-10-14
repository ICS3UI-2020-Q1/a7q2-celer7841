/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    factors(6);
    
  }

  public static void factors (int number){
    for(int i=1; i<=number; i++){
      if(number % i==0){
        System.out.println(i);
      }



    }
  }



}
