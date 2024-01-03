package basic.day4;

public class A25MySampleMethod {

    // A22번 1) ~5) 을 각각 메소드로 정의해 보기 - 메소드안에서 출력문 만들지 않습니다.
    // 1) sum1ToN  2)multiply1ToN  3)sumMToN  4)multiplyMtoN 5)multiplyNof2
    // 6) 구구단 '출력'하는 메소드, 리턴은 void, printGuguDan

    public static void main(String[] args) {
      
        // 1. 1부터 정수 n까지 더하기
        // 2. 1부터 정수 n까지 곱하기
        // 3. 시작값 정수 m부터 마지막값 n까지 더하기
        // 4. 시작값 정수 m부터 마지막값 n까지 곱하기
        // 5. 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서 많이 사용되는 연산)
        // 6. 구구단 '출력'하는 메소드, 리턴은 void, printGuguDan

       // int result = addMToN(2,5);
       // boolean isOK = checkJumsu(67);

        printgugudan(2);
        System.out.println(sum1ToN(10));
        System.out.println(multiply1ToN(2));
        System.out.println(sumMToN(2, 4));
    }
       // private static boolean checkJumsu(int i) {
       //return i>=0 && i<=100;
       //}
        /*private static int addMToN(int i, int j) {
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=k;
            }
        return sum;
        }*/


        // 1. 1부터 정수 n까지 더하기
        public static int sum1ToN(int n){
            int sum =0;
          for(int i=1;i<=n;i++){
              sum+=i;
        }
         return sum;
        }

        // 2. 1부터 정수 n까지 곱하기
        public static long multiply1ToN(int n){
            long longresult =1;
            for(int i=1;i<n;i++){
                longresult*=i; 
        }
         return longresult;
        }

        // 3. 시작값 정수 m부터 마지막값 n까지 더하기
        public static int sumMToN(int n, int m){
            m=1; n=2;
            int sum=0;
            for(int i=m;i<n;i++){
                sum+=i;      
        }
          return sum;
        }
        
        // 4. 시작값 정수 m부터 마지막값 n까지 곱하기
        public static double multiplyMtoN(int n, int m){
            m=1; n=2;
            double doubleresult=1;
            for(int i=m;i<n;i++){
                doubleresult*=i;
        }
         return doubleresult;
        }
        
        // 5. 2의 n승 구하기 : 2를 n번 곱하기
        public static long multiplyNof2(int n){
            n=10;
            long longResult=1;
            for(int i=1;i<=n;i++){
                longResult*=2;

        }
         return longResult;
        }   
        // 6. 구구단 '출력'하는 메소드, 리턴은 void, printGuguDan
        public static void printgugudan(int n){
            for(int i=2;i<9;i++){
    
                System.out.println("지금..."+ i +"단을 출력합니다.");
                for(int j=1;j<=9;j++)
                System.out.println(String.format("%3d X %3d = %3d",i,j,i*j));
        }
        System.out.println();
        }
}
