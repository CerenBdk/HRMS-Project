package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployerVerificationEmployee;

public interface EmployerVerificationEmployeeDao extends JpaRepository<EmployerVerificationEmployee, Integer>{

}
