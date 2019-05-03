package design.pattern.test.behavior_patterns.chain_of_responsibility;

import design.pattern.test.behavior_patterns.chain_of_responsibility.model.Post;
import design.pattern.test.behavior_patterns.chain_of_responsibility.model.User;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        UserBuilder userBuilder = UserBuilder.getInstance();
        User user = (User) userBuilder.buildObject(User.class);
        Post post = (Post) userBuilder.buildObject(Post.class);
        System.out.println(user);
        System.out.println(post);
    }
}
