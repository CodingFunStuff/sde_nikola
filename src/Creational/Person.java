package Creational;

public class Person {
  private final String name;
  private final int age;
  private final String address;

  private Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  // --Commented out by Inspection (1/10/23, 14:12):public String getName() { return name; }
  // --Commented out by Inspection (1/10/23, 14:12):public int getAge() { return age; }
  // --Commented out by Inspection (1/10/23, 14:12):public String getAddress() { return address; }

  public static class PersonBuilder {
    private String name;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public PersonBuilder setAge(int age) {
      this.age = age;
      return this;
    }

    public PersonBuilder setAddress(String address) {
      this.address = address;
      return this;
    }

    public Person createPerson() {
      return new Person(name, age, address);
    }
  }
}