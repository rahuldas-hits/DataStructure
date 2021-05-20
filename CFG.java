// Java program to illustrate creating an array of
// objects
  
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}




public class CFG {
    public static void main (String[] args) 
    {         
      // declares an Array of integers.
      int[] arr;
          
      // allocating memory for 5 integers.
      arr = new int[5];
          
      // initialize the first elements of the array
      arr[0] = 10;
          
      // initialize the second elements of the array
      arr[1] = 20;
          
      //so on...
      arr[2] = 30;
      //arr[3] = 40;
      //arr[4] = 50;
          
      // accessing the elements of the specified array
      for (int i = 0; i < arr.length; i++)
         System.out.println("Element at index " + i + 
                                      " : "+ arr[i]);          


        // declares an Array of integers.
        Student[] arr1;
  
        // allocating memory for 5 objects of type Student.
        arr1 = new Student[5];
  
        // initialize the first elements of the array
        arr1[0] = new Student(1,"aman");
  
        // initialize the second elements of the array
        arr1[1] = new Student(2,"vaibhav");
  
        // so on...
        arr1[2] = new Student(3,"shikar");
        arr1[3] = new Student(4,"dharmesh");
        arr1[4] = new Student(5,"mohit");
  
        // accessing the elements of the specified array
        for (int i = 0; i < arr1.length; i++)
            System.out.println("Element at " + i + " : " +
                        arr1[i].roll_no +" "+ arr1[i].name);                                      

    }
}
