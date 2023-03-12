package lecture03;

public class arrayAd {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 }; // есть массив а
        int[] b = new int[3]; // создаю массив b (пока из трех 0)
        System.arraycopy(a, 0, b, 0, a.length); // из массива а в массив b, начиная с 0 элемента a.length - всю длинную
                                                // массива а
        for (int i : a) {
            System.out.printf("%d ", i);
        } // 1 9
        System.out.println();

        for (int j : b) {
            System.out.printf("%d ", j); // 1 9 0
        }
    }
}

// добавление через метод

class arrayAd1 {
    static int[] AddItem(int[] array, int item) { // в метод( массив источник int[] array; int item - то что хотим добавить)
        int length = array.length;                // внутри метода определяем длинну источника
        int[] temp = new int[length + 1];         // создаем новый массив, увеличенный на 1 элемент
        System.arraycopy(array, 0, temp, 0, length); // копируем
        temp[length] = item;                      // добавляем последний в конец
        return temp;                              // возвращаем новый массив
    }

    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        for (int j : a) {
            System.out.printf("%d ", j);
        }
    }
}



