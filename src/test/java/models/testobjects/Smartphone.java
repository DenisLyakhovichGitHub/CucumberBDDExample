package models.testobjects;
import models.valueobjects.Ram;
import models.valueobjects.Company;
import java.io.Serializable;

public class Smartphone {
  // Оперативная память
  private Ram ram;
  // Компания
  private Company company;
  // Конструктор по умолчанию
  public Smartphone() {

  }
  // Конструктор
  public Smartphone(Ram ram, Company company) {
    this.ram = ram;
    this.company = company;
  }
  // Сеттеры и геттеры
// Оперативная память
  public void setRam(Ram ram) {
    this.ram = ram;
  }

  public Ram getRam() {
    return this.ram;
  }
  // Компания
  public void setCompany(Company company) {
    this.company = company;
  }

  public Company getCompany() {
    return this.company;
  }
}
