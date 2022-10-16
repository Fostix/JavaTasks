package DesignPatterns.L1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonalModel(List<Scene> scenes, List<Texture> textures) {
        this.textures = textures; // Aggregation

        poligons = new ArrayList<>(); // Composition
        poligons.add(new Poligon());
    }
}
