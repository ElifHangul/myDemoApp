package com.mycompany.app;
import static spark.Spark.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App {

   public static boolean search(ArrayList<String> array1,ArrayList<String> array2,int e) {
        System.out.println("Verilen adet kadar ortak string var mı?");
	int count=0;
	ArrayList<String> arrayOfSameElements=new ArrayList<>();
        if (array1 == null || array2 == null) return false;
  	if(e<0) return false;
	if(array1.size()<=0 || array2.size()<=0) return false;
	if(array1.size()<e || array2.size()<e) return false;
        for (String str1 : array1) {
	  for(String str2: array2){
          if (str1.toLowerCase().equals(str2.toLowerCase())) {
		if(!arrayOfSameElements.contains(str1.toLowerCase())){
		  arrayOfSameElements.add(str1.toLowerCase());
		  count++;
		}
	  }
        }}
	if(count==e) return true;
        return false;
      }

 public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
          //System.out.println(req.queryParams("input1"));
          //System.out.println(req.queryParams("input2"));

          String input1 = req.queryParams("input1");
          java.util.Scanner sc1 = new java.util.Scanner(input1);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<String> inputList = new java.util.ArrayList<>();
          while (sc1.hasNext())
          {
           String value = sc1.next().replaceAll("\\s","");
            inputList.add(value);
          }
          System.out.println(inputList);
	  
	  String input2 = req.queryParams("input2");
          java.util.Scanner sc2 = new java.util.Scanner(input2);
          sc2.useDelimiter("[;\r\n]+");
          java.util.ArrayList<String> inputList2 = new java.util.ArrayList<>();
          while (sc2.hasNext())
          {
           String value2 = sc2.next().replaceAll("\\s","");
            inputList2.add(value2);
          }
          System.out.println(inputList2);

          String input3 = req.queryParams("input3").replaceAll("\\s","");
	  int input3AsInt;
	  try{
          input3AsInt = Integer.parseInt(input3);
	}catch(NumberFormatException e){
	   input3AsInt = -1;
	}
          boolean result = App.search(inputList,inputList2, input3AsInt);

         Map map = new HashMap();
          map.put("result", result);
          return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());
    get("/compute",  (rq, rs) -> {
              Map map = new HashMap();
              map.put("result", "not computed yet!");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());

    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 5000; //return default port if heroku-port isn't set (i.e. on localhost)
    }



}
