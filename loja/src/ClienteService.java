package loja.src;

public class ClienteService implements IClienteService {

  IClienteDAO clienteDAO;

  public ClienteService(IClienteDAO clienteDAO) {
    this.clienteDAO = clienteDAO;
  }

  @Override
  public Cliente create(String id) {
    return clienteDAO.create(id);
  }

  @Override
  public Cliente read(String id) {
    return clienteDAO.read(id);
  }

  @Override
  public Boolean update(String id) {
    return clienteDAO.update("123");
  }

  @Override
  public Boolean delete(String id) {
    return clienteDAO.delete("123");
  }
}
