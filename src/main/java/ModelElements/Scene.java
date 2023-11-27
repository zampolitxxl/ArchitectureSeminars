package ModelElements;

import java.lang.reflect.Type;

public class Scene {

    public  int  id;

    public  PoligonModel[] Models;

    public Flash[] flashes;

    public  Camera[] camera;


    public Scene(PoligonModel[] models, Flash[] flashes, Camera[] camera, int id) {
        Models = models;
        this.flashes = flashes;
        this.camera = camera;
        this.id = id;

    }
   public Type method1(Type type){
         return type;
   }

    public Type method2(Type type1, Type type2){
        return type1;
    }


}
