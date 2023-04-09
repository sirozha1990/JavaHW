package task;

public class Notebook {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private double price;

    public Notebook(String model, int ram, int hdd, String os, String color, double price) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}