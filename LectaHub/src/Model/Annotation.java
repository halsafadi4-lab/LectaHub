package model;


public class Annotation {
    private int id;
    private String content;
    private int timestamp;

    public Annotation(int id, String content, int timestamp) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("The content of the note cannot be empty.");
        }
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    public int getId() { return id; }
    public String getContent() { return content; }
    public int getTimestamp() { return timestamp; }
    
    @Override
    public String toString() {
        return "Annotation [ID=" + id + ", Time=" + timestamp + "s, Content=" + content + "]";
    }
}
