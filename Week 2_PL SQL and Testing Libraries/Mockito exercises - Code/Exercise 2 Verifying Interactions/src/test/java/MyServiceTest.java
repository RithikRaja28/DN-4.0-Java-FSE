import org.example.ExternalAPI;
import org.example.MyService;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class); // Step 1: Create mock
        MyService service = new MyService(mockApi);            // Inject mock into service

        service.fetchData();                                   // Step 2: Call the method

        verify(mockApi).getData();                             // Step 3: Verify interaction
    }
}