public class Director extends Person  {
    int numberOfShows;

    //Конструктор режисёра
    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                '}';
    }
}
