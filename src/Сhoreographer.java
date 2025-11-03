public class Сhoreographer extends Person {
    private boolean isСhoreographer = true;

    //Конструктор режисёра
    public Сhoreographer(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
    }

    @Override
    public String toString() {
        return "Сhoreographer{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                '}';
    }
}
