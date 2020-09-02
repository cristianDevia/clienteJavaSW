
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CargarDatosPrograma_QNAME = new QName("http://model/", "cargarDatosPrograma");
    private final static QName _ListarMatriculas_QNAME = new QName("http://model/", "listarMatriculas");
    private final static QName _BuscarEstudiantePorCodigo_QNAME = new QName("http://model/", "buscarEstudiantePorCodigo");
    private final static QName _GetMatriculasResponse_QNAME = new QName("http://model/", "getMatriculasResponse");
    private final static QName _CargarDatosMatricula_QNAME = new QName("http://model/", "cargarDatosMatricula");
    private final static QName _ListarProgramas_QNAME = new QName("http://model/", "listarProgramas");
    private final static QName _ActualizarEstudiantePorCodigo_QNAME = new QName("http://model/", "actualizarEstudiantePorCodigo");
    private final static QName _BuscarMatricula_QNAME = new QName("http://model/", "buscarMatricula");
    private final static QName _AnadirEstudiante_QNAME = new QName("http://model/", "anadirEstudiante");
    private final static QName _ListarMatriculasResponse_QNAME = new QName("http://model/", "listarMatriculasResponse");
    private final static QName _ListarEstudiantes_QNAME = new QName("http://model/", "listarEstudiantes");
    private final static QName _AnadirMatricula_QNAME = new QName("http://model/", "anadirMatricula");
    private final static QName _GetMatriculas_QNAME = new QName("http://model/", "getMatriculas");
    private final static QName _EliminarPorCodigoEstudiante_QNAME = new QName("http://model/", "eliminarPorCodigoEstudiante");
    private final static QName _GetEstudiantesResponse_QNAME = new QName("http://model/", "getEstudiantesResponse");
    private final static QName _GetEstudiantes_QNAME = new QName("http://model/", "getEstudiantes");
    private final static QName _ListarProgramasResponse_QNAME = new QName("http://model/", "listarProgramasResponse");
    private final static QName _EliminarPorNumeroMatricula_QNAME = new QName("http://model/", "eliminarPorNumeroMatricula");
    private final static QName _ListarEstudiantesResponse_QNAME = new QName("http://model/", "listarEstudiantesResponse");
    private final static QName _BuscarMatriculaResponse_QNAME = new QName("http://model/", "buscarMatriculaResponse");
    private final static QName _BuscarEstudiantePorCodigoResponse_QNAME = new QName("http://model/", "buscarEstudiantePorCodigoResponse");
    private final static QName _ActualizarMatricula_QNAME = new QName("http://model/", "actualizarMatricula");
    private final static QName _CargarDatosEstudiantes_QNAME = new QName("http://model/", "cargarDatosEstudiantes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarMatriculaResponse }
     * 
     */
    public BuscarMatriculaResponse createBuscarMatriculaResponse() {
        return new BuscarMatriculaResponse();
    }

    /**
     * Create an instance of {@link BuscarEstudiantePorCodigoResponse }
     * 
     */
    public BuscarEstudiantePorCodigoResponse createBuscarEstudiantePorCodigoResponse() {
        return new BuscarEstudiantePorCodigoResponse();
    }

    /**
     * Create an instance of {@link ActualizarMatricula }
     * 
     */
    public ActualizarMatricula createActualizarMatricula() {
        return new ActualizarMatricula();
    }

    /**
     * Create an instance of {@link CargarDatosEstudiantes }
     * 
     */
    public CargarDatosEstudiantes createCargarDatosEstudiantes() {
        return new CargarDatosEstudiantes();
    }

    /**
     * Create an instance of {@link ListarProgramasResponse }
     * 
     */
    public ListarProgramasResponse createListarProgramasResponse() {
        return new ListarProgramasResponse();
    }

    /**
     * Create an instance of {@link EliminarPorNumeroMatricula }
     * 
     */
    public EliminarPorNumeroMatricula createEliminarPorNumeroMatricula() {
        return new EliminarPorNumeroMatricula();
    }

    /**
     * Create an instance of {@link ListarEstudiantesResponse }
     * 
     */
    public ListarEstudiantesResponse createListarEstudiantesResponse() {
        return new ListarEstudiantesResponse();
    }

    /**
     * Create an instance of {@link EliminarPorCodigoEstudiante }
     * 
     */
    public EliminarPorCodigoEstudiante createEliminarPorCodigoEstudiante() {
        return new EliminarPorCodigoEstudiante();
    }

    /**
     * Create an instance of {@link GetEstudiantesResponse }
     * 
     */
    public GetEstudiantesResponse createGetEstudiantesResponse() {
        return new GetEstudiantesResponse();
    }

    /**
     * Create an instance of {@link GetEstudiantes }
     * 
     */
    public GetEstudiantes createGetEstudiantes() {
        return new GetEstudiantes();
    }

    /**
     * Create an instance of {@link ListarEstudiantes }
     * 
     */
    public ListarEstudiantes createListarEstudiantes() {
        return new ListarEstudiantes();
    }

    /**
     * Create an instance of {@link AnadirMatricula }
     * 
     */
    public AnadirMatricula createAnadirMatricula() {
        return new AnadirMatricula();
    }

    /**
     * Create an instance of {@link GetMatriculas }
     * 
     */
    public GetMatriculas createGetMatriculas() {
        return new GetMatriculas();
    }

    /**
     * Create an instance of {@link ListarProgramas }
     * 
     */
    public ListarProgramas createListarProgramas() {
        return new ListarProgramas();
    }

    /**
     * Create an instance of {@link ActualizarEstudiantePorCodigo }
     * 
     */
    public ActualizarEstudiantePorCodigo createActualizarEstudiantePorCodigo() {
        return new ActualizarEstudiantePorCodigo();
    }

    /**
     * Create an instance of {@link BuscarMatricula }
     * 
     */
    public BuscarMatricula createBuscarMatricula() {
        return new BuscarMatricula();
    }

    /**
     * Create an instance of {@link AnadirEstudiante }
     * 
     */
    public AnadirEstudiante createAnadirEstudiante() {
        return new AnadirEstudiante();
    }

    /**
     * Create an instance of {@link ListarMatriculasResponse }
     * 
     */
    public ListarMatriculasResponse createListarMatriculasResponse() {
        return new ListarMatriculasResponse();
    }

    /**
     * Create an instance of {@link BuscarEstudiantePorCodigo }
     * 
     */
    public BuscarEstudiantePorCodigo createBuscarEstudiantePorCodigo() {
        return new BuscarEstudiantePorCodigo();
    }

    /**
     * Create an instance of {@link GetMatriculasResponse }
     * 
     */
    public GetMatriculasResponse createGetMatriculasResponse() {
        return new GetMatriculasResponse();
    }

    /**
     * Create an instance of {@link CargarDatosMatricula }
     * 
     */
    public CargarDatosMatricula createCargarDatosMatricula() {
        return new CargarDatosMatricula();
    }

    /**
     * Create an instance of {@link CargarDatosPrograma }
     * 
     */
    public CargarDatosPrograma createCargarDatosPrograma() {
        return new CargarDatosPrograma();
    }

    /**
     * Create an instance of {@link ListarMatriculas }
     * 
     */
    public ListarMatriculas createListarMatriculas() {
        return new ListarMatriculas();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link Matricula }
     * 
     */
    public Matricula createMatricula() {
        return new Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatosPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "cargarDatosPrograma")
    public JAXBElement<CargarDatosPrograma> createCargarDatosPrograma(CargarDatosPrograma value) {
        return new JAXBElement<CargarDatosPrograma>(_CargarDatosPrograma_QNAME, CargarDatosPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMatriculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "listarMatriculas")
    public JAXBElement<ListarMatriculas> createListarMatriculas(ListarMatriculas value) {
        return new JAXBElement<ListarMatriculas>(_ListarMatriculas_QNAME, ListarMatriculas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEstudiantePorCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "buscarEstudiantePorCodigo")
    public JAXBElement<BuscarEstudiantePorCodigo> createBuscarEstudiantePorCodigo(BuscarEstudiantePorCodigo value) {
        return new JAXBElement<BuscarEstudiantePorCodigo>(_BuscarEstudiantePorCodigo_QNAME, BuscarEstudiantePorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatriculasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "getMatriculasResponse")
    public JAXBElement<GetMatriculasResponse> createGetMatriculasResponse(GetMatriculasResponse value) {
        return new JAXBElement<GetMatriculasResponse>(_GetMatriculasResponse_QNAME, GetMatriculasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatosMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "cargarDatosMatricula")
    public JAXBElement<CargarDatosMatricula> createCargarDatosMatricula(CargarDatosMatricula value) {
        return new JAXBElement<CargarDatosMatricula>(_CargarDatosMatricula_QNAME, CargarDatosMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProgramas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "listarProgramas")
    public JAXBElement<ListarProgramas> createListarProgramas(ListarProgramas value) {
        return new JAXBElement<ListarProgramas>(_ListarProgramas_QNAME, ListarProgramas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstudiantePorCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "actualizarEstudiantePorCodigo")
    public JAXBElement<ActualizarEstudiantePorCodigo> createActualizarEstudiantePorCodigo(ActualizarEstudiantePorCodigo value) {
        return new JAXBElement<ActualizarEstudiantePorCodigo>(_ActualizarEstudiantePorCodigo_QNAME, ActualizarEstudiantePorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "buscarMatricula")
    public JAXBElement<BuscarMatricula> createBuscarMatricula(BuscarMatricula value) {
        return new JAXBElement<BuscarMatricula>(_BuscarMatricula_QNAME, BuscarMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnadirEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "anadirEstudiante")
    public JAXBElement<AnadirEstudiante> createAnadirEstudiante(AnadirEstudiante value) {
        return new JAXBElement<AnadirEstudiante>(_AnadirEstudiante_QNAME, AnadirEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMatriculasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "listarMatriculasResponse")
    public JAXBElement<ListarMatriculasResponse> createListarMatriculasResponse(ListarMatriculasResponse value) {
        return new JAXBElement<ListarMatriculasResponse>(_ListarMatriculasResponse_QNAME, ListarMatriculasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEstudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "listarEstudiantes")
    public JAXBElement<ListarEstudiantes> createListarEstudiantes(ListarEstudiantes value) {
        return new JAXBElement<ListarEstudiantes>(_ListarEstudiantes_QNAME, ListarEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnadirMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "anadirMatricula")
    public JAXBElement<AnadirMatricula> createAnadirMatricula(AnadirMatricula value) {
        return new JAXBElement<AnadirMatricula>(_AnadirMatricula_QNAME, AnadirMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatriculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "getMatriculas")
    public JAXBElement<GetMatriculas> createGetMatriculas(GetMatriculas value) {
        return new JAXBElement<GetMatriculas>(_GetMatriculas_QNAME, GetMatriculas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPorCodigoEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "eliminarPorCodigoEstudiante")
    public JAXBElement<EliminarPorCodigoEstudiante> createEliminarPorCodigoEstudiante(EliminarPorCodigoEstudiante value) {
        return new JAXBElement<EliminarPorCodigoEstudiante>(_EliminarPorCodigoEstudiante_QNAME, EliminarPorCodigoEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstudiantesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "getEstudiantesResponse")
    public JAXBElement<GetEstudiantesResponse> createGetEstudiantesResponse(GetEstudiantesResponse value) {
        return new JAXBElement<GetEstudiantesResponse>(_GetEstudiantesResponse_QNAME, GetEstudiantesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "getEstudiantes")
    public JAXBElement<GetEstudiantes> createGetEstudiantes(GetEstudiantes value) {
        return new JAXBElement<GetEstudiantes>(_GetEstudiantes_QNAME, GetEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProgramasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "listarProgramasResponse")
    public JAXBElement<ListarProgramasResponse> createListarProgramasResponse(ListarProgramasResponse value) {
        return new JAXBElement<ListarProgramasResponse>(_ListarProgramasResponse_QNAME, ListarProgramasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPorNumeroMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "eliminarPorNumeroMatricula")
    public JAXBElement<EliminarPorNumeroMatricula> createEliminarPorNumeroMatricula(EliminarPorNumeroMatricula value) {
        return new JAXBElement<EliminarPorNumeroMatricula>(_EliminarPorNumeroMatricula_QNAME, EliminarPorNumeroMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEstudiantesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "listarEstudiantesResponse")
    public JAXBElement<ListarEstudiantesResponse> createListarEstudiantesResponse(ListarEstudiantesResponse value) {
        return new JAXBElement<ListarEstudiantesResponse>(_ListarEstudiantesResponse_QNAME, ListarEstudiantesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMatriculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "buscarMatriculaResponse")
    public JAXBElement<BuscarMatriculaResponse> createBuscarMatriculaResponse(BuscarMatriculaResponse value) {
        return new JAXBElement<BuscarMatriculaResponse>(_BuscarMatriculaResponse_QNAME, BuscarMatriculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEstudiantePorCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "buscarEstudiantePorCodigoResponse")
    public JAXBElement<BuscarEstudiantePorCodigoResponse> createBuscarEstudiantePorCodigoResponse(BuscarEstudiantePorCodigoResponse value) {
        return new JAXBElement<BuscarEstudiantePorCodigoResponse>(_BuscarEstudiantePorCodigoResponse_QNAME, BuscarEstudiantePorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "actualizarMatricula")
    public JAXBElement<ActualizarMatricula> createActualizarMatricula(ActualizarMatricula value) {
        return new JAXBElement<ActualizarMatricula>(_ActualizarMatricula_QNAME, ActualizarMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatosEstudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model/", name = "cargarDatosEstudiantes")
    public JAXBElement<CargarDatosEstudiantes> createCargarDatosEstudiantes(CargarDatosEstudiantes value) {
        return new JAXBElement<CargarDatosEstudiantes>(_CargarDatosEstudiantes_QNAME, CargarDatosEstudiantes.class, null, value);
    }

}
