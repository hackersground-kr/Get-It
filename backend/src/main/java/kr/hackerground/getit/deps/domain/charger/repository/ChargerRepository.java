package kr.hackerground.getit.deps.domain.charger.repository;

import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargerRepository extends JpaRepository<Charger, Long> {
}
