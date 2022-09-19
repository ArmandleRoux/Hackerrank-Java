import java.util.Arrays;
import java.util.List;

public class jumpingOnClouds {
  public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    int steps = 0;
    for(int i =0; i < c.size()-1; i++){
      if (i < c.size() - 2 && c.get(i+2).equals(0)){
        i++;
      }
      steps++;
    }
    return steps;
  }

  public static void main(String[] args) {

    System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,0, 0, 1, 0, 1, 0, 0)));
  }
}
