
public class StringHelper {
    public int countA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'A' || ch == 'a') { // Use single quotes for characters
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringHelper ab = new StringHelper();
        int count = ab.countA("helloa");
        System.out.println(count);
    }
}
