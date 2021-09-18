/* 
 *  Make-a-Friend Matchmaking System
 * 
 *  Author: Kyla Penamante
 *  Version 1.1
 * 
 *  This is the official code for the Make-a-Friend Matchmaking System. Here,
 *  users can input member names and will receive random pairs as an output.
 */
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class MAF
{
    public static void main(String[] args)
    {
        // Variable initialization
        Scanner input = new Scanner(System.in);
        List<String> mafList = new ArrayList<>();
        int n;
        String memberName;

        /* This code displays the initial outputs of the program. It also
         * allows for users to input the number of members to be paired.
         */
        System.out.println("Welcome to the Make-a-Friend Matchmaking System!");
        System.out.print("Enter # of members: ");
        n = input.nextInt();

        // This section allows for users to input member names to be paired.
        for (int i = 0; i<n + 1; i++) {
            System.out.print("Enter member name: ");
            memberName = input.nextLine();
            mafList.add(memberName);
        }
        mafList.remove("");
        
        /* This section of code shuffles the member list and updates it into
         * a new list.
         */
        Collections.shuffle(mafList);
        String[] updatedMafList = mafList.toArray(new String[mafList.size()]);
        
        /* If there is an odd number of members, this section adds a new
         * value to the list to help list out any leftover members.
         */
        if (updatedMafList.length % 2 == 1) {
            mafList.add("");
        }
        String[] finalMafList = mafList.toArray(new String[mafList.size()]);
        
        // This code displays the randomly generated pairs.
        for (int j = 0; j < n; j = j + 2){
            System.out.println(finalMafList[j]
            + ", " + finalMafList[j + 1]);
        }

        // Close Scanner
        input.close();
    }
}