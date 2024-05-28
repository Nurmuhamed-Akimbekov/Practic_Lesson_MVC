package peaksoft.servcie.serviceImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.entity.Instructor;
import peaksoft.repository.InstructorRepo;
import peaksoft.servcie.InstructorService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepo instructorRepo;

    @Override
    public void saveInstructor(Instructor instructor) {
        instructorRepo.saveInstructor(instructor);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepo.getInstructorById(id);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepo.getAllInstructors();
    }

    @Override
    public List<Instructor> getAllInstructorsByCourseId(Long courseId) {
        return instructorRepo.getAllInstructorsByCourseId(courseId);
    }

    @Override
    public void updateInstructor(Long insId, Instructor newInstructor) {
        instructorRepo.updateInstructor(insId, newInstructor);
    }

    @Override
    public void deleteById(Long insId) {
        instructorRepo.deleteById(insId);
    }

    @Override
    public void assignInstructorToCompany(Long insId, Long comId) {
        instructorRepo.assignInstructorToCompany(insId, comId);
    }

    @Override
    public void addInstructorToCourse(Long insId, Long courseId) {
        instructorRepo.addInstructorToCourse(insId, courseId);
    }

    @Override
    public List<Instructor> getAllInstructorsByComId(Long comId) {
        return instructorRepo.getAllInstructorsByComId(comId);
    }
}
