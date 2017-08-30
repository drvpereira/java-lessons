package calculadora;

public class CalculadoraServiceImplProxy implements calculadora.CalculadoraServiceImpl {
  private String _endpoint = null;
  private calculadora.CalculadoraServiceImpl calculadoraServiceImpl = null;
  
  public CalculadoraServiceImplProxy() {
    _initCalculadoraServiceImplProxy();
  }
  
  public CalculadoraServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraServiceImplProxy();
  }
  
  private void _initCalculadoraServiceImplProxy() {
    try {
      calculadoraServiceImpl = (new calculadora.CalculadoraServiceImplServiceLocator()).getCalculadoraServiceImpl();
      if (calculadoraServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraServiceImpl != null)
      ((javax.xml.rpc.Stub)calculadoraServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public calculadora.CalculadoraServiceImpl getCalculadoraServiceImpl() {
    if (calculadoraServiceImpl == null)
      _initCalculadoraServiceImplProxy();
    return calculadoraServiceImpl;
  }
  
  public int dividir(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServiceImpl == null)
      _initCalculadoraServiceImplProxy();
    return calculadoraServiceImpl.dividir(a, b);
  }
  
  public int multiplicar(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServiceImpl == null)
      _initCalculadoraServiceImplProxy();
    return calculadoraServiceImpl.multiplicar(a, b);
  }
  
  public int somar(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServiceImpl == null)
      _initCalculadoraServiceImplProxy();
    return calculadoraServiceImpl.somar(a, b);
  }
  
  public int subtrair(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServiceImpl == null)
      _initCalculadoraServiceImplProxy();
    return calculadoraServiceImpl.subtrair(a, b);
  }
  
  
}