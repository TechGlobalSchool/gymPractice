public class Gym {

    public static void main(String[] args) {

        //3 standard members
        for (int i = 0; i < 3; i++) {
            StandardMember member = StandardMember.getStandardMember();
            //scan the member
            member.scanning();
            //let them workout
            member.workingOut("30 minutes");
            //make them buy products
            member.buyingProducts(20.0);
            //print the standard member
            System.out.println(member);
            System.out.println("--------------------------------");
        }

        //3 premium members

        for (int i = 0; i < 3; i++) {
            //scan the member
            //let them workout
            //make them buy products
            //get massage
            //get tanned
            //print the standard member

            System.out.println("--------------------------------");
        }

        //create 5 random members (standard or premium)
        //scan the member (modify)
        //let them workout
        //make them buy products
        //get massage (if it is premium member)
        //get tanned (if it is premium member)
        //print the member
    }
}
