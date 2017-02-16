package buddyinfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by adambatson on 2/16/2017.
 */
@RepositoryRestResource(collectionResourceRel = "books", path = "books/all")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {
}
