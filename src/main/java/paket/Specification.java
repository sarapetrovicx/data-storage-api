package paket;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

abstract public class Specification {

    public Configuration configuration;
    private String rootPath;

    abstract boolean init(String path);

    abstract boolean checkConfiguration(String parentFilePath, String filePath);

    public void makeConfiguration(int size, int numOfFiles, ArrayList<String> extensions){
        configuration =  new Configuration(size, numOfFiles, extensions);
        setConfiguration(configuration);
        writeConfiguraton(configuration);
    }

    abstract void writeConfiguraton(Configuration configuration);

    public void defaultConf(){
        ArrayList<String> ex = new ArrayList<>();
        ex.add("png");
        ex.add("jpg");
        ex.add("csv");
        configuration = new Configuration(700, 20, ex);
        setConfiguration(configuration);
        writeConfiguraton(configuration);
    }
    //ROOT DIRECTORY METHODS

    abstract void createRootDirectory();

    abstract void createRootDirectory(String path);

    abstract void createRootDirectory(String path, String name);

    abstract void createRootDirectory(String path, Configuration configuration);

    abstract void createRootDirectory(String path, String name, Configuration configuration);

    abstract void createRootDirectory(Configuration configuration);

    //DIECTORY METHODS
    abstract void makeDirectory();

    abstract void makeDirectory(String name);//postoji ili ne postoji

    abstract void makeDirectories(int numOfDir);

    abstract void makeDirectories(int numOfDir, ArrayList<String> names);

    //copy file
    abstract void copyFile(String source, String target) throws IOException;

    abstract void copyFiles(ArrayList<String> sources, String target) throws IOException;

    abstract void deleteFile(String path) throws IOException;

    abstract void deleteFiles(ArrayList<String> paths) throws IOException;

    abstract void deleteDirectory(String path) throws IOException;

    abstract void deleteDirectories(ArrayList<String> paths) throws IOException;

    abstract void moveFile(String from, String to) throws IOException;

    abstract void moveFiles(List<String> from, String to) throws IOException;

    abstract void downloadFile(String from, String to) throws IOException;

    abstract void downloadFiles(List<String> from, String to) throws IOException;

    abstract void renameFile(String path, String newName) throws IOException;

    abstract void renameDirectory(String path, String newName);

    //SEARCH ROOT METHODS
    abstract List<MyFile> returnFilesInDirectory(String path) throws IOException, ParseException; //vracamo nazive fajlova i metapodatke

    abstract List<MyFile> filesFromDirectories(String path);

    abstract List<MyFile> filesFromDirectoriesAndSubdirectories(String path) throws IOException, ParseException;

    abstract List<MyFile> returnFilesWithExt(String path, String extension) throws IOException, ParseException;

    abstract List<MyFile> returnFilesWithSubstring(String path, String substring) throws IOException, ParseException;

    abstract boolean containsFile(String path, String fileName) throws IOException;

    abstract boolean containsFiles(String path, ArrayList<String> fileNames) throws IOException;

    abstract String findFile (String fileName) throws IOException; //vrati ime foldera

    abstract List<MyFile> sortFiles(String path, boolean asc, SortBy by) throws IOException, ParseException;

    abstract List<MyFile> createdOrModifiedWithinTimePeriod(String path, String from, String to, String type) throws IOException, ParseException;

//    omogućiti filtriranje podataka koji se prikazuju za fajlove koji su rezultati
//    pretraga, na primer cela putanja (od korenskog direktorijuma) ili samo naziv,
//    veličina fajla, datum kreiranja, modifikacije, i slično.

    abstract List<String> filter(List<MyFile> results, SortBy filter);

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

}
