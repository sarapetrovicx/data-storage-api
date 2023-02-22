package paket;

import java.util.ArrayList;

public class Configuration {
    private int size;
    private int numOfFiles;
    private ArrayList<String> extensions;

    public Configuration(int size, int numOfFiles, ArrayList<String> extensions) {
        this.size = size;
        this.numOfFiles = numOfFiles;
        this.extensions = extensions;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumOfFiles() {
        return numOfFiles;
    }

    public void setNumOfFiles(int numOfFiles) {
        this.numOfFiles = numOfFiles;
    }

    public ArrayList<String> getExtensions() {
        return extensions;
    }

    public void setExtensions(ArrayList<String> extensions) {
        this.extensions = extensions;
    }
}
