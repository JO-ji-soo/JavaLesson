package object.day7.review;

public class ShapeReview {

  	static final int MAX_WIDTH=100;    //상수
		
		// 인스턴스 필드
		private String shapeName;		//도형 이름
		private int width;				//도형의 크기 중 너비
		private int height;				//도형의 크기 중 높이
		protected String etc;
		int round;  							//접근 한정자 없는 경우

		public ShapeReview(){
			//아래 커스텀 생성자 잇을 때는 기본 생성자가 사용하고 싶으면 직접 정의하기
			System.out.println("새로운 도형이 만들어졌습니다. 초기화 필요합니다.");
		}
		// 인스턴스 필드값 초기화하는 생성자
		public ShapeReview(String shapeName, int width,int height) {
				this.shapeName=shapeName;
				this.width=width;
				this.height=height;
		}
		
		// 필드값을 리턴하는 getXXX 메소드
		public String getShapeName() {
			return shapeName;
		}
		
		public int getWidth() {
			return width;
		}
		
		public int getHeight() {
			return height;
		}
		
		// setXXX 메소드 없음.('초기값을 바꿀수 없다'는 요구조건을 예시로 합니다. )
		
		// 도형의 면적(넓이) 계산하는 메소드 (계산식은 너비 *높이)
		public int calculateArea() {
			return this.width*this.height;
		}
	
		// final 메소드 - 재정의 할수 없는 메소드로 만들어야 할때 사용합니다.
		public final void print() {
			System.out.println("final 메소드 테스트-" + shapeName + "의 너비:" + width +",높이:" 
					+height + ",면적:" + calculateArea());
		}
		
}
