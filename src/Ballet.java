import java.util.ArrayList;

public class Ballet extends MusicalShow{
    String choreographer;

    public Ballet(String title, Integer duration, Director director,
                   String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText); // вызов конструктора родительского класса
        this.choreographer = choreographer;
    }
}

