public class Main {

  public static void main(String[] args) {
    int[] v = { 10, 9, 8, 7, 6, 5 };
    int[] x = { 11, 34, 23, 1, 3 };

    FindMedian fm = new FindMedian();
    System.out.println("find median  " + fm.find_median(v));
    System.out.println("find median " + fm.find_median(x));

  }
}
