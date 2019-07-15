package by.bntu.fitr.povt.task19.dao.idao;

import java.io.Serializable;

/**
 * Created by Alexey Druzik on 29.08.2016.
 */
public interface IDAOUser<T extends Serializable> {
	 public void delete(Integer id);
}
