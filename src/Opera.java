import java.util.ArrayList;

public class Opera extends MusicalShow{

    private int choirSize;

    public Opera(String title, Integer duration, Director director,
                   Person musicAuthor,
                  String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText); // вызов конструктора родительского класса
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
