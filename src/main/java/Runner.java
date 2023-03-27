import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop

        for(String island : scottishIslands) {
            System.out.println(island);
        }
        System.out.println(scottishIslands);


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        int a[] = {1,1,4,2,7,1,6,15,13,99,7};
        System.out.println("Even Numbers: ");
        for(int i = 0; i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
//        2. Print the difference between the largest and smallest value
        int[] arrayNumbers = {1,1,4,2,7,1,6,15,13,99,7};
        System.out.println("Original Array: " + Arrays.toString(arrayNumbers));
        int max_val = arrayNumbers[0];
        int min = arrayNumbers[0];

        for (int i =1; i < arrayNumbers.length; i++) {
            if(arrayNumbers[i] > max_val)
                max_val = arrayNumbers [i];

            else if (arrayNumbers[i] < min)
                min = arrayNumbers[i];
        }
        System.out.println("The difference between the largest and smallest values of our array is: " + (max_val - min));

        }
//        3. Print True if the list contains a 1 next to a 1 somewhere.

//        4. Print the sum of the numbers
        int sumOfNumbers[] = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
            int sum = 0;
        for int(i : sumOfNumbers )
                sum += i;
            System.out.println("The sum of our array is: " + sum);



//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }


