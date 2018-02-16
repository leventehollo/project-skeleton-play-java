package aggregators;

import akka.actor.Props;
import akka.actor.UntypedAbstractActor;
import messages.SearchMessage;
import play.Logger;

public class ClientActor extends UntypedAbstractActor {

  final Logger.ALogger LOG = Logger.of(this.getClass());

  public final static String ACTOR_NAME = "ClientActor";

  public static Props getProps() {
    return Props.create(ClientActor.class);
  }

  @Override
  public void onReceive(Object message) throws Exception {
    LOG.info("Message received in SearchAggregator : {}", message);
  }

}
