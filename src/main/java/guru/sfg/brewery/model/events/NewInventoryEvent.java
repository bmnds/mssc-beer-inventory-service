package guru.sfg.brewery.model.events;

import lombok.NoArgsConstructor;

/**
 * Created by jt on 2019-07-21.
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    private static final long serialVersionUID = 5053104585846961292L;

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
