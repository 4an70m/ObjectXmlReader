package classes.objects.customobject.element;

import java.util.List;

/**
 * Created by User on 28.11.2017.
 */
public interface DifferableComponent {

     List<DifferableComponent> diff(DifferableComponent differableComponent);

}
