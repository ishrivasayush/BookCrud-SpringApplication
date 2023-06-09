package com.Narainox.DemoApplication.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {
    private long id;
    private String authorName;
    private int cost;

    public Book(long id, String authorName, int cost) {
        this.id = id;
        this.authorName = authorName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
