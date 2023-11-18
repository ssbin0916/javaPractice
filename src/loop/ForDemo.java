package loop;

import java.util.Arrays;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        List<String> playList = Arrays.asList("music1", "music2", "music3");

        for (int i = 0; i < playList.size(); i++) {
            System.out.println(playList.get(i));
        }

        for (String music : playList) {
            System.out.println(music);
        }


//        for (int i = 0; i < 10; i++) {
//            System.out.println("Coding Everybody" + i);
//        }

    }
}
