import java.io.*;
import java.util.*;

class Result {

  public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int totalPairs = 0;
    ar.sort(null);

    for(int i = 0; i < n-1; i++){
      if (ar.get(i).equals(ar.get(i+1))){
        totalPairs++;
        i++;
      }
    }

    return totalPairs;
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {

    System.out.println(Result.sockMerchant(3, Arrays.asList(1,1,1)));

  }
}
