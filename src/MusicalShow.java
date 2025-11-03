import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, Integer duration, Director director,
                       Person musicAuthor, String librettoText) {
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
