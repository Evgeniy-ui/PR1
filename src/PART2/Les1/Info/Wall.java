package PART2.Les1.Info;

public interface Wall {



   default void jump(double jump){
       System.out.println("подпрыгнул " + jump);

       double QW = (int)2.3;
       System.out.println("высота препятствия : " + QW);

   }


}
