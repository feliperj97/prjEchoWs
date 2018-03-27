
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Echo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Echo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Echo", propOrder = {
    "frase"
})
public class Echo_Type {

    protected String frase;

    /**
     * Obtém o valor da propriedade frase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrase() {
        return frase;
    }

    /**
     * Define o valor da propriedade frase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrase(String value) {
        this.frase = value;
    }

}
