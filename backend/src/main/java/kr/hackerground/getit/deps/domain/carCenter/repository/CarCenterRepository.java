package kr.hackerground.getit.deps.domain.carCenter.repository;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCenterRepository extends JpaRepository<CarCenter, Long> {
}
