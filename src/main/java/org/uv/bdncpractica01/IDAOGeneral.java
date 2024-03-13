package org.uv.bdncpractica01;

import java.util.List;

/**
 *
 * @author Codigy
 */
public interface IDAOGeneral<T> {
    public boolean guardar(T p);
    public boolean modificar(T p);
    public boolean eliminar(T p);
    public T findById(long id);
    public List<T> findAll();
}
