package object.day8;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

public class Member {
  private String name;
  private int age;

  public Member(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  //다형성 예시 : 메소드 인자가 부모 타입일 때, 실제 객체는 여러 자식 객체가 될 수 있습니다.
  public boolean isAdopt(Animal animal){

    //AND 연산 특징 : 참&&참=참, 참&&거짓 =거짓, 거짓&&참=거짓, 거짓&&거짓=거짓
    //OR 연산 특징 : 참||참=참, 참||거짓 =참, 거짓||참=참, 거짓||거짓=거짓
    if(animal instanceof Puppy && this.age >=15) 
        return true;
    else if (animal instanceof Cat && this.age >=18) 
        return true;
    else if (animal instanceof Rabbit && this.age >=13) 
        return true;
    else
        return false;
    }

    public String getName(){
      return name;
    }

  
    @Override
    public String toString() {
      return "(name="+name+",age="+age+")";
    }
  }

