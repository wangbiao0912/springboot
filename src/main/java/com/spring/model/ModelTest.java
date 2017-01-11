package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wangbiao on 17-1-10.
 */
@ConfigurationProperties(locations="classpath:application.yml", prefix = "com.web")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ModelTest {

    @Id
    @GeneratedValue
    private int modelId;
    private String name;
    private String title;
    private String action;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
