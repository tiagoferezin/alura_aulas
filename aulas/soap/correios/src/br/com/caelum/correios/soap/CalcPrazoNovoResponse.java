
package br.com.caelum.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calcPrazoNovoResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calcPrazoNovoResult"
})
@XmlRootElement(name = "calcPrazoNovoResponse")
public class CalcPrazoNovoResponse {

    @XmlElement(required = true)
    protected CResultado calcPrazoNovoResult;

    /**
     * Obtém o valor da propriedade calcPrazoNovoResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultado }
     *     
     */
    public CResultado getCalcPrazoNovoResult() {
        return calcPrazoNovoResult;
    }

    /**
     * Define o valor da propriedade calcPrazoNovoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultado }
     *     
     */
    public void setCalcPrazoNovoResult(CResultado value) {
        this.calcPrazoNovoResult = value;
    }

}
