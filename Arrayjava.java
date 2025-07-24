public class Arrayjava {

  public static int sumofArray(int[] arraydemo) {
    int sum = 0;
    for (int i = 0; i < arraydemo.length; i++) {
      sum = sum + arraydemo[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int arraydemo[] = new int[5];
    arraydemo[0] = 1;
    arraydemo[1] = 5;
    arraydemo[2] = 3;

    for (int i = 0; i < arraydemo.length; i++) {
      if (arraydemo[i] == 0) {
        System.out.println("Array is empty at index:" + (i + 1));
      } else {
        System.out.println(arraydemo[i]);
      }
    }
    int sum = sumofArray(arraydemo);
    System.out.println("Sum of array is :" + sum);

  }

}