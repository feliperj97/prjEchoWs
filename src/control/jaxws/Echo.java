
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Echo", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Echo", namespace = "http://control/")
public class Echo {

    @XmlElement(name = "frase", namespace = "")
    private String frase;

    /**
     * 
     * @return
     *     returns String
     */
    public String getFrase() {
        return this.frase;
    }

    /**
     * 
     * @param frase
     *     the value for the frase property
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }

}
