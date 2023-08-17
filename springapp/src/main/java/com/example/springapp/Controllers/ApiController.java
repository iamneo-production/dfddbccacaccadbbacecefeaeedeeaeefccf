
@RestController
public class ApiController{
   @GetMapping("Welcome")
   public String Welcome(){
    return "Welcome String Boot!";
   }
}