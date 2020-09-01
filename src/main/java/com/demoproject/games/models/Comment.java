package com.demoproject.games.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

/**
 * @author  Ahmed Salem
 */

@Entity(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;

    private String message;

//    private Date dateCreated;

    @Column(name = "likes")
    private Long like;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    @JsonIgnore
    private Game game;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user")
//    @JsonIgnore
//    private User user;

    @Column(name = "datecreated")
    private String dateCreated;

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Long getComment_id() {
        return comment_id;
    }

    public String getMessage() {
        return message;
    }

    public Long getLike() {
        return like;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLike(Long like) {
        this.like = like;
    }

}
