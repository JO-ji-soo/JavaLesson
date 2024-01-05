package basic.day6;

public class B06ProductMain {
    public static void main(String[] args) {
        
        //Product 객체를 네개만 만들어봅시다.
        Product snack = new Product("새우깡",1200, "농심", new String[3]);
        Product drink = new Product("칠성사이다",2200, "롯데", new String[3]);
        Product fruit = new Product("부사",12000, "우리농원", new String[3]);
        Product icecream = new Product("투게더",7000, "빙그레", new String[3]);

        //출력해봅시다
        System.out.println(snack);
        System.out.println(drink);
        System.out.println(fruit);
        System.out.println(icecream);

        /*
         *  basic.day6.Product@372f7a8d   - @372f7a8d 객체 참조값 (식별값)-> 주소라고 부릅니다,
            basic.day6.Product@2f92e0f4   - basic.day6.Product 는 패키지이름.클래스이름.
            basic.day6.Product@28a418fc
            basic.day6.Product@5305068a
            PS D:\class231228\java\partA> 
         */

         System.out.println(snack.getData());
         System.out.println(drink.getData());
         System.out.println(fruit.getData());
         System.out.println(icecream.getData());

         //퀴즈 snack의 etc 필드 배열요소 0번에 "10개 묶음" 문자열을 저장하세요.
         String[] temp = snack.getEtc();  //가져온 값 어떻게 저장???
         temp[0]="10개 묶음";
         System.out.println(snack.getData());

         //snack.setPrice(1000); // set 메소드가 없음 -> 오류
         //snack.price = 1000;   // private -> 오류

         int[] numbers = new int[3]; //정수 3개를 저장합니다.
         Product[] mycarts = new Product[5]; //product 객체 배열 - product 객체의 참조값 저장 배열
         mycarts[0]=drink;
         mycarts[1]=icecream;
         // mycarts[2]=drink;
         mycarts[3]=fruit;
         mycarts[4]=snack;
         System.out.println("~~~~~~mycarts~~~~~~~");
         //배열이므로 반복문으로 출력할 수 있습니다.
         for (int i=0;i<mycarts.length;i++){
            if(mycarts[i] !=null)
            System.out.println(mycarts[i].getData()); //mycarts[i] null일 때에는 메모리 할당이 안된상태, 메소드 사용 못합니다.
         }

    }
    
}
