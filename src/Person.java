public class Person {
  private String name;
  private String phoneNumber;
  private String city;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", city='" + city + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (name != null ? !name.equals(person.name) : person.name != null) return false;
    if (phoneNumber != null ? !phoneNumber.equals(person.phoneNumber) : person.phoneNumber != null) return false;
    return city != null ? city.equals(person.city) : person.city == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    return result;
  }
}