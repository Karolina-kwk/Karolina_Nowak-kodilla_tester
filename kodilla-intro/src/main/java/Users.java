public class Users {
    private String name;
    private int age;

    public static void main(String[] args) {
        Users majda = new Users("Majda",32);
        Users dorota = new Users("Dorota",38);
        Users piotr = new Users("Piotr",28);
        Users lubov = new Users("Lubov",27);
        Users justyna = new Users("Justyna",45);

        Users[] users = {majda, dorota, piotr, lubov, justyna};

        int avgAge = 0;
        for (int i=0; i < users.length; i++){
            avgAge += users[i].getAge();
        }
        avgAge = avgAge / users.length;
        System.out.println("Average age is : " +avgAge);
        System.out.println("People with age below average age : ");

        for(int i=0; i<users.length; i++){
            if(users[i].getAge() < avgAge)
                System.out.println(users[i].getName());
        }

    }

    public Users (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }

}

