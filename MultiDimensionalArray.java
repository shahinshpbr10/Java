public class MultiDimensionalArray {
  public static void main(String[] args) {
    int multiarray[][] = new int[3][3];
    multiarray[0][0] = 1;
    multiarray[0][1] = 2;
    multiarray[0][2] = 3;
    multiarray[1][0] = 4;
    multiarray[1][1] = 5;
    multiarray[1][2] = 6;
    multiarray[2][0] = 7;
    multiarray[2][1] = 8;
    multiarray[2][2] = 9;

    for (int i = 0; i < multiarray.length; i++) {
      for (int j = 0; j < multiarray[i].length; j++) {
        System.out.println(multiarray[i][j]);
      }
    }

  }
}