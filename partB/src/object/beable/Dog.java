package object.beable;

public class Dog implements Runnable {

  @Override
  public String run(int speed) {
    return "Dog은"+speed+"km/h로 달립니다. \n최대 속도로 50km/h...";
  }

  @Override
  public String beAble() {
    return "달리기";
  }


  
}
