package task2.uniqueBooks;

public class Book implements Displayable {
        private String  Name;
        private String Author;

    public Book(){
            this.Name = "TITLE";
            this.Author = "AUTHOR";
        }

    public Book (String Name, String Author){
            this.Name = Name;
            this.Author = Author;
        }

        //GET NAME
        public String getName(){
            return this.Name;
        }

        //GET Author
        public String getAuthor(){
            return this.Author;
        }

        //SET
        public void setName(String BookName){
            this.Name = BookName;
        }
        public void setAuthor(String BookAuthor){
            this.Author = BookAuthor;
        }

        @Override
        public void display() {
            System.out.print("\nTitle: " + this.getName() + '\n' +
                    "Author: " + this.getAuthor());
        }
}
