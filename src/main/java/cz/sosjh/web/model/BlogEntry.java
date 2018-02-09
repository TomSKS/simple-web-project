package cz.sosjh.web.model;

import java.time.LocalDateTime;

public class BlogEntry {

    private String title;
    private LocalDateTime created;
    private String content;
    private String author;

    public BlogEntry(String title, LocalDateTime created, String content, String author) {
        this.title = title;
        this.created = created;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
