package jvm;

public class Hero implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3476811262921189788L;
	String name = "";
	int Hp = 0;
	int Mp = 0;

	Hero(String name,int hp,int Mp){
		this.name= name;
		this.Hp = hp;
		this.Mp = Mp;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return hp
	 */
	public int getHp() {
		return Hp;
	}
	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		Hp = hp;
	}
	/**
	 * @return mp
	 */
	public int getMp() {
		return Mp;
	}
	/**
	 * @param mp セットする mp
	 */
	public void setMp(int mp) {
		Mp = mp;
	}
	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
