package com.ameer.composition.filesystem;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    protected File(File file) {
        this.name = file.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
