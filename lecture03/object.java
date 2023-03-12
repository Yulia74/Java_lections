package lecture03;

public class object {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o); // java.lang.Integer
        o = 1.2;
        GetType(o); // java.lang.Double
    }

    static void GetType(Object obj) {                // метод в который передаю переменную типа Object
        System.out.println(obj.getClass().getName());
    }
}
