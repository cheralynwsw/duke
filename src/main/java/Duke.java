import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println(logo);
        System.out.println("Hello I'm Duke");
        System.out.println("What can I do for you?");

        Scanner in = new Scanner(System.in);
        String input = "";
        String arrayOfList[] = new String[100];
        int count = 0;

        while(!input.toLowerCase().equals("bye")) {
            input = in.nextLine();

            if (input.equals("list")) {
                for(int i =0; i<count; i++){
                    System.out.println((i+1) + ". " + arrayOfList[i]);
                    //arrayOfList[i]= in.nextLine();

                }
            }

            else {
                arrayOfList[count] = input;
                    if (!input.toLowerCase().equals("bye")){
                        DukeAdd.add(input);
                        count++;
                    }
            }
        }
        DukeResponse.bye(input);
    }
}



