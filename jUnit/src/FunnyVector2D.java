import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by salavatshirgaleev on 18.02.16.
 */
public class FunnyVector2D {
    public static void main(String[] args) {
        Vector2D v2 = new Vector2D(3,2);
        Vector2D vector2D = mock(Vector2D.class);
        when(vector2D.getX()).thenReturn(3.0);
        when(vector2D.getY()).thenReturn(5.0);

    }
}
