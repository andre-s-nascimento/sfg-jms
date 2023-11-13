package guru.springframework.sfgjms.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

  @Serial private static final long serialVersionUID = 9054041690454724442L;

  private UUID id;
  private String message;
}
