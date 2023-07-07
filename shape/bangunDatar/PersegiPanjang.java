package shape.bangunDatar;

public class PersegiPanjang {
  private Double panjang;
  private Double lebar;

  public PersegiPanjang() {
  }

  public PersegiPanjang(Double panjang, Double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public Double getPanjang() {
    return panjang;
  }

  public void setPanjang(Double panjang) {
    this.panjang = panjang;
  }

  public Double getLebar() {
    return lebar;
  }

  public void setLebar(Double lebar) {
    this.lebar = lebar;
  }

  public Double getKeliling() {
    return (2 * this.panjang) + (2 * this.lebar);
  }

  public Double getLuas() {
    return this.panjang * this.lebar;
  }

  public String getShapeName() {
    return "=== PERSEGI PANJANG ===";
  }
}
