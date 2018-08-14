import javax.jws.WebService;
@WebService(targetNamespace = "http://xs.com/")
public class HelloServiceImpl implements HelloWebService {
    public String sayHello(String name) {
        return "Hi!" + name;
    }
}
