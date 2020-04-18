package structural.composite;

public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }
}
