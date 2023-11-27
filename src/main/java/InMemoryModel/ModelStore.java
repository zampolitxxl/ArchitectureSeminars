package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements  IModelChanger{
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;

    public List<Camera> cameras;

    private  IModelChangeObserver[] changeObserver;

    public ModelStore(IModelChangeObserver[] changeObserver) {
        this.changeObserver = changeObserver;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();


    }

    public  Scene GetScene(int id){
        return  this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        throw  new UnsupportedOperationException("message");
    }
}
