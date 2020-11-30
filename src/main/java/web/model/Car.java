package web.model;

public class Car {
    private String model;
    private int series;
    private String color;

    public Car() {}

    public Car(String model, int series, String color){
        this.model = model;
        this.series = series;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
