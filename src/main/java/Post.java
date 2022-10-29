public class Post {
int day;
String date;
String title;
String post;

    public Post(int day, String date, String title, String post) {
        this.day = day;
        this.date = date;
        this.title = title;
        this.post = post;
    }

    public Post() {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
