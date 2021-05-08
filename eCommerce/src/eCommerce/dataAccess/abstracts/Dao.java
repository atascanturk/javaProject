package eCommerce.dataAccess.abstracts;

import eCommerce.core.crudOperations.EntityCrudBase;

public interface Dao<Entity extends eCommerce.core.entities.Entity> extends EntityCrudBase<Entity> {
	
}
