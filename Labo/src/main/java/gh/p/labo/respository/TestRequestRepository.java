package gh.p.labo.respository;

import gh.p.labo.entity.TestRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRequestRepository extends JpaRepository<TestRequest, Long> {

}