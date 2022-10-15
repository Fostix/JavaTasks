package L1.InMemoryModel;

import DesignPatterns.L1.ModelElements.Camera;
import DesignPatterns.L1.ModelElements.Flash;
import DesignPatterns.L1.ModelElements.PoligonalModel;
import DesignPatterns.L1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore {
    public List<PoligonalModel> Models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver changedObserver;

    public List<Scene> GetScena(int count) {
        scenes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            //scenes.add(new Scene());
        }
        return scenes;
    }

    public void NotifyChange(IModelChanger iModelChanger) {

    }
}
