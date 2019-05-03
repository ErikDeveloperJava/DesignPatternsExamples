package design.pattern.test.behavior_patterns.chain_of_responsibility.model;

import design.pattern.test.behavior_patterns.chain_of_responsibility.anotations.IntegerValue;
import design.pattern.test.behavior_patterns.chain_of_responsibility.anotations.StringValue;

public class Post {

    @IntegerValue(1)
    private int id;

    @StringValue("post_01")
    private String name;

    @IntegerValue(20)
    private int viewedUsersCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewedUsersCount() {
        return viewedUsersCount;
    }

    public void setViewedUsersCount(int viewedUsersCount) {
        this.viewedUsersCount = viewedUsersCount;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", viewedUsersCount=" + viewedUsersCount +
                '}';
    }
}
