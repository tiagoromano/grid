package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TESTESUB
 * @generated
 */
@Entity
@Table(name = "\"TESTESUB\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TesteSub")
public class TesteSub implements Serializable {

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
  @Column(name = "nameSub", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nameSub;

  /**
   * Construtor
   * @generated
   */
  public TesteSub(){
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
  public TesteSub setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nameSub
   * return nameSub
   * @generated
   */
  
  public java.lang.String getNameSub(){
    return this.nameSub;
  }

  /**
   * Define nameSub
   * @param nameSub nameSub
   * @generated
   */
  public TesteSub setNameSub(java.lang.String nameSub){
    this.nameSub = nameSub;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TesteSub object = (TesteSub)obj;
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
