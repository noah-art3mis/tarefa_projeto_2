package loja.src.dao;

import loja.src.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {

  public Cliente create(String id) {
    return new Cliente("1111111111");
  }

  public Cliente read(String id) {
    return new Cliente(id);
  }

  public Boolean update(String id) {
    return true;
  }

  public Boolean delete(String id) {
    return true;
  }
}
