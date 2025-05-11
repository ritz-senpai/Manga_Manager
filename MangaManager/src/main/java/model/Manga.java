package model;

import javax.persistence.*;

@Entity
@Table(name = "manga")
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String mangaName;
    @Column(name = "category")
    private String mangaCategory;
    @Column(name = "rating")
    private float mangaRating;

    public Manga(){}

    public Manga(String mangaName,String mangaCategory, float mangaRating)
    {
        this.mangaName=mangaName;
        this.mangaCategory=mangaCategory;
        this.mangaRating=mangaRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMangaName() {
        return mangaName;
    }

    public void setMangaName(String mangaName) {
        this.mangaName = mangaName;
    }

    public String getMangaCategory() {
        return mangaCategory;
    }

    public void setMangaCategory(String mangaCategory) {
        this.mangaCategory = mangaCategory;
    }

    public float getMangaRating() {
        return mangaRating;
    }

    public void setMangaRating(float mangaRating) {
        this.mangaRating = mangaRating;
    }

    @Override
    public String toString() {
        return "Manga{id=" + id + ", Name='" + mangaName + "', Category='" + mangaCategory + "', Rating=" + mangaRating + "}";
    }
}
