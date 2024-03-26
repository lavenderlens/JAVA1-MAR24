package html.elements;

public class Heading extends HTMLElement{

    private int level;


    @Override
    public String toString() {
        return String.format("<h%s style=\"%s\">%s</h%s>", level, style, content, level);
    }


    public Heading(String content, String style, int level) {
        super(content, style);
        this.level = level;
    }

    public Heading(String content, int level) {
        super(content);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
