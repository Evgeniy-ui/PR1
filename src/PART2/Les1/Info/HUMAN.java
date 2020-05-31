package PART2.Les1.Info;


public class HUMAN implements RaceTrack, Wall {

    private int maxRun_dist = 3000;
    private double maxJump_metres = 1.5;
    private int Run_dist;
    private int Jump_metres;



  @Override
    public void run(int run) {
    this.Run_dist = run;

    if (run <= maxRun_dist) {
      System.out.println("Homosapiens пробежал : " + run + "метров");
    } else {
      System.out.println("Homosapiens не смог пробежать больше : " + maxRun_dist + "метров");
    }
  }

    @Override
    public void jump(double jump) {
      this.Jump_metres = (int) jump;

      if (jump < maxJump_metres) {
        System.out.println("Homosapiens подпрыгнул на : " + jump + "метрa" + " и смог пройти препятствие");
      } else if (jump == maxJump_metres) {
        System.out.println("Homosapiens подпрыгнул на : " + jump + "метрa" + " и с трудностью преодолел препятствие");

      }
         else {
        System.out.println("Homosapiens не смог преодолеть и залезть на припятствие ");

      }
    }
}

//    public HUMAN(){
//        this.run = run;
//        this.jump = jump;
//        this.Jump_metres = Jump_metres;
//        this.Run_dist = Run_dist;
//
//       // System.out.println("HUMAN : " + run + "; \t" + jump);
//    }


