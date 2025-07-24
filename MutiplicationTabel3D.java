public class MutiplicationTabel3D {
    public static void main(String[] args) {
        // Declaring a 2D array for the multiplication table
        int[][] multiplicationTable = new int[3][3];

        // Filling the array with the product of row and column indices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1); // Multiplying (row+1) * (column+1)
            }
        }

        // Printing the multiplication table neatly
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiplicationTable[i][j] + "\t"); // Tab space for neat formatting
            }
            System.out.println(); // Newline after each row
        }
    }
}
