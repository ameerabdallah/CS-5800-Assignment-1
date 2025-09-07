package com.ameer.composition;

import com.ameer.composition.filesystem.File;
import com.ameer.composition.filesystem.Folder;

public class DriverProgram {
    public static void main(String[] args) {
        Folder php_demo1 = new Folder("php_demo1");

        php_demo1.addSubFolder(
                new Folder("Source Files")
                        // Files
                        .addFile(new File(".htaccess"))
                        .addFile(new File(".htrouter.php"))
                        .addFile(new File("index.html"))
                        .addSubFolder(new Folder(".phalcon"))
                        .addSubFolder(
                                new Folder("app")
                                        .addSubFolder(new Folder("config"))
                                        .addSubFolder(new Folder("controllers"))
                                        .addSubFolder(new Folder("library"))
                                        .addSubFolder(new Folder("migrations"))
                                        .addSubFolder(new Folder("models"))
                                        .addSubFolder(new Folder("views"))
                        )
                        .addSubFolder(new Folder("cache"))
                        .addSubFolder(new Folder("public"))
                );
        php_demo1.printFolderStructure();

        php_demo1.getSubFolder("Source Files")
                .removeSubFolder("app");
        System.out.println("==============================\n");

        System.out.println("\nAfter removing 'app' subfolder:\n");
        php_demo1.printFolderStructure();
        System.out.println("==============================\n");

        php_demo1.getSubFolder("Source Files").removeSubFolder("public");

        System.out.println("\nAfter removing 'public' subfolder:\n");
        php_demo1.printFolderStructure();
    }

}
