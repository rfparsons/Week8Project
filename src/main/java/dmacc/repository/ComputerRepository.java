/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

/**
 * @author Bobby
 *
 */
@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
