package mnogopot.hm;

import java.util.Arrays;

public class Hw extends Thread{
    public Hw(String name) {
        super(name);
    }

    static final int SIZE = 10;
    static final int HALF = SIZE / 2;
    long a = System.currentTimeMillis();

    @Override
    public void run() {
        float[] arr = new float[SIZE];
        System.out.println(arr.length + " длина массива  " + getName());

        for (float i = 0; i < SIZE; i++) {
            arr[(int) i] = 1;

            arr[(int) i] = (float)(arr[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(arr[(int) i] + " "+ getName());
        }
        System.currentTimeMillis();
        System.out.println((System.currentTimeMillis()-a) + " ms время выполнения " + getName());
        System.out.println();


        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
                for (int i = 0; i <HALF ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                    System.out.println((System.currentTimeMillis()-a) + " ms время выполнения " + getName());

            System.out.println(Arrays.toString(a1));

                    System.out.println(Arrays.toString(a2));

        }
                 System.arraycopy(a1, 0, arr, 0, HALF);
                System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println((System.currentTimeMillis()-a) + " ms время выполнения " + getName());
        System.out.println(Arrays.toString(arr));

    }

}
class MainHw {
    public static void main(String[] args) {
        Hw hw = new Hw("1 поток");
         Hw qa = new Hw("2 поток");
        hw.start();
        qa.start();
//        hw.run();
//        qa.run();
    }
}