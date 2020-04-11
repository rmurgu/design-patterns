package creational.simplefactory;

public class App {

    public static void main(String[] args) {
        Post post = PostFactory.createPost(PostType.PRODUCT);

        System.out.println(post);
    }
}
