package html.elements;

public abstract class HTMLElement {

    protected String content;
    protected String style;

    public HTMLElement() {
        this.content = "";
        this.style = "";
    }

    public HTMLElement(String content) {
        this();
        this.content = content;
    }

    public HTMLElement(String content, String style) {
        this(content);
        this.style = style;
    }
    @Override
    public abstract String toString();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
