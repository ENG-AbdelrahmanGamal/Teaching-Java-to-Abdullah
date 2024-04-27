import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
       Scanner input = new Scanner(System.in);

        int  boy=0;
        int  girl=0;
        // insert text for the grating
        System.out.println("السلام عليكم ورحمه الله وبراكاته ");
        System.out.println("ازيكم يا طلاب المعهد  ");
        System.out.println("انا اخوكم عبدالله اريد عمل تطبيق لمساعدتكم في التقدم   ");
        System.out.println("سأقوم بسؤال كل واحد منكم سؤال لكي انفذ فكرة المشروع ");
        System.out.println(" برجاء تقبل مني ذلك  !!! ");
        for(int i=0; i<10;i++){
            System.out.println( " ما هو نوعك ؟؟");

            if(input.next().equals("ولد"))
          {
            boy++ ;
          }
         else {
              girl++;
          }

          }
        System.out.println(" يا ادارة المعهد الكرام (يا كتله) ");
        System.out.println(" اود ان اعلم سيادتكم ان المعهد به عدد الطلاب كالاتي . ");
        System.out.print("عدد البنين  ");
        System.out.print(boy);
        System.out.print("عدد البنات   ");
        System.out.print(girl);

        }

    }
