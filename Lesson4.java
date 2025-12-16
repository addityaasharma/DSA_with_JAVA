//loops

/*
1. for loop (intitalization; condition; updation)
2. while loop (condition)
3. do while loop  : do {} while (condition)
 */
public class Lesson4 {

    public static void main(String[] args) {
        
        // for loop syntax
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while loop syntax
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // do while condition
        int l = 1;
        do {
            System.out.println(l);
            l++;
        } while (l < 9);

    }
}
