package edu.osu.waiting4ubackend.entity;

/**
 * Entity for User class
 */
public class User {
    private String id;
    private String userName;
    private String password;
    private String email;
    private String introduction;
    //private String preference;

    public User(){
    }

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.userName = userBuilder.user_name;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
        //this.preference = userBuilder.preference;
        this.introduction = userBuilder.introduction;
    }

    /*public User(String userName, String password, String email, String introduction) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.preference = "ON";
        this.introduction = introduction;
    }*/

    public String getId() {
        return id;
    }

    //public void setId(String id){ this.id = id; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String newUserName) { this.userName = newUserName; }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String newPassword) { this.password = newPassword; }

    /*public String getPreference() {
        return preference;
    }*/

    public String getIntroduction() { return introduction; }

    public void setIntroduction(String newIntroduction) { this.introduction = newIntroduction; }

    /*public void setPreference(String preference){
        this.preference = newPreference;
    }*/

    public static class UserBuilder {
        private String id;
        private String user_name;
        private String password;
        private String email;
        private String introduction;
        //private String preference;

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.user_name = userName;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        /*public UserBuilder setPreference(<String preference) {
            this.preference = preference;
            return this;
        }*/

        public User build() {
            return new User(this);
        }
    }
}
