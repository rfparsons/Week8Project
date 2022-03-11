/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Bobby
 *
 */
@Entity
public class Computer {
	@Id
	@GeneratedValue
	int id;
	String hostname;
	String cpu;
	String gpu;
	double ramGB;
	/**
	 * 
	 */
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param hostname
	 * @param cpu
	 * @param gpu
	 * @param ramGB
	 */
	public Computer(String hostname, String cpu, String gpu, double ramGB) {
		super();
		this.hostname = hostname;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ramGB = ramGB;
	}
	/**
	 * @param id
	 * @param hostname
	 * @param cpu
	 * @param gpu
	 * @param ramGB
	 */
	public Computer(int id, String hostname, String cpu, String gpu, double ramGB) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ramGB = ramGB;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", hostname=" + hostname + ", cpu=" + cpu + ", gpu=" + gpu + ", ramGB=" + ramGB
				+ "]";
	}
	
	
}
