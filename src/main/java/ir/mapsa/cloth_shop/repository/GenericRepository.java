package ir.mapsa.cloth_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
//because its generic and must not define as a bean

public interface GenericRepository<E,PK> extends JpaRepository <E,PK> {
//PagingAndSortingRepository can use(in future) for nosql DBs
// JpaRepository is just for JPA and relational ones and provides JPA related methods such as flushing the persistence
// context and delete records in a batch

}
