import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@RequiredArgsConstructor
@Builder  //we want to use a builder to create instances of our class.
public class LaunchEmployee {

	private int id;
	private String name;
	private String city;
	private String age;

}

//LaunchEmployee testWidget = LaunchEmployee.builder()
//.id(1)
//.name("foo")
//.city("Nagpur")
//.age("11")
//.build();

//The main benefit of using the Lombok builder pattern is that
//it can significantly reduce the amount of boilerplate code you need to write.

// object with constructors
//User user1 = new User.UserBuilder("Lokesh", "Gupta")
//.age(30)
//.phone("1234567")
//.address("Fake address 1234")
//.build();


//Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
//System.out.println(task);