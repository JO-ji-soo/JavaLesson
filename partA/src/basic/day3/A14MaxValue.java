package basic.day3;

public class A14MaxValue {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 24;
        int n3 = 30;

        if(n1 > n2) {
            max=n1;
        }
            
        else {      
            max=n2;
}
        if(max<n3){
            max=n3;
        }

        System.out.println("n1+"+n2 +",n2+" +n2 +",n3="+n3);
        System.out.println("최대값max"+max);

        n1=99; n2=88; n3=77;

        max =0;
        max = (n1>n2? n1:n2);
        max = )max<n3? n3:max);
        System.out.println("n1="+n1 +",n2="+n2+",n3="+n3);
        System.out.println("최대값 max="+max);





}

}