package basic.day4;

import javax.sound.sampled.SourceDataLine;

public class ProbStringReverse {
    public static void main(String[] args) {
        
         // message문자열이 "Hello World"일 때 문자열을 뒤집어보세요.

         String str ="Hello World";
         String reverse = "";
 
         char[]arr=str.toCharArray();
         char[]reversedArr=new char[arr.length];
         for(int i=0;i<arr.length;i++){
             reversedArr[arr.length-1-i]=arr[i];
         }
         String reversedStr=new String(reversedArr);
         System.out.println(reversedStr);
    

         String message = "Hello World";
         char[]messageArray = new char[message.length()];

         int cidx =message.length()-1;          //10
         for(int i=0;i<message.length();i++){
            char temp = message.charAt(i);      //i=0 일 때
            messageArray[cidx]=temp;            //cidx=10입니다.
            // i=1일 때, cidx=9 / i=2일 때, cidx=8 / i=3일 때, cidx=7
            cidx--;         //cidx 변수 없이 사용할 공식 찾아보세요.
         

        System.out.println("뒤집기 결과 :");
        System.out.println(messageArray);
        }
    }      
}
