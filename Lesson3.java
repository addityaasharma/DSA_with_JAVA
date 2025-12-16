// conditional statement

/*
1. if, else
2. else if
3. switch n break
 */
class Lesson3 {

    public static void main(String args[]) {
        int age = 2;
        int b = 20;

        if (age > b) {
            System.out.println("even");
        } else if (age < b) {
            System.out.println("odd");
        } else {
            System.out.println("Error");
        }

        switch (age) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Why");
                break;
        }
    }
}
