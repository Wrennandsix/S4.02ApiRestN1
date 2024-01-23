package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fruits")
public class Fruit {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int quantityKg;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityKg() {
		return quantityKg;
	}

	public void setQuantityKg(int quantityKg) {
		this.quantityKg = quantityKg;
	}
	
	@Override
	public String toString() {
		return "Fruit [id:" + id + ", name:" + name + ", quantityKg:" + quantityKg + "]";
	}

}
