package com.ameer.composition.filesystem;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Represents a folder in a file system, which can contain files and subfolders.
 * Demonstrates composition by containing File and Folder objects.
 * Shows an "OWNS-A" relationship since new File and Folder objects are created within this class.
 */
public class Folder {
    private final String name;
    private final Map<String, File> files = new TreeMap<>(); // Using TreeMap to keep files sorted by name
    private final Map<String, Folder> subFolders = new TreeMap<>(); // Using TreeMap to keep folders sorted by name

    // Copy constructor
    public Folder(Folder folder) {
        this(folder.getName(), folder.getFiles(), folder.getSubFolders());
    }

    public Folder(String name) {
        this.name = name;
    }

    public Folder(String name, Collection<File> files, Collection<Folder> subFolders) {
        this.name = name;
        for (File file : files) {
            this.files.put(file.getName(), new File(file)); // create new file object
        }
        for (Folder subFolder : subFolders) {
            this.subFolders.put(
                    subFolder.getName(), new Folder(
                            subFolder.getName(),
                            subFolder.getFiles(),
                            subFolder.getSubFolders()
                    )
            ); // create new folder object
        }
    }

    public Folder addFile(File file) {
        files.put(file.getName(), new File(file));
        return this;
    }

    public Folder addSubFolder(Folder folder) {
        subFolders.put(folder.getName(), new Folder(folder));
        return this;
    }

    public void removeFile(String fileName) {
        files.remove(fileName);
    }

    public void removeSubFolder(String folderName) {
        subFolders.remove(folderName);
    }

    public String getName() {
        return name;
    }

    public Collection<File> getFiles() {
        return files.values();
    }

    public Collection<Folder> getSubFolders() {
        return subFolders.values();
    }

    public File getFile(String fileName) {
        return files.get(fileName);
    }

    public Folder getSubFolder(String folderName) {
        return subFolders.get(folderName);
    }

    public void printFolderStructure() {
        printFolderStructure(0);
    }

    private void printFolderStructure(int currentDepth) {
        String indent = "  ".repeat(currentDepth * 2);
        // 📁
        String FOLDER_ICON = "\uD83D\uDCC1";
        System.out.println(indent + FOLDER_ICON + name);
        for (Folder folder : subFolders.values()) {
            folder.printFolderStructure(currentDepth + 1);
        }
        for (File file : files.values()) {
            // 📄
            String FILE_ICON = "\uD83D\uDCC4";
            System.out.println(indent + FILE_ICON + file.getName());
        }
    }
}
