package mappers;

import units.Location;

import javax.persistence.EntityManager;
import java.util.List;

public class LocationMapper implements CRUDInterface<Location>{
    private DataMapper dm;

    public LocationMapper(){
        this.dm = new DataMapper(DataVars.PU);
    }

    public LocationMapper(String PU){
        this.dm = new DataMapper(PU);
    }

    private EntityManager getEntityManager() {
        return dm.getEMF().createEntityManager();
    }

    public List returnAllEntities() {
        return null;
    }

    public Location createEntity(Location entity) {
        return null;
    }

    public Location readEntity(int id) {
        return null;
    }

    public Location editEntity(Location entity) {
        return null;
    }

    public void deleteEntity(int id) {

    }
}
