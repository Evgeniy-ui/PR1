package PART2.Les1.Info;

public class CAT implements RaceTrack, Wall {

    private int maxRun_dist = 1000;
    private int maxJump_metres = (int)2.1;
    private int Run_dist;
    private int Jump_metres;

    @Override
    public void run(int run) {
        this.Run_dist = run;

        if (run <= maxRun_dist) {
            System.out.println("Кошка пробежала : " + run + "метров");
        } else {
            System.out.println("Кошка не смогла пробежать больше : " + maxRun_dist + "метров");
        }
    }

        @Override
        public void jump ( double jump){
            this.Jump_metres = (int) jump;

            if (jump < maxJump_metres) {
                System.out.println("Кошка подпрыгнула на : " + jump + "метра" + " и смогла пройти препятствие");
            } else if (jump == maxJump_metres) {
                System.out.println("Кошка подпрыгнула на : " + jump + "метрa" + " и с трудностью преодолел препятствие");

            } else {
                System.out.println("Кошка не смогла преодолеть и залезть на припятствие ");

            }
        }
    }