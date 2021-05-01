package kodlamaio;

public class User {
        private int Id;
        private String Name;
        private String LastName;
        private String Email;
        private String Password;
        
        public int getId() {
        	return Id;
        }
        public void setId(int id) {
        	Id=id;
        }
        
        public String getName() {
        	return Name;
        }
        public void setName(String name) {
        	Name=name;
        }
        
        public String getLastName() {
        	return LastName;
        }
        public void setLastName(String lastname) {
        	LastName=lastname;
        }
        
        public String getEmail() {
        	return Email;
        }
        public void setEmail(String email) {
        	Email=email;
        }
        
        public String getPassword() {
        	return Password;
        }
        public void setPassword(String password) {
        	Password=password;
        }
}
