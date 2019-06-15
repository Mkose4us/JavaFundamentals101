package classNotes;

import java.util.ArrayList;

public class SlackAction {
    public static void main(String[] args) {
        SlackUser s1 = new SlackUser("M","M@G","5");
        SlackUser s2 = new SlackUser("L","L@G","8");
        SlackUser s3 = new SlackUser("N","N@G","7");
        SlackUser s4 = new SlackUser("S","S@G","3");
        System.out.println(s1.toString());


        ArrayList<SlackUser> slacks = new ArrayList<>();
        slacks.add(s1);
        slacks.add(s2);
        slacks.add(s3);
        slacks.add(s4);
        for(SlackUser each:slacks){
            System.out.println(each);
            System.out.println(each.sendMessage("general","HELLO"));
        }
    }
}
