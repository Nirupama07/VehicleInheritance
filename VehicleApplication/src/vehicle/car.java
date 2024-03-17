package vehicle;

public class car extends engine {
    private String Model;
    private String Colour;

    public car(String type, int Horsepower, String Model, String Colour) {
        super(type, Horsepower);
        this.Model = Model;
        this.Colour = Colour;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }
}

