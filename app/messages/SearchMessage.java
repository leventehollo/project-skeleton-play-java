package messages;

import java.io.Serializable;
import java.time.LocalDate;

public class SearchMessage implements Serializable {

  private final LocalDate date;
  private final String from;
  private final String to;

  public SearchMessage(LocalDate date, String from, String to) {
    this.date = date;
    this.from = from;
    this.to = to;
  }

  public LocalDate getDate() {
    return date;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }
}
