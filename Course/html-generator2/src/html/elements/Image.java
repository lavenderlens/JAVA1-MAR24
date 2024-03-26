package html.elements;

public class Image extends HTMLElement {

    private String src;

    public Image(String src) {
        this.src = src;
    }

    public Image(String style, String src) {
        this(src);
        this.style = style;

    }

    @Override
    public String toString() {
        return String.format("<img src=\"%s\" style=\"%s\" />", src, style);
    }

    public String getSrc() {
        return src;

    }
    public void setSrc(String src) {
        this.src = src;
    }
}