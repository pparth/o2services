import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class DirectoryServiceSrv extends Service<DirectoryServiceConf> {

    public static void main(String[] args) throws Exception {
        new DirectoryServiceSrv().run(args);
    }

    private DirectoryServiceSrv() {
        super();
    }

    @Override
    public void initialize(Bootstrap<DirectoryServiceConf> directoryServiceConfBootstrap) {

    }

    @Override
    public void run(DirectoryServiceConf directoryServiceConf, Environment environment) throws Exception {

        environment.addResource(new ApplicantRecommendationResource());
        // environment.addHealthCheck(new DatabaseHealthCheck());
    }

}
