package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addFile(File file) {
        children.add(file);
    }

    public void removeFile(File file) {
        children.remove(file);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        children.forEach(File::ls);
    }
}
