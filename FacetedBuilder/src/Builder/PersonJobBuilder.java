package Builder;

import Model.Person;

public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person){
        this.person = person;
    }
    public PersonJobBuilder at(String company){
        person.setCompany(company);
        return this;
    }
    public PersonJobBuilder as(String position){
        person.setPosition(position);
        return this;
    }
    public PersonJobBuilder earing(int income){
        person.setIncome(income);
        return this;
    }
}
