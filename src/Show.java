import java.util.ArrayList;

public class Show {
    String title;
    Integer duration;
    Director director;
    ArrayList<Actor> listOfActors;


    public Show(String title, Integer duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(); // Инициализация списка
    }

    public void printActors() {
        for (Actor e : listOfActors) {
            System.out.println(e.toString());
        }
    }

    public void addActor(Actor e) {
        if (!listOfActors.contains(e)) {
            listOfActors.add(e); //Актёр добавлен
        } else {
            System.out.println("Актер уже ранее был добавлен");
        }
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        boolean actorIsFound = false;
        for (Actor e : listOfActors) {
            if (e.surname.equals(oldSurname)) {
                int index = listOfActors.indexOf(e);
                Actor oldActor = listOfActors.set(index, newActor);
                System.out.println("Актер " + oldActor.surname + " " + oldActor.name +
                        " заменен на " + newActor.surname + " " + newActor.name +
                        " в спектакле '" + title + "'");
                actorIsFound = true;
                break;
            }
        }

        if (!actorIsFound) {
            System.out.println("Актер с фамилией '" + oldSurname + "' не найден");
        }
    }



}
