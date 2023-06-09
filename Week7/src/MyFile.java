import java.io.File;

public class MyFile {

    public static void main (String[]args) {

        File dir = new File("NewFolder");

        if (dir.exists()) {
            System.out.println("Yippy Skippy, we have a directody");
        }
        else {
            System.out.println("We are lost in space, don't know where that directory is");
        }
    }
}
