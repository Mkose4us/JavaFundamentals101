package classNotes;

public class SlackUser {
    private String name;
    private String email;
    private String groupNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public SlackUser(String name, String email, String groupNum) {
        this.name = name;
        this.email = email;
        this.groupNum = groupNum;
    }

    public SlackUser() {
this("melek","melk@gmail","4");
    }

    @Override
    public String toString() {
        return "SlackUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", groupNum='" + groupNum + '\'' +
                '}';
    }

    public String sendMessage(String channel, String content){
return this.name+"send message"+content+"to channel"+channel;
    }
}
