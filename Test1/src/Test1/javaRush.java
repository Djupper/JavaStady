package Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class javaRush {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<String>();
        for( int i = 0; i<5; i++){
            String s = reader.readLine();
            list.add(s);
        }


        for (int i =0; i<13;i++){
            String b = list.remove(list.size()-1);
            list.add(0, b);


            System.out.println(list.get(i));
        }

    }
}


