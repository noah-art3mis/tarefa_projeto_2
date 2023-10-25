package loja.src.services.generic;

import loja.src.dao.generics.IGenericDAO;

public abstract class GenericService implements IGenericService {

  IGenericDAO dao;

  public GenericService(IGenericDAO dao) {
    this.dao = dao;
  }

  @Override
  public <T> T create(String id) {
    return dao.create(id);
  }

  @Override
  public Boolean delete(String id) {
    return dao.delete(id);
  }

  @Override
  public <T> T read(String id) {
    return dao.read(id);
  }

  @Override
  public Boolean update(String id) {
    return dao.update(id);
  }
}
