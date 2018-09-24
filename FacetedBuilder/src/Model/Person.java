package Model;

public class Person {
    //address info
    private String street, postCode, city;
    // employment info
    private String company, position;
    private int income;

    public void setStreet(String street) { this.street = street; }
    public void setPostCode(String postCode) { this.postCode = postCode; }
    public void setCity(String city) { this.city = city; }
    public void setCompany(String company) { this.company = company; }
    public void setPosition(String position) { this.position = position; }
    public void setIncome(int income) { this.income = income; }

    @Override
    public String toString() {
        return "Person {\n" +
                    "\t   street = '" + street + "'\n" +
                    "\t postCode = '" + postCode + "'\n" +
                    "\t     city = '" + city + "'\n" +
                    "\t  company = '" + company + "'\n" +
                    "\t position = '" + position + "'\n" +
                    "\t   income = " + income + "\n" +
                "}";
    }
}
