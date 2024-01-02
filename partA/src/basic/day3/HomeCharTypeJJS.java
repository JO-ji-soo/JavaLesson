package basic.day3;

public class HomeCharTypeJJS {
    public static void main(String[] args) {
        
        String str = ("Hello Java Hi Linux~~~~~~");
        int UpperCount=0;
        int lowerCount=0;
        int numberCount=0;
        int symbolCount=0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            
        }
        System.out.println("------------------------------");
        System.out.println("문자열 :" + str + "\n" +
        "문자 종류 : 대문자" + UpperCount +"개,  소문자 "+ lowerCount +"개, 숫자 "+ numberCount +"개, 기호 "+ symbolCount +"개");

       /* 
       for (int i = 0; i < message.length(); i++) {
            char temp = message.charAt(i);
            if(temp=='o') count++;
            
            65~90
        }
        System.out.println("o의 개수: "+ count);
       */ 
        
}
}