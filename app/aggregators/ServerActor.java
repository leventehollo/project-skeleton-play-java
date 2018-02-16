package aggregators;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedAbstractActor;
import messages.SearchMessage;
import play.Logger;

public class ServerActor extends UntypedAbstractActor {

  private final Logger.ALogger LOG = Logger.of(this.getClass());

  public final static String ACTOR_NAME = "ServerActor";

  public static Props getProps() {
    return Props.create(ServerActor.class);
  }

    @Override
  public void onReceive(Object message) throws Throwable {
    LOG.info("Message received in SupervisorAggregator : {}", message);
  }
}
