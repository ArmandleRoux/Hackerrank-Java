public class InfiniteString {

  public static long repeatedString(String s, long n) {
    // Write your code here
    long result = 0;

    if(s.equals("a")){
      return n;
    }
    int totalAInString = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'a'){
        totalAInString++;
      }
    }
    result = totalAInString * (n/s.length());
    long remainder = n%s.length();
    for(int i = 0; i< remainder; i++){
      if (s.charAt(i) == 'a'){
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(repeatedString("aba", 11));
  }

}
