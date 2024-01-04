package basic.day3;

public class HomeCharTypeJJS {
    public static void main(String[] args) {
        
        String message = "Hello* Java Hi* Linux333~~~";
        int UpperCount=0; //대문자의 갯수  
        int lowerCount=0; //소문자의 갯수  
        int numberCount=0; //숫자의 갯수 
        int symbolCount=0; //기호의 갯수 

        for (int i = 0; i < message.length(); i++){
            char temp = message.charAt(i);
            if (temp>='A'&&temp<='Z') UpperCount++;
            else if (temp<='z'&&temp>='a') lowerCount++; 
            else if (temp<='9'&&temp>='0') numberCount++;
            //키보드로 찍는 문자들 중 다국어 문자가 아닌 경우만 가능
            else symbolCount++;
            // 만약에 한글도 있을 수 있다면 
            // else if((temp>=32%&&temp<=47)
            //       ||(temp>=':'&&temp<=@)
            //       ||(temp>=':'&&temp<=@)
            //       ||(temp>='{}'&&temp<='~''))
            // symbloCount==;
        }
        /* 
        String str = "Hello* Java Hi* Linux~~~";
        System.out.println("str이 대문자인가 ? "+(str>='A' && str<='Z'));
        System.out.println("str이 소문자인가 ? "+(str>='a' && str<='z'));
        System.out.println("str이 숫자인가 ? "+(str>='0' && str<='9'));
        System.out.println("str이 숫자가 아닌가 ? "+!(str>='0' && str<='9'));
        */

        System.out.println("------------------------------");
        System.out.println("문자열 :" + message + "\n" +
        "문자 종류 : 대문자" + UpperCount +"개,  소문자 "+ lowerCount +"개, 숫자 "+ numberCount +"개, 기호 "+ symbolCount +"개");
        
        }
    }
