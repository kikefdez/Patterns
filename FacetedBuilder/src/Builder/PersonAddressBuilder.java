package Builder;

import Model.Person;

public class PersonAddressBuilder extends PersonBuilder {
    public PersonAddressBuilder(Person person){
        this.person = person;
    }
    public PersonAddressBuilder at(String street){
        person.setStreet(street);
        return this;
    }
    public PersonAddressBuilder withPostCode(String postCode){
        person.setPostCode(postCode);
        return this;
    }
    public PersonAddressBuilder in(String city){
        person.setCity(city);
        return this;
    }
}
