
	/*
		 * Praca domowa:
		 * Stworz klase Zbiornik(nazwa, stan wody, max pojemnosc)
		 * stworz: konstruktor, gety.sety, toString i equals
		 */

public class Tank {
	
	public Tank(String name, int level, double maximal_capacity) {
			super();
			this.name = name;
			this.level = level;
			this.maximal_capacity = maximal_capacity;
		}
	private String name;
	private int level; //chodzilo Ci o poziom wody? 
	private double maximal_capacity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getMaximal_capacity() {
		return maximal_capacity;
	}
	public void setMaximal_capacity(double maximal_capacity) {
		this.maximal_capacity = maximal_capacity;
	}
	@Override
	public String toString() {
		return "Tank [name=" + name + ", level=" + level + ", maximal_capacity=" + maximal_capacity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tank other = (Tank) obj;
		if (level != other.level)
			return false;
		if (Double.doubleToLongBits(maximal_capacity) != Double.doubleToLongBits(other.maximal_capacity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
