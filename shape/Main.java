package shape;

import java.util.Scanner;

import shape.bangunDatar.Persegi;
import shape.bangunRuang.Kubus;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("==== MENU BANGUN ====");
      String menu = input.nextLine()
    } catch (Exception e) {
      // TODO: handle exception
    }
    // INSTANCE OBJ PERSEGI
    Persegi persegi = new Persegi(6.);
    System.out.println(persegi);
    System.out.println(persegi.getShapeName());
    System.out.println("KELILING: " + persegi.getKeliling());
    System.out.println("LUAS: " + persegi.getLuas());

    persegi = new Persegi(8.);
    System.out.println(persegi);
    System.out.println(persegi.getShapeName());
    System.out.println("KELILING: " + persegi.getKeliling());
    System.out.println("LUAS: " + persegi.getLuas());

    persegi.setSisi(Double.valueOf(10));
    System.out.println(persegi);
    System.out.println(persegi.getShapeName());
    System.out.println("KELILING: " + persegi.getKeliling());
    System.out.println("LUAS: " + persegi.getLuas());

    // INSTANCE KUBUS
    Kubus kubus = new Kubus();
    kubus.setSisi(persegi.getSisi());
    System.out.println(kubus);
    System.out.println(kubus.getShapeName());
    System.out.println("KELILING: " + kubus.getKeliling());
    System.out.println("LUAS: " + kubus.getLuas());
    System.out.println("VOLUME: " + kubus.getVolume());

    // INSTANCE OBJ TEST
    Test test = new Test();
    test.setSisi(-5.);
    System.out.println(test.getSisi());
  }
}
