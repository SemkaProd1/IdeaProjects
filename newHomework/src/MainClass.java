public class MainClass {


    public static void main(String[] args) throws InterruptedException {
        String str = "С помощью задания времени ожидания потока можно, например, выполнять обновление \n" +
                "анимированной картинки пока главныйили поток ждёт завершения побочного потока, выполняющего" +
                " ресурсоёмкие операции. Каждый поток в системе имеет свой приоритет выполнения.";
        SetStringsSinchMethod myStrings = new SetStringsSinchMethod(str);
        Thread thread1 = new Thread(new TesterCL(myStrings));
        Thread thread2 = new Thread(new TesterCL(myStrings));
        Thread thread3 = new Thread(new TesterCL(myStrings));
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(myStrings.getSet());
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();

    }
}