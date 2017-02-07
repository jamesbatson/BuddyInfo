package buddyinfo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by adambatson on 2/7/2017.
 */
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    //List<BuddyInfo> findAll();
}

