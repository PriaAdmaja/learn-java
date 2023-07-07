package shape.bangunDatar;

public class Persegi {
  // ATRIBUT
  private Double sisi;

  // CONSTRUCTOR
  public Persegi() {
  }

  public Persegi(Double sisi) {
    this.sisi = sisi;
  }

  public Persegi(Double sisi, String shapeName) {
    this.sisi = sisi;
  }

  // SETTER AND GETTER
  public Double getSisi() {
    return sisi;
  }

  public Double getSisi(Double sisi) {
    return sisi;
  }

  public void setSisi(Double sisi) {
    if (sisi < 0) {
      throw new IllegalArgumentException("sisi must be positive numbers");
    }
    this.sisi = sisi;
  }

  // CUSTOM METHOD
  public Double getKeliling() {
    return 4 * this.sisi;
  }

  public Double getLuas() {
    return this.sisi * this.sisi;
  }

  public String getShapeName() {
    return "=== PERSEGI ===";
  }
}
