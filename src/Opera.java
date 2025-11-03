import java.util.ArrayList;

public class Opera extends MusicalShow{
    int choirSize;

    public Opera(String title, Integer duration, Director director,
                   String musicAuthor,
                  String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText); // вызов конструктора родительского класса
        this.choirSize = choirSize;
    }
}
