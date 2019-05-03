package design.pattern.test.initialize_patterns.builder;

/**
 * Through builder pattern can build object
 **/
public class UserBuilder {

    private User user = new User();

    private UserBuilder(){}

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public User build(){
        return user;
    }

    public UserBuilder id(int id){
        user.setId(id);
        return this;
    }

    public UserBuilder name(String name){
        user.setName(name);
        return this;
    }
}