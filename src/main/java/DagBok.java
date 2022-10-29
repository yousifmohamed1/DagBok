import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class DagBok {
    public static  void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Date date=new Date();

        ObjectMapper objectMapper= new ObjectMapper();
        List<Post> PostFromJSON;

java.util.List<Post> postst = new java.util.ArrayList<>(List.of(objectMapper.readValue(Paths.get("src/main/Post.json").toFile(), Post[].class)));

        System.out.println(postst.get(0).getPost());
        List<Post> posts = new ArrayList<>(postst);
        String choice = "0";
        while (!choice.equals("3")) {
            System.out.println();
            System.out.println("Enter your choice between the following options\":");
            System.out.println("1 -  Read diar7y");
            System.out.println("2 - Write in the diary");
            System.out.println("3 -The diary ends now");
            choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    for (Post post: objectMapper.readValue(Paths.get("src/main/Post.json").toFile(),Post[].class)) {
                        System.out.println(post.getTitle());
                        System.out.println(post.getPost());
                        System.out.println(post.getDate());

                    }

                    break;
                case "2":
                    Post post= new Post();
                    System.out.println("Write a title for your diary");
                    String text2= scanner.nextLine();
                    post.setTitle(text2);
                    System.out.println("Write a text in your diary");
                    String text3= scanner.nextLine();
                    post.setPost(text3);
                    System.out.println("Thank you very much, here below can you read the "+
                            "entered title,text and the day and time you wrote it");
                    System.out.println(text2+", "+text3+": "+date.toString());

                    posts.add(post);
                    objectMapper.writeValue(Paths.get("src/main/Post.json").toFile(),posts);


                    break;
                case "3":
                    System.out.println("The diary ends now");
                    break;

                default:
                    System.out.println("The number you have entered is not in the range"
                            +"please choose another.");
                    String WrongNumber= scanner.nextLine();
                    break;

            }

        }
    }




}
