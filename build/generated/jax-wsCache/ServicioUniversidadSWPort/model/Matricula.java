
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para matricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="matricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cedulaEstudiante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaMatricula" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numCreditos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroMatricula" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ppa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="programa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matricula", propOrder = {
    "cedulaEstudiante",
    "codigoEstudiante",
    "fechaMatricula",
    "numCreditos",
    "numeroMatricula",
    "ppa",
    "programa",
    "valor"
})
public class Matricula {

    protected int cedulaEstudiante;
    protected String codigoEstudiante;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaMatricula;
    protected int numCreditos;
    protected int numeroMatricula;
    protected double ppa;
    protected String programa;
    protected double valor;

    /**
     * Obtiene el valor de la propiedad cedulaEstudiante.
     * 
     */
    public int getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    /**
     * Define el valor de la propiedad cedulaEstudiante.
     * 
     */
    public void setCedulaEstudiante(int value) {
        this.cedulaEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstudiante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * Define el valor de la propiedad codigoEstudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstudiante(String value) {
        this.codigoEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaMatricula.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaMatricula() {
        return fechaMatricula;
    }

    /**
     * Define el valor de la propiedad fechaMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaMatricula(XMLGregorianCalendar value) {
        this.fechaMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad numCreditos.
     * 
     */
    public int getNumCreditos() {
        return numCreditos;
    }

    /**
     * Define el valor de la propiedad numCreditos.
     * 
     */
    public void setNumCreditos(int value) {
        this.numCreditos = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroMatricula.
     * 
     */
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Define el valor de la propiedad numeroMatricula.
     * 
     */
    public void setNumeroMatricula(int value) {
        this.numeroMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad ppa.
     * 
     */
    public double getPpa() {
        return ppa;
    }

    /**
     * Define el valor de la propiedad ppa.
     * 
     */
    public void setPpa(double value) {
        this.ppa = value;
    }

    /**
     * Obtiene el valor de la propiedad programa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * Define el valor de la propiedad programa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrograma(String value) {
        this.programa = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
