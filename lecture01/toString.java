


public class toString {
   public static void main(String[] args) {
    Integer nameInt = 5;
    String nameString = nameInt.toString();
    String nameString2 = String.valueOf(nameInt);
    System.out.println(nameString.getClass().getName());
    System.out.println(nameString2.getClass().getName()); // узнать сlass

   } 
}
