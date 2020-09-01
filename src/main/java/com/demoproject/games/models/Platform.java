package com.demoproject.games.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;

/**
 * @author  Ahmed Salem
 */

@Entity(name="platforms")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long platform_id;
    private String platform;

    @ManyToMany(mappedBy = "platforms")
    @JsonIgnore
    private List<Game> games;

    public void setPlatform_id(Long platform_id) {
        this.platform_id = platform_id;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getPlatform_id() {
        return platform_id;
    }

    public String getPlatform() {
        return platform;
    }
}


