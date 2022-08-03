import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {

    String id;
    String text;
    String type;
    String user;
    int upvotes;

    public Cats(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;

    }

    @Override
    public String toString() {
        return "\nid: " + id +
                "\ntext: " + text +
                "\ntype: " + type +
                "\nuser: " + user +
                "\nupvotes: " + upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }
}
