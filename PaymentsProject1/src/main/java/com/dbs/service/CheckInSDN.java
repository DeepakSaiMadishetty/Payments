package com.dbs.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class CheckInSDN {

		  public boolean check(String name) throws IOException {
	    // your code goes here
		  System.out.println("enetr namr");
	    String[] a = name.toUpperCase().split("[\\s,]+");
	    try {
	      List<String> lines = Files.readAllLines(Paths.get("documents/sdn_modified.csv"));
	      Arrays.sort(a);int k=0;
	      //for(String i:a)System.out.println(i);
	      for (String line : lines) {
	        String[] b = line.replaceAll("\"", "").toUpperCase().split("[\\s,]+");
	        Arrays.sort(b);
		     // for(String i:b)System.out.println(k+" "+i);k++;
	        if ((Arrays.equals(a, b)))return true;
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	    return false;
	  }
	

}
