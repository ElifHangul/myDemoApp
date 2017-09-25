BİL-481 YAZILIM MÜHENDİSLİĞİ ÖDEV-1

App.java içerisinde bulunan search metodu iki tane ArrayList<String> ve bir de integer e değeri olmak üzere üç parametre almaktadır.
 
public static boolean search(ArrayList<String> array1,ArrayList<String> array2,int e) 

Bu metodda iki ArrayList elemanlarını karşılaştırarak ortak string sayısı bulunmaktadır. Sonrasında ise bu sayı ile verilen integer e değeri karşılaştırılmakta ve iki değer aynı ise true farklı ise false dönülmektedir. Bu metod için uygun bir true test aşağıda verilmiştir.

 ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "Elif", "Mehmet", "Reyhan"))

 ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"))
  
 search(array1,array2, 2) =>  İki listede de "Elif" ve "Mehmet" isimleri ortaktır. Toplamda iki adet aynı eleman vardır. Girilen sayı da 2 olduğundan true döner.

AppTest.java dosyasında ilgili metodu test eden unit test'ler bulunmaktadır.

[![Build Status](https://travis-ci.org/ElifHangul/myDemoApp.svg?branch=master)](https://travis-ci.org/ElifHangul/myDemoApp)
