package DesignPatterns.L1.InMemoryModel;

import DesignPatterns.L1.ModelElements.Camera;
import DesignPatterns.L1.ModelElements.Flash;
import DesignPatterns.L1.ModelElements.PoligonalModel;
import DesignPatterns.L1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<IModelChangedObserver> changedObserver) {
        flashes = new ArrayList<>();
        flashes.add(new Flash());

        cameras = new ArrayList<>();
        cameras.add(new Camera());

        models = new ArrayList<>();
        models.add(new PoligonalModel(scenes, new ArrayList<>()));

        scenes = new ArrayList<>();
        scenes.add(new Scene(models, cameras));
    }

    public List<Scene> GetScena(int count) {
        scenes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            //scenes.add(new Scene());
        }
        return scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
