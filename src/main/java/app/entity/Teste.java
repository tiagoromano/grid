package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TESTE
 * @generated
 */
@Entity
@Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Teste")
public class Teste implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "campo01", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo01;

  /**
  * @generated
  */
  @Column(name = "campo02", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo02;

  /**
  * @generated
  */
  @Column(name = "campo03", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campo03;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_testeSub", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private TesteSub testeSub;

  /**
   * Construtor
   * @generated
   */
  public Teste(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Teste setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém campo01
   * return campo01
   * @generated
   */
  
  public java.lang.String getCampo01(){
    return this.campo01;
  }

  /**
   * Define campo01
   * @param campo01 campo01
   * @generated
   */
  public Teste setCampo01(java.lang.String campo01){
    this.campo01 = campo01;
    return this;
  }

  /**
   * Obtém campo02
   * return campo02
   * @generated
   */
  
  public java.lang.String getCampo02(){
    return this.campo02;
  }

  /**
   * Define campo02
   * @param campo02 campo02
   * @generated
   */
  public Teste setCampo02(java.lang.String campo02){
    this.campo02 = campo02;
    return this;
  }

  /**
   * Obtém campo03
   * return campo03
   * @generated
   */
  
  public java.lang.String getCampo03(){
    return this.campo03;
  }

  /**
   * Define campo03
   * @param campo03 campo03
   * @generated
   */
  public Teste setCampo03(java.lang.String campo03){
    this.campo03 = campo03;
    return this;
  }

  /**
   * Obtém testeSub
   * return testeSub
   * @generated
   */
  
  public TesteSub getTesteSub(){
    return this.testeSub;
  }

  /**
   * Define testeSub
   * @param testeSub testeSub
   * @generated
   */
  public Teste setTesteSub(TesteSub testeSub){
    this.testeSub = testeSub;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Teste object = (Teste)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
