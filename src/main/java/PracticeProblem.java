public class PracticeProblem {
	
    public static void main(String[] args) {
        // Test the functions
        int[] numbers = createIntArray();
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        String[] fruits = createArray("Apple", "Banana", "Cherry", "Date");
        System.out.print("Fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        
        int[] testArray = {1, 2, 3, 4, 2, 5, 2};
        System.out.println("First 2 at index: " + findValue(2, testArray));
        System.out.println("First 6 at index: " + findValue(6, testArray));
        
        String[] words = {"apple", "banana", "apple", "orange", "apple", "grape"};
        System.out.println("Third apple at index: " + findThirdValue("apple", words));
        System.out.println("Third pear at index: " + findThirdValue("pear", words));
    }
    
    // Store 1-5 in array using loop
    public static int[] createIntArray() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    
    // Store 4 strings in order
    public static String[] createArray(String a, String b, String c, String d) {
        String[] arr = new String[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        return arr;
    }
    
    // Find first occurrence
    public static int findValue(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    // Find third occurrence
    public static int findThirdValue(String target, String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                count++;
                if (count == 3) {
                    return i;
                }
            }
        }
        return -1;
    }
}
