//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    private static Scanner sc;

	public static void main(String []argh)
	{
        Map<String, String> phoneBook = new HashMap<String, String>();
        sc = new Scanner(System.in);
        int numFriends = sc.nextInt();
        sc.nextLine();

         for (int i = 0; i < numFriends; i++) {
             String name = sc.nextLine();
              String phone = sc.nextLine();
                phoneBook.put(name, phone);
            }
		while(sc.hasNext())
		{
                String inputName = sc.nextLine();
                if (phoneBook.containsKey(inputName)) {
                    System.out.println(inputName + "=" + phoneBook.get(inputName));
                } else {
                    System.out.println("Not found");
                }
		}
	}
}

