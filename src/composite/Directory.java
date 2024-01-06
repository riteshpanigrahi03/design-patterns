package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> childComponents;

    public Directory(String name) {
        this.name = name;
        this.childComponents = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println("Directory ->"+ this.name);
        childComponents.forEach(FileSystemComponent::ls);
    }

    public void addComponent(FileSystemComponent component) {
        this.childComponents.add(component);
    }
}
