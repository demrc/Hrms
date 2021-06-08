package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {
	Image getById(int id);
	List<Image> getByJobSeekerId(int id);
}
