package buddyinfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by adambatson on 2/7/2017.
 */

@RepositoryRestResource(collectionResourceRel = "buddies", path = "buddies/all")
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    //List<BuddyInfo> findAll();
}

