// Arrays are non- primitive data types
// type_of_array[] name_of_array = new type_of_array[size_of_array] - { new is use to tell that we want space in memory for new element }

public class Arrays {

    public static void main(String arhs[]) {
        int[] marks = new int[4];  // bracket can also be written after array name and is completely valid.
        String[] cities = {"Berlin", "London", "Tokyo"}; // this is also valid in array
        int x = 99;
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        marks[3] = 100;
        for (int i = 0; i < marks.length; i++) {
            if (x == marks[i]) {
                System.out.println("Find at index" + i);
                break;
            }else{
                System.out.println("Searching..");
            }
        }
    }
}
