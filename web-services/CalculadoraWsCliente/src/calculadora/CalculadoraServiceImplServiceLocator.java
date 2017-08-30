/**
 * CalculadoraServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package calculadora;

public class CalculadoraServiceImplServiceLocator extends org.apache.axis.client.Service implements calculadora.CalculadoraServiceImplService {

    public CalculadoraServiceImplServiceLocator() {
    }


    public CalculadoraServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraServiceImpl
    private java.lang.String CalculadoraServiceImpl_address = "http://localhost:8080/CalculadoraWebService/services/CalculadoraServiceImpl";

    public java.lang.String getCalculadoraServiceImplAddress() {
        return CalculadoraServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraServiceImplWSDDServiceName = "CalculadoraServiceImpl";

    public java.lang.String getCalculadoraServiceImplWSDDServiceName() {
        return CalculadoraServiceImplWSDDServiceName;
    }

    public void setCalculadoraServiceImplWSDDServiceName(java.lang.String name) {
        CalculadoraServiceImplWSDDServiceName = name;
    }

    public calculadora.CalculadoraServiceImpl getCalculadoraServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraServiceImpl(endpoint);
    }

    public calculadora.CalculadoraServiceImpl getCalculadoraServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            calculadora.CalculadoraServiceImplSoapBindingStub _stub = new calculadora.CalculadoraServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraServiceImplEndpointAddress(java.lang.String address) {
        CalculadoraServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (calculadora.CalculadoraServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                calculadora.CalculadoraServiceImplSoapBindingStub _stub = new calculadora.CalculadoraServiceImplSoapBindingStub(new java.net.URL(CalculadoraServiceImpl_address), this);
                _stub.setPortName(getCalculadoraServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculadoraServiceImpl".equals(inputPortName)) {
            return getCalculadoraServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://calculadora", "CalculadoraServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://calculadora", "CalculadoraServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraServiceImpl".equals(portName)) {
            setCalculadoraServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
