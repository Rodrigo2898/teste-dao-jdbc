package model.entities;

import java.io.Serializable;
import java.util.Objects;
                         //Implements Serializable, para que nossos objetos poderem ser transformados 
						//em sequência de bites
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Department() {
	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//HashCode e Equals, para poder comparar por conteúdo, e não pela referência de ponteiros
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	//toString
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
