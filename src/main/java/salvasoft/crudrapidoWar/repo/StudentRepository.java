package salvasoft.crudrapidoWar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salvasoft.crudrapidoWar.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
