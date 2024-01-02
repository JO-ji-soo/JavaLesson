package basic.day2;

public class A10StringVariable {
    public static void main(String[] args) {
        //String 은 문자열 : 문자(' ')의 집합. 문자열 리터럴은 기호 ""사용합니다.
        String message = "Hello~ 안녕!! 하이하이";

        System.out.println(message);
        System.out.println("메세지'"+message+"'의 길이 : " + message.length());

        message="welcome~ java world!!!!!";
        System.out.println("메세지'"+message+"'의 길이 : " + message.length());

        //String으로 선언된 변수는 '객체'입니다. 
        //그래서 메소드를 갖고 필요한 기능들을 제공해 줍니다.

        //char imo = '😉'; //char은 2바이트 이모지는 4바이트. 문자형으로 저장 안됨.
        String imo = "😉"; // 이모지는 문자열로 저장해야 합니다.
        System.out.println(imo);

        //자바 String의 중요한 메소드 7가지씩 조사해서 테스트 해보기
        //substring 특정 부분 뽑아낼 경우
        //toUpperCase 문자열을 모두 대문자로 변경하고자 할 때
        //toLowerCase 문자열을 모두 소문자로 변경하고자 할 때
        //concat 문자열과 문자열을 합치고자 할 때
        //replace 특정 문자를 원하는 문자로 변경하고 싶을 때

        String str1="문자열을 공부해봅시다";
        System.out.println(str1.substring(5));

        String str2="abcdef";
        System.out.println(str2.toUpperCase());

        String str3="ABCDEF";
        System.out.println(str3.toLowerCase());

        String str4="나는 너를 사랑해";
        String str5="거짓말이야";
        System.out.println(str4.concat(str5));
        System.out.println(str4+str5);

        String str6="chocolate#cake";
        System.out.println(str1.replaceAll("문자열","String"));
        System.out.println(str6.replaceAll("chocolate","lemon"));



    }
    
}
