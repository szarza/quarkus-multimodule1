package cestel.hermes.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
@Startup
public class ServiceOne {

    private static transient final Logger log = LogManager.getLogger();
    
    void onStart(@Observes StartupEvent ev) {               
        log.info("Service 1 Started");
    }

}
