// Your First Program
import java.util.*;
class HelloWorld{
    public static void main(String args[]){
        // System.out.println("Hello World!!!");
        // System.out.println("Hello World!!!");

        //List<ArrayList<String>> str = new ArrayList<>();

        //List<String> list = Arrays.asList("NYC", "New Delhi");
        //List<ArrayList<String>> list = List<ArrayList<String>>(3);
        //int n = 3;
  
        // Here aList is an ArrayList of ArrayLists
        ArrayList<List<String> > aList = 
                  new ArrayList<List<String> >();
  
        // Create n lists one by one and append to the 
        // master list (ArrayList of ArrayList)
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("1");
        a1.add("2");
        aList.add(a1);
  
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("5");
        a2.add("6");
        a2.add("8");
        aList.add(a2);
  
        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("10");
        a3.add("20");
        a3.add("30");
        aList.add(a3);


        ArrayList<String> a4 = new ArrayList<String>();
        a4.add("A");
        a4.add("B");
        a4.add("C");
        aList.add(a4);
 
        // String[] array = list.toArray(new String[0]);
        // System.out.println(Arrays.toString(array));
        
  
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}