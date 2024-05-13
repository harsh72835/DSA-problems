public class Main {

  public static void main(String[] args) {
    int[] v = { 10, 9, 8, 7, 6, 5 };
    int[] x = { 11, 34, 23, 1, 3 };

    FindMedian fm = new FindMedian();
    System.out.println("find median  " + fm.find_median(v));
    System.out.println("find median " + fm.find_median(x));

    ValueEqualToIndex vEqualToIndex = new ValueEqualToIndex();
    System.out.println(vEqualToIndex.valueEqualToIndex(x, 5));

    JavaInheritance javaInheritance = new JavaInheritance();
    System.out.println(javaInheritance.task(384, 887));

    

  }
}
