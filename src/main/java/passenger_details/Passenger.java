package passenger_details;


public class Passenger {
    private String title;
    private String name;
    private String id;
    private String phone;
    private Integer age;


    public Passenger(String t,String n,String i,String p,Integer a){

       setTitle(t);
       setName(n);
       setId(i);
       setPhone(p);
       setAge(a);







    }


        /**
         * Getters and Setters
         */

            public String getTitle() {
                return title;
            }

            public void setTitle(String t) {

                if(t== "Mr" || t=="Mrs" || t=="Ms"){
                    this.title = t;
                }
                else{

                    throw new IllegalArgumentException("Title is wrong. Must be either Mr, Mrs or Ms");
                }

            }

            public String getName() {
                return name;
            }

            public void setName(String n) {
                if (n.length()<3){
                    throw new IllegalArgumentException("Name is Incorrect. Must be at least 3 charachters");
                }
                else{
                    this.name = n;
                }

            }

            public String getId() {
                return id;
            }

            public void setId(String i) {
                if (i.length()<10){
                    throw new IllegalArgumentException("ID is incorrect. Must be at least 10 characters long");
                }
                else{
                    this.id = i;
                }

            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String p) {
               p.toString();
                if(p.length()<10){
                    throw new IllegalArgumentException("Phone number must be minimum 10 characters long");
                }
                else{
                    this.phone = p;
                }


            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer a) {

                if(a<16){
                    throw new IllegalArgumentException("Age must be over 16. You can't fly");
                }
                else{
                    this.age = a;
                }
            }
} //End Passenger
