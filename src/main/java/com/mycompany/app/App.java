package com.mycompany.app;
import java.util.ArrayList;

public class App {

   public static boolean search(ArrayList<String> array1,ArrayList<String> array2,int e) {
        System.out.println("Verilen adet kadar ortak string var mı?");
	int count=0;
        if (array1 == null || array2 == null) return false;
  	if(e<0) return false;
	if(array1.size()<=0 || array2.size()<=0) return false;
	if(array1.size()<=e || array2.size()<=e) return false;
        for (String str1 : array1) {
	  for(String str2: array2){
          if (str1.equals(str2)) count++;
        }}
	if(count==e) return true;
        return false;
      }

}
