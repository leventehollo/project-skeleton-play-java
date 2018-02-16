package controllers;

import aggregators.ClientActor;
import aggregators.ServerActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.typesafe.config.Config;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

public class ServerController extends Controller {

  final Logger.ALogger LOG = Logger.of(this.getClass());

  private final Config config;

  @javax.inject.Inject
  public ServerController(Config config) {
    this.config = config;
  }

  public Result send()  {
    LOG.info("hello server");
    final ActorSystem actorSystem = ActorSystem.create("clientActor", this.config);
    final ActorRef actor = actorSystem.actorOf(ClientActor.getProps(), ClientActor.ACTOR_NAME);
    actor.tell("Sending test message to searchAggregator",actor);
    return ok();
  }

}
