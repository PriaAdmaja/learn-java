package shape.bangunRuang;

import shape.bangunDatar.PersegiPanjang;

public class Balok extends PersegiPanjang {
  private Double tinggi;

  public Balok(Double panjang, Double lebar, Double tinggi) {
    super(panjang, lebar);
    this.tinggi = tinggi;
  }

  public Balok(Double panjang, Double lebar) {
    super(panjang, lebar);
  }

  public Balok() {
  }

  public Double getTinggi() {
    return tinggi;
  }

  public void setTinggi(Double tinggi) {
    this.tinggi = tinggi;
  }

  public Double getVolume() {
    return super.getLuas() * this.tinggi;
  }

  @Override
  public String getShapeName() {
    return "=== BALOK ===";
  }

}
