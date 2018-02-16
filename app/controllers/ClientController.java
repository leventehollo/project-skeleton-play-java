package controllers;

import aggregators.ClientActor;
import aggregators.ServerActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.typesafe.config.Config;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

public class ClientController extends Controller {

  final Logger.ALogger LOG = Logger.of(this.getClass());

  private final Config config;

  @javax.inject.Inject
  public ClientController (Config config) {
    this.config = config;
  }

  public Result send()  {
    LOG.info("hello client");
    final ActorSystem actorSystem = ActorSystem.create("serverActor", this.config);
    final ActorRef actor = actorSystem.actorOf(ServerActor.getProps(), ServerActor.ACTOR_NAME);
    actor.tell("Sending test message to supervisorAggregator",actor);
    return ok();
  }

}
