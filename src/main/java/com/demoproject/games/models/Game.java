package com.demoproject.games.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * @author  Ahmed Salem
 */

@Entity(name="games")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long game_id;
    private String title;
    private String description;

    @Column(name="createdby")
    private String by;

    @ManyToMany
    @JoinTable(name = "game_platforms",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name="platform_id"))


    private List<Platform> platforms;

    private String age_rating;
    private long likes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "game")
    private List<Comment> comments;

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setGame_id(Long game_id) {
        this.game_id = game_id;
    }

    public Long getGame_id() {
        return game_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public void setAge_rating(String age_rating) {
        this.age_rating = age_rating;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBy() {
        return by;
    }

    public String getAge_rating() {
        return age_rating;
    }

    public long getLikes() {
        return likes;
    }

}
