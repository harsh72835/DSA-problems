import java.util.Arrays;

class FindMedian {
  public int find_median(int[] v) {
    // Code here
    Arrays.sort(v); /// complexity o(nlogn)

    if (v.length % 2 != 0) {
      int index = v.length / 2;
      return v[index];
    } else {
      int index = (int) Math.floor(v.length / 2);
      return (v[index - 1] + v[index]) / 2;
    }
  }

}