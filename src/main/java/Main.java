public class Main {

    public static void main(String[] args) {

        //object
        Player player1;
        player1 = new Player("Rezza", 20, 'L');

        //setter
        //untuk dapat mengedit data private
        player1.setName("Annisa");
        player1.setAge(20);
        player1.setGender('P');

        //getter
        System.out.println(
                "Nama\t\t\t: "+player1.getName()+"\n" +
                "Umur\t\t\t: "+player1.getAge()+"\n" +
                "Jenis Kelamin\t: "+player1.getGender()
        );
    }
}
