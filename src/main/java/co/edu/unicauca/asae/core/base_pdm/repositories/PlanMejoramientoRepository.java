package co.edu.unicauca.asae.core.base_pdm.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unicauca.asae.core.base_pdm.models.PlanMejoramiento;

public interface PlanMejoramientoRepository extends JpaRepository<PlanMejoramiento, String> {

    
    @Override
    default List<PlanMejoramiento> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<PlanMejoramiento> findAll(Sort arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> List<S> findAll(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> List<S> findAll(Example<S> arg0, Sort arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<PlanMejoramiento> findAllById(Iterable<String> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    default PlanMejoramiento getOne(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> List<S> saveAll(Iterable<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> S saveAndFlush(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Page<PlanMejoramiento> findAll(Pageable arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    default void delete(PlanMejoramiento arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    default void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    default void deleteAll(Iterable<? extends PlanMejoramiento> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    default void deleteById(String arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    default boolean existsById(String arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    default Optional<PlanMejoramiento> findById(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> S save(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> long count(Example<S> arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    default <S extends PlanMejoramiento> boolean exists(Example<S> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    default <S extends PlanMejoramiento> Page<S> findAll(Example<S> arg0, Pageable arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlanMejoramiento> Optional<S> findOne(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    String toString();
    
}