// type_of_Array[][] array_Name = new type_of_array[row_of_array][column_of_array]

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][1] = 56;
        int indexNumber = 56;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (indexNumber == numbers[i][j]) {
                    System.out.printf("Found at index %d %d %n", i, j);
                } else {
                    System.out.println("Searching..");
                }
            }
        }

    }
}
