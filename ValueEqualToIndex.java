import java.util.ArrayList;

class ValueEqualToIndex {
  ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
    // code here
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i + 1) {
        arrayList.add(i + 1);
      }
    }
    return arrayList;
  }
}