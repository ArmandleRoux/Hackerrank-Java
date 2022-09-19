import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {


  public static List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
    if (d >= a.size()){
      d = d%a.size();
    }
    List<Integer> newList = new ArrayList<>(a.subList(d, a.size()));
    newList.addAll(a.subList(0, d));
    return newList;
  }

  public static void main(String[] args) {
    System.out.println(rotLeft(Arrays.asList(1,2,3,4,5), 54));
  }

}
