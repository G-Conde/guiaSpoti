package Models;

public class Artist {
    private String name;
    private Integer age;
    private String Nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public Artist(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        Nationality = nationality;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }
}
