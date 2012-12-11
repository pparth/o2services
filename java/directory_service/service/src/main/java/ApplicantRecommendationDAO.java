import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(ApplicantRecommendationMapper.class)
public interface ApplicantRecommendationDAO {
    @SqlQuery("select * from applicant_recommendations")
    List<ApplicantRecommendation> findAll();

    @SqlUpdate("insert into applicant_recommendations (application, algorithm, annotation, application_score) values (:applicationId, :algorithm, :annotation, :score)")
    int Insert(@Bind("applicationId") long applicationId, @Bind("algorithm") String algorithm, @Bind("annotation") int annotation, @Bind("score") Double score);
}
