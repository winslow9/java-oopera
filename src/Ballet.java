import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected Person choreographer;

    public Ballet(String title, Integer duration, Director director,
                   Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText); // вызов конструктора родительского класса
        this.choreographer = choreographer;
    }
}

