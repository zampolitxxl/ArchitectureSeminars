package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public Point3D points;

    public  List<PoligonModel> poligonModels;

    public Poligon() {
        this.poligonModels = new ArrayList<>();
    }
}
