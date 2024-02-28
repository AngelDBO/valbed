package com.valbed.valbed.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 255)
    private String title;
    @Column(nullable = false, length = 255)
    private String brief;
    @Lob
    @Column(name="content", columnDefinition = "TEXT")
    private String content;
    @Column(nullable = false, length = 255)
    private String image;
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date created_at;
    @LastModifiedDate
    @Column(name = "updated_at")
    private Date updated_at;
    @Column(name = "status")
    private String status;

    @ManyToOne
    private Category category;
    @ManyToOne
    private Autor autor;

    public Post(){}

    public Post(Integer id, String title, String brief, String content, String image, Date created_at, Date updated_at, String status, Category category/*, Autor autor*/) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.image = image;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.status = status;
        this.category = category;
//        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

//    public Autor getAutor() {
//        return autor;
//    }
//
//    public void setAutor(Autor autor) {
//        this.autor = autor;
//    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", status='" + status + '\'' +
                ", category=" + category +
                '}';
    }
}
