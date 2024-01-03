package basic.day2;

public class A09HangulCharTest {
    /*
     * 1. 문자 '나'부터 '냿'까지 while문으로 출력해보세요. ->변수 char start ='나';
     * 2.                      모두 몇개의 문자가 있는지 갯수 구하기. int cadeNa, cadeNet
     */

    public static void main(String[] args) {
        char start ='나';
        char end ='낟';
        int codeNa = start;
        int codeNet = end;
        while(start<= end){
            System.out.print(start++);
        }
     //**이 시점에서의 start는? **
     System.out.println("\nstart=???"+start); //

     //System.out.println("\n\n\nstart~end까지 문자의 개수 ="+int);//
    
        System.out.print("'나'~'낟'까지 문자의 개수="+(codeNet-codeNa+1));
        System.out.print(codeNet-codeNa+1);
    

    }//main end
}
