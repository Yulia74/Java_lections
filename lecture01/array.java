public class array {
    public static void main(String[] args) {        // инициализация нового одномерного массива
        int[] arr = new int[10];
        System.out.println(arr.length);             // 10
        arr = new int[] { 1, 2, 3, 4, 5 };          // если значения массива задаются в строке в {}, то int[]- пустые
        System.out.println(arr.length);             // 5
        // int array[];                             // так тоже можно инициализировать
        // arr.                                     // через . получаем базовый функционал
    }
}
    
class array1 {
    public static void main(String[] args) {        // обращение к отдельному элементу одномерного массива
        int[] arr = new int[10];
        arr[4] = 13;              
        System.out.println(arr[3]);                // 0
        System.out.println(arr[4]);                // 13
    }
}

class array2 {
    public static void main(String[] args) {

        int[] arr[] = new int[3][5];        // 3 cтроки и 5 столбцов, в Java это массивы массивов                 
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();           // 0 0 0 0 0
        }                                   // 0 0 0 0 0
    }                                       // 0 0 0 0 0
}

class array3 {
    public static void main(String[] args) {

        int[][] arr = new int[3][5];         // другой способ [][] инициализации массивов
   
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();           // 0 0 0 0 0
        }                                   // 0 0 0 0 0
    }                                       // 0 0 0 0 0
}
   