package L1.ModelElements;

import DesignPatterns.L1.ModelElements.othersModels.Type;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> camera) {
        this.flashes = flashes;
        this.models = models;
        this.cameras = camera;
    }

    public Scene(List<PoligonalModel> models, List<Camera> camera) {
        this.models = models;
        this.cameras = camera;
    }

    public Type Method1(Type type) {
        return type;
    }

    public Type Method1(Type type1, Type type2) {
        return type1;
    }
}
