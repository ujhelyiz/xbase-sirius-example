import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class person {
  public person() {
  }
  
  public person(final Procedure1<person> initializer) {
    initializer.apply(this);
  }
  
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public String fullName() {
    return (this.firstName + this.lastName);
  }
  
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
}
