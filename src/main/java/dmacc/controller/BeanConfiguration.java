/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

/**
 * @author Bobby
 *
 */
@Configuration
public class BeanConfiguration {
	public Computer computer() {
		Computer bean = new Computer();
		return bean;
	}
}
