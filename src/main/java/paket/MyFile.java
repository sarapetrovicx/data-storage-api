package paket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFile {
    private String type;
    private String timeCreated;
    private String lastModified;
    private double size;
    private String name;

    public MyFile(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date stringToDate(String choice) {
        Date date = null;

        try {
            if(choice.equalsIgnoreCase("modified"))
                date = new SimpleDateFormat("dd/MM/yyyy").parse(this.getTimeCreated());
            else if(choice.equalsIgnoreCase("created"))
                date = new SimpleDateFormat("dd/MM/yyyy").parse(this.getTimeCreated());
        } catch (ParseException p){
            p.printStackTrace();
            System.out.println("Date formatting failed");
        }

        return date;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", timeCreated='" + timeCreated + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", size=" + size;
    }
}