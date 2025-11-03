import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, Integer duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director); // вызов конструктора родительского класса
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLiberto() {
        if (librettoText.length() > 0) {
            System.out.println(librettoText);
        }
    }
}
