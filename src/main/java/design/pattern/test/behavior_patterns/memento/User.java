package design.pattern.test.behavior_patterns.memento;

public class User {

    private int id;

    private String name;

    private String surname;

    private UserMemento userMemento = new UserMemento();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        userMemento.setId(this.id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        userMemento.setName(this.name);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        userMemento.setSurname(this.surname);
        this.surname = surname;
    }

    public void returnPreviousChanges(){
        this.id = userMemento.getId();
        this.name = userMemento.getName();
        this.surname = userMemento.getSurname();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
