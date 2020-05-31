package L5;

public class L5 {
    public static void main(String[] args){

        Personal person = new Personal("ФИО", "должность", "эл.почта",0 , 0, 0);
        person.info();
        person.getAge();
        Personal[] per = new Personal[5];
        per[0] = new Personal("Иванов И.И.", "мастер", "z@gmail.com",89999999999l , 30000, 30);
        per[1] = new Personal("Сергеев А.А.", "инженер", "нет",89999999999l, 45000, 41);
        per[2] = new Personal("Куклин С.В.", "ученик", "нет",89999999999l, 33000, 27);
        per[3] = new Personal("Пряхин Д.В.", "студент", "no email",89999999999l, 28000, 22);
        per[4] = new Personal("Удальцов П.В.", "инженер", "эл.почта",89999999999l, 40000, 50);
        for (Personal personal : per) {
              if(personal.getAge() >40) {
                    personal.info();
              }
          //  personal.info();

            //for (int i = 0; i < per.length; i++){
            //     int q = 40;
            //        if (per.getAge().equals(q));  //  не верно.
        }



    }

}
