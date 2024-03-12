public class Arrays {
    public static void main(String[] args) {
        System.out.println("Первая задача");
        //Вывести первые 3 элемента массива (Вывести первые 3 элемента массива  используя цикл for).
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

//        Вывести первую половину массива (Вывести первую половину элементов массива  при помощи цикла for).
        System.out.println("Второя задача");
        int[] array2 = new int[6];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        for (int i = 0; i < 3; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();


//        Вывести вторую половину массива (Вывести вторую половину элементов массива  при помощи цикла for). Реализация задачи должна работать при любом чётном  количестве элементов.
        System.out.println("Третья задача");
        for (int i = array2.length / 2; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();

//                Вывести все элементы кроме первого и последнего.
        System.out.println("Четвертая задача");
        for (int i = 1; i < array2.length - 1; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();


//        Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11]
        System.out.println("Пятая задача");
        int[] array3 = new int[] {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = array3.length - 3; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println();
//        вывод должен быть таким: 99, 2, 11)


        //Вывести чётные элементы массива по порядку (Вывести только чётные элементы  массива по порядку (каждый второй элемент). Необходимо будет вывести второй,  четвёртый, шестой и т.д. элементы. Позиции (индексы) для необходимых элементов:  1, 3, 5...n (постоянное увеличение на 2).
        System.out.println("Шестая задача");
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 != 0){ //[1, 2, 3, 4, 5, 6]
                System.out.println(array2[i]);
            }

        }
        System.out.println();


        //Вывести количество положительных и отрицательных элементов (Необходимо  определить количество положительных и отрицательных элементов в массиве и  вывести его). В реализации задачи понадобится определить 2 переменные для  хранения количества элементов: Одна переменная для хранения количества  положительных элементов, допустим positiveCount. Вторая для хранения  количества отрицательных элементов, допустим negativeCount. Названия  переменных можно выбирать на своё усмотрение.
        System.out.println("Седьмая задача");
        int negativeCount = 0;
        int positiveCount = 0;
        for (int i = 0; i < array3.length; i++) {
            if(array3[i] >= 0){ // [7, -3, 9, -11, 18, 99, 2, 11]
                positiveCount++;
            }else{
                negativeCount++;
            }
        }
        System.out.println("Число отрицальных числ:" + negativeCount + " Позитивных:" + positiveCount);
        System.out.println();

        //Найти максимальный и минимальный элементы массива (Необходимо  определить максимальный и минимальный элементы в массиве и вывести их).
        int max = array3[0];
        int min = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if(max < array3[i]){
                max = array3[i];
            }
            if(min > array3[i]){
                min = array3[i];
            }
        }
        System.out.println("Минимум массива:" + min + " максимум:" + max);
    }
}
