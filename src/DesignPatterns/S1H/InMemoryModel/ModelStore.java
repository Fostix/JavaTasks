package DesignPatterns.S1H.InMemoryModel;

import DesignPatterns.S1H.ModelElements.Camera;
import DesignPatterns.S1H.ModelElements.Flash;
import DesignPatterns.S1H.ModelElements.PoligonalModel;
import DesignPatterns.S1H.ModelElements.Scene;

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
