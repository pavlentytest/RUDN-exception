package com.company;

public class Main {

    public static void main(String[] args)  {

       // throw new IndexOutOfBoundsException("index=3");
      //  throw new Exception("Ura!");

      /*  int[] x = new int[5];
        try {
            var a = 100;
            int b = 0;
            x[10] = 800;
            System.out.println(a / b);
            System.out.println("После деления...");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (ArithmeticException  ee) {
            System.out.println(ee.toString());
        } finally {
            // Закрыть файл или соеденение
            System.out.println("Всегда!!!");
        }
        System.out.println("После try...");
*/

        try {
            toDo();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void toDo() throws Exception {
        // код который выбрасывает исключение
    }
}
