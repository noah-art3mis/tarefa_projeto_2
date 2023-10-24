package loja.src;

public interface IClienteDAO {
  public Cliente create(String id);

  public Cliente read(String id);

  public Boolean update(String id);

  public Boolean delete(String id);
}
