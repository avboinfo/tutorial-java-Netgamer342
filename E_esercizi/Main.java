package E_esercizi;

import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {

        Pila<String> p=new Pila<String>();
		File f = new File("E_esercizi/Text.csv");

        try{
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                p.push(line);
            }
            scanner.close();
        }catch(Exception e){
            System.out.println("errore: " + e.getMessage());
	    }

        System.out.println(p);
    }
}