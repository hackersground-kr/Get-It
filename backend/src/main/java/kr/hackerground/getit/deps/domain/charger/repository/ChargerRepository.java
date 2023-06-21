package kr.hackerground.getit.deps.domain.charger.repository;

import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargerRepository extends JpaRepository<Charger, Long> {
}
