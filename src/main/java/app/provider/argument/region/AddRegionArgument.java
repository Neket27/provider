package app.provider.argument.region;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddRegionArgument {
    private String name;
    private Integer population;
    private Integer countClients;
}
