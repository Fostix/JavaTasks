package L1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures; // Aggregation

        poligons = new ArrayList<>(); // Composition
        poligons.add(new Poligon());
    }

    public PoligonalModel(Scene scene) {
        poligons = new ArrayList<>(); // Composition
        poligons.add(new Poligon());
    }
}
