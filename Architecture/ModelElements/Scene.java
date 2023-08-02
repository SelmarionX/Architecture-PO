package ModelElements;


import java.util.ArrayList;
import java.util.List;


public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List <Flash> flashes;

    public List<Camera> cameras = new ArrayList<>();

  
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if(!models.isEmpty()) {
            this.models = models;
        } else{
            throw new Exception("Список моделей не может быть пустым!");
        }
        this.flashes = flashes;
        if (!cameras.isEmpty()) {
            this.cameras = cameras;
        }else{
            throw new Exception("Список камер не может быть пустым!");
        }
    }

 
    public <T> T method1(T value){
        return value;
    }


    public <T, E> T method2(T value1, E value2){
        return value1;
    }
}