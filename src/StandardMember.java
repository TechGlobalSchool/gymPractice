public class StandardMember extends Member{

    public StandardMember(String firstName, String lastName, String memberId, int age, double height, double weight, String membershipType) {
        super(firstName, lastName, memberId, age, height, weight, membershipType);
    }

    @Override
    public void workingOut(String duration) {
        System.out.println("Standard member is working out for " + duration + ".");
    }

    @Override
    public void scanning() {
        System.out.println("Welcome " + firstName + " " + lastName + "!" +
                "\nMembership type = " + membershipType);
    }

    @Override
    public void buyingProducts(double money) {
        System.out.println("Amount due = " + money +
                "\nYou don't have any discounts!");
    }
}
