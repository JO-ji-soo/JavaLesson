package basic.day3;

public class A15MinValue { //가장 작은 값 찾기
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 24;
        int n3 = 30;
        int min;

        if(n1 < n2) {
            min=n1;
        }
            
        else {      
            min=n2;
}
        if(min<n3){
           min=n3;
        }

        System.out.println("n1+"+n2 +",n2+" +n2 +",n3="+n3);
        System.out.println("최대값min"+min);

        n1=99; n2=88; n3=77;
        System.out.println("n1="+n1 +",n2="+n2+",n3="+n3);

        min =0;
        min = (n1<n2? n1:n2);
        min = (min>n3? n3:min);
        System.out.println("n1="+n1 +",n2="+n2+",n3="+n3);
        System.out.println("최대값 min="+min);





}

}